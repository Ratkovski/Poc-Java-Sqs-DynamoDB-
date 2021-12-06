FROM openjdk:11
MAINTAINER "Ratkovski"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]
EXPOSE 8080