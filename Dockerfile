# Use Amazon Corretto 17 as base image
FROM amazoncorretto:17-alpine3.18

# Set working directory
WORKDIR /app

# Copy the built JAR file (change the name to match your pom.xml)
COPY target/devsecops-poc-*.jar app.jar

# Expose port (matches application.properties)
EXPOSE 8080

# Set health check (matches your actuator endpoint)
HEALTHCHECK --interval=30s --timeout=3s \
  CMD curl -f http://localhost:8080/health || exit 1

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
