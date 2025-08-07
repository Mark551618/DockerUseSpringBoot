FROM openjdk:21-jdk-slim

ENV JAR_NAME=app.jar
WORKDIR /app

COPY target/app.jar $JAR_NAME

ENTRYPOINT ["java", "-jar", "app.jar"]