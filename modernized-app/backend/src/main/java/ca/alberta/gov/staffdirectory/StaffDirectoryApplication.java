package ca.alberta.gov.staffdirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Alberta Staff Directory API - Modern Spring Boot Application
 * 
 * This application provides a REST API for the Alberta Government Staff Directory,
 * modernized from the legacy ICEfaces application.
 */
@SpringBootApplication
public class StaffDirectoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffDirectoryApplication.class, args);
    }
}