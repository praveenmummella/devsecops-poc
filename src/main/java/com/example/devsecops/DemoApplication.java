package com.example.devsecops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTest {

    @Test
    void contextLoads() {
        // Verify Spring context starts
    }

    @Test
    void mainMethodRuns() {
        DemoApplication.main(new String[]{});
    }
}
