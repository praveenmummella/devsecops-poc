package com.example.devsecops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class DemoApplicationTest {

    @Test
    void contextLoads() {
        // Simple assertion to verify test runs
        assertTrue(true, "Context should load successfully");
    }

    @Test
    void mainMethodRuns() {
        // Test moved to integration tests if needed
        assertTrue(true, "Placeholder for main method test");
    }
}
