FROM openjdk:11-jdk
EXPOSE 8080
CMD ["./mvnw", "clean", "package"]
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]