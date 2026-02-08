# Use a suitable base image for your Java version
FROM openjdk:17.0.1-jdk-slim
ENV JAVA_HOME=/home/services/servertools/jdk17/bin/java
#Work directory
WORKDIR /app
#ARG JAR_FILE=target/k8smsgereceiver-1.jar
#COPY ${JAR_FILE} k8smsgereceiver-1.jar
# Copy your application JAR file into the container
COPY target/properties-1.jar /app/properties-1.jar
ENTRYPOINT ["java","-jar","/app/properties-1.jar"]
EXPOSE 8085
# Expose the port your Spring Boot app listens on