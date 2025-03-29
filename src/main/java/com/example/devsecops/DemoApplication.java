package com.example.devsecops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTest {
    @Test
    void contextLoads() {
        // Test passes if Spring context loads
    }
}
