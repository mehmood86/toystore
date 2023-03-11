# Java Maven Spring Boot Project - Toy Store

This is a Java Maven Spring Boot project that simulates an online toy store. The project contains the following features:

- Rest endpoints to get product information as JSON


## Installation

To run this project, you need to have Java 17 and Maven installed on your machine. You also need to have MySQL and MySQL Workbench installed to set up the database.

### MySQL and MySQL Workbench Installation

You can download MySQL and MySQL Workbench from the official website: [https://www.mysql.com/downloads/](https://www.mysql.com/downloads/).

Follow the instructions to install MySQL and MySQL Workbench on your machine.

## Usage

To use this project, you need to clone the source code from the GitHub repository:

```bash
git clone https://github.com/mehmood86/toystore.git
```
Then, navigate to the project directory and build the project using Maven:

```bash
cd toystore
mvn clean install
```
This will build the project and create a JAR file in the target directory.

To run the project, use the following command:

```bash
Copy code
java -jar target/toystore-0.0.1-SNAPSHOT.jar
```

The project will start and you can access it in your web browser at http://localhost:8080/.

Configuration
You can configure the project by modifying the application.properties file located in the src/main/resources directory. In this file, you can change the database settings, server port, and other properties.

Credits
This project was created by Mehmood Ghaffar. If you have any questions or suggestions, please feel free to contact me at engr_mehmood86@hotmail.com.
