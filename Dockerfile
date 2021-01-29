#
# Build stage
#
FROM maven:3.5-jdk-8 AS build
COPY src src
COPY pom.xml pom.xml
RUN mvn -f pom.xml clean package

# Package stage
#
FROM openjdk:8
COPY --from=build /target/satellite-location-user-0.0.1-SNAPSHOT.jar /usr/local/lib/satellite-location-user.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/usr/local/lib/satellite-location-user.jar"]


