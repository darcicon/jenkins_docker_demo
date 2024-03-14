FROM openjdk:21-slim
EXPOSE 8080
ADD target/*.jar jenkins-docker-test.jar
ENTRYPOINT ["java","-jar","/jenkins-docker-test.jar"]