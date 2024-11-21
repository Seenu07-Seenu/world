FROM eclipse-temurin:17
COPY target/oneworld.jar oneworld.jar
CMD ["java", "-jar", "oneworld.jar"]