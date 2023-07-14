FROM openjdk:17-jdk-alpine

#install maven
RUN apk add --no-cache maven

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package -DskipTests

EXPOSE 9090

CMD ["java", "-jar","target/RabbitMQ-Producer-Demo-0.0.1-SNAPSHOT.jar"]