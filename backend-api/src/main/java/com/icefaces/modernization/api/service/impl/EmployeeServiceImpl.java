package com.icefaces.modernization.api.service.impl;

import com.icefaces.modernization.api.dto.EmployeeDto;
import com.icefaces.modernization.api.dto.EmployeeSalaryStatisticsDto;
import com.icefaces.modernization.api.dto.EmployeeStatisticsDto;
import com.icefaces.modernization.api.dto.SalaryRangeCountDto;
import com.icefaces.modernization.api.entity.Employee;
import com.icefaces.modernization.api.repository.EmployeeRepository;
import com.icefaces.modernization.api.service.EmployeeService;
import com.icefaces.modernization.api.util.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Implementation of EmployeeService
 * Replaces business logic from ICEfaces managed beans:
 * - org.icefaces.samples.showcase.example.compat.series.SeriesBean
 * - HR-related form and data management beans
 * - Employee chart and reporting beans
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EmployeeDto> getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .map(employeeMapper::toDto);
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.toEntity(employeeDto);
        employee.setId(null); // Ensure new entity
        Employee savedEmployee = employeeRepository.save(employee);
        return employeeMapper.toDto(savedEmployee);
    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        return employeeRepository.findById(id)
                .map(existingEmployee -> {
                    Employee updatedEmployee = employeeMapper.toEntity(employeeDto);
                    updatedEmployee.setId(id);
                    return employeeMapper.toDto(employeeRepository.save(updatedEmployee));
                })
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> searchEmployeesByLastName(String lastName) {
        return employeeRepository.findByLastNameContainingIgnoreCase(lastName).stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> searchEmployeesByFirstName(String firstName) {
        return employeeRepository.findByFirstNameContainingIgnoreCase(firstName).stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> searchEmployeesByFullName(String fullName) {
        return employeeRepository.findByFullNameContaining(fullName).stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> getEmployeesBySalaryRange(Integer minSalary, Integer maxSalary) {
        return employeeRepository.findBySalaryBetween(minSalary, maxSalary).stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> getHighEarners(Integer minSalary) {
        return employeeRepository.findBySalaryGreaterThanEqual(minSalary).stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> searchEmployeesByAddress(String addressText) {
        return employeeRepository.findByAddressContainingIgnoreCase(addressText).stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> getEmployeesOrderedBySalary() {
        return employeeRepository.findAllByOrderBySalaryDesc().stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> getEmployeesOrderedByName() {
        return employeeRepository.findAllByOrderByLastNameAscFirstNameAsc().stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> searchEmployees(String firstName, String lastName, 
                                           Integer minSalary, Integer maxSalary) {
        return employeeRepository.findByMultipleCriteria(firstName, lastName, minSalary, maxSalary).stream()
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public EmployeeSalaryStatisticsDto getSalaryStatistics() {
        List<Employee> employees = employeeRepository.findAll();
        
        if (employees.isEmpty()) {
            return new EmployeeSalaryStatisticsDto(0.0, 0.0, 0.0, 0.0, 0L);
        }

        List<Integer> salaries = employees.stream()
                .map(Employee::getSalary)
                .sorted()
                .collect(Collectors.toList());

        double averageSalary = salaries.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        double medianSalary = calculateMedian(salaries);
        double minSalary = salaries.get(0);
        double maxSalary = salaries.get(salaries.size() - 1);
        long totalEmployees = employees.size();

        return new EmployeeSalaryStatisticsDto(averageSalary, medianSalary, minSalary, maxSalary, totalEmployees);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDto> getTopEarners(int limit) {
        return employeeRepository.findTopByOrderBySalaryDesc().stream()
                .limit(limit)
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<SalaryRangeCountDto> getEmployeeCountBySalaryRanges() {
        List<Employee> employees = employeeRepository.findAll();
        
        // Define salary ranges
        List<SalaryRangeCountDto> ranges = Arrays.asList(
            new SalaryRangeCountDto("0-40k", 0, 40000, 0L),
            new SalaryRangeCountDto("40k-60k", 40000, 60000, 0L),
            new SalaryRangeCountDto("60k-80k", 60000, 80000, 0L),
            new SalaryRangeCountDto("80k-100k", 80000, 100000, 0L),
            new SalaryRangeCountDto("100k+", 100000, Integer.MAX_VALUE, 0L)
        );

        // Count employees in each range
        return ranges.stream()
                .map(range -> {
                    long count = employees.stream()
                            .filter(emp -> emp.getSalary() >= range.getMinSalary() && 
                                         emp.getSalary() < range.getMaxSalary())
                            .count();
                    return new SalaryRangeCountDto(range.getRangeName(), 
                                                 range.getMinSalary(), 
                                                 range.getMaxSalary(), 
                                                 count);
                })
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public EmployeeStatisticsDto getEmployeeStatistics() {
        List<Employee> employees = employeeRepository.findAll();
        
        if (employees.isEmpty()) {
            return new EmployeeStatisticsDto(0L, 0.0, 0L, 0L);
        }

        long totalEmployees = employees.size();
        double averageSalary = employees.stream().mapToInt(Employee::getSalary).average().orElse(0.0);
        
        // Count distinct cities from addresses (simplified)
        long distinctCities = employees.stream()
                .map(emp -> extractCityFromAddress(emp.getAddress()))
                .distinct()
                .count();
        
        // Count high earners (above 80k)
        long highEarners = employees.stream()
                .filter(emp -> emp.getSalary() > 80000)
                .count();

        return new EmployeeStatisticsDto(totalEmployees, averageSalary, distinctCities, highEarners);
    }

    /**
     * Calculate median from sorted list of salaries
     */
    private double calculateMedian(List<Integer> sortedSalaries) {
        int size = sortedSalaries.size();
        if (size % 2 == 0) {
            return (sortedSalaries.get(size / 2 - 1) + sortedSalaries.get(size / 2)) / 2.0;
        } else {
            return sortedSalaries.get(size / 2);
        }
    }

    /**
     * Extract city name from address string (simplified implementation)
     */
    private String extractCityFromAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            return "Unknown";
        }
        // Simple extraction - split by comma and take second part
        String[] parts = address.split(",");
        return parts.length > 1 ? parts[1].trim() : "Unknown";
    }
}