@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)  // Fixed port for DAST
class HelloControllerTest {
  
  @LocalServerPort
  private int port;  // Will use 5000 from application.properties

  @Test
  void healthCheck() {
    given()
      .port(port)
      .when().get("/health")
      .then().statusCode(200);
  }
}
