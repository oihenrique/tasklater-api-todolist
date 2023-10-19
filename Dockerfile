FROM openjdk:17
ADD ./docker-tasklater.jar docker-tasklater.jar
ENTRYPOINT ["java", "-jar", "app.jar" ]
