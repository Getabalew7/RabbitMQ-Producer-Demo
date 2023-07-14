# RabbitMQ Message Producer
This project is a Java application that demonstrates how to create a RabbitMQ message producer. The application sends messages to a RabbitMQ exchange, which can then be consumed by one or more message consumers.
Prerequisites
Before running the application, you need to have the following installed:

1. Java Development Kit (JDK) 17 or later 
2. Apache Maven 3.6 or later
3. RabbitMQ broker

## Getting Started
To get started with the application, follow these steps:

1.  Clone the repository to your local machine. 
2. Open a terminal or command prompt and navigate to the project directory. 
3. Build Docker image using 
     ```docker build -t <iamge-name> .```
4. Start the RabbitMQ broker. 
5. Start the Docker Image using the following command: ```docker run -d -p 9090:9090 <image-name>```

## Usage
Once the application is running, it will start sending messages to the RabbitMQ exchange. You can verify that the messages are being sent by checking the RabbitMQ management console.