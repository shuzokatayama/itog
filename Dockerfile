FROM openjdk:8-alpine

COPY target/uberjar/itog.jar /itog/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/itog/app.jar"]
