package com.example.devsecops;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTest {

    @Autowired
    private ApplicationContext context;

    /**
     * Tests if the Spring application context loads successfully
     */
    @Test
    void contextLoads() {
        assertNotNull(context, "Application context should not be null");
    }

    /**
     * Tests the main method execution
     */
    @Test
    void mainMethodRuns() {
        assertDoesNotThrow(() -> DemoApplication.main(new String[]{}),
            "Main method should run without exceptions");
    }
}
