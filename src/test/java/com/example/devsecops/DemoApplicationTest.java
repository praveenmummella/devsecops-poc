package com.example.devsecops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTest {

    /**
     * Tests if the Spring application context loads successfully
     */
    @Test
    void contextLoads() {
        // This test will pass if the Spring context loads
        // No assertion needed for basic context loading test
    }

    /**
     * Tests the main method execution
     */
    @Test
    void mainMethodRuns() {
        // Verify the application can start
        DemoApplication.main(new String[]{});
    }
}
