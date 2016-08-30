FROM openjdk:8

ADD sample.jar /opt/app/sample.jar

WORKDIR /opt/app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/app/sample.jar"]
