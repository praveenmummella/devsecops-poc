@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@DirtiesContext
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloEndpoint_ReturnsCorrectMessage() throws Exception {
        mockMvc.perform(get("/hello"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello from DevSecOps POC!"));
    }
}
