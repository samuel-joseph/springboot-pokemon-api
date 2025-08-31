# Start with a Maven image to build the app
FROM maven:3.8.6-openjdk-17 AS build

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Now use a smaller image to run the app
FROM openjdk:17-jdk-slim
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
