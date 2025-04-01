@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class DemoApplicationTest {
    
    @Test
    void contextLoads() {
        // Simple test to verify context loads
        assertTrue(true);
    }

    @Test
    void mainMethodRuns() {
        assertDoesNotThrow(() -> DemoApplication.main(new String[]{}));
    }
}
