FROM openjdk:11-jre-slim
COPY target/*.jar /home/app/demoapi.jar
ENTRYPOINT [ "java", "-jar", "/home/app/demoapi.jar" ]