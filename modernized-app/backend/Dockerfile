FROM openjdk:17-jre-slim

# Set working directory
WORKDIR /app

# Copy the JAR file
COPY target/staff-directory-api-1.0.0.jar app.jar

# Expose port
EXPOSE 8080

# Health check
HEALTHCHECK --interval=30s --timeout=10s --start-period=30s --retries=3 \
  CMD curl -f http://localhost:8080/api/system/health || exit 1

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=docker"]