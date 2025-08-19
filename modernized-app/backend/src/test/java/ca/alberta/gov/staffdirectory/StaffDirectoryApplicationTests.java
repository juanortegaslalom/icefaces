package ca.alberta.gov.staffdirectory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Basic integration test to verify Spring Boot application context loads
 */
@SpringBootTest
@ActiveProfiles("test")
class StaffDirectoryApplicationTests {

    @Test
    void contextLoads() {
        // This test will verify that the Spring Boot application context loads successfully
        // and all beans are properly configured
    }
}