# Spring Boot Student REST API

A simple REST API built using **Spring Boot, Spring MVC, JDBC Template, and MySQL**.  
This project demonstrates the implementation of a basic CRUD-based backend application using a layered architecture.

## Tech Stack

- Java 21
- Spring Boot
- Spring MVC
- Spring JDBC / JdbcTemplate
- MySQL
- Gradle
- REST API

## Project Structure

The project follows a layered architecture:

```text
Controller
    ↓
Service
    ↓
DAO
    ↓
MySQL Database
````

### Layers

* **Controller** – Handles HTTP requests and API endpoints.
* **Service** – Contains business logic.
* **DAO** – Handles database operations using `JdbcTemplate`.
* **Model** – Represents the `Student` entity.

## Features

* Create a student
* Retrieve student details
* Retrieve all students
* Update student details
* Delete a student
* MySQL database integration
* RESTful API endpoints
* Layered architecture using Controller, Service, and DAO

## API Endpoints

| Method   | Endpoint         | Description                |
| -------- | ---------------- | -------------------------- |
| `GET`    | `/students`      | Get all students           |
| `GET`    | `/students/{id}` | Get a student by ID        |
| `POST`   | `/students`      | Create a new student       |
| `PUT`    | `/students/{id}` | Update an existing student |
| `DELETE` | `/students/{id}` | Delete a student           |

## Database Configuration

The application uses MySQL.

For security reasons, database credentials are **not included in this repository**.

Configure your local `application.properties` with your own database details:

```properties
spring.application.name=REST_API

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://YOUR_DATABASE_NAME
spring.datasource.username=YOUR_SQL_USERNAME
spring.datasource.password=YOUR_SQL_PASSWORD
```

Replace the placeholder values with your local MySQL configuration.

## Running the Project

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/spring-boot-student-rest-api.git
```

### 2. Open the project

Open the project in IntelliJ IDEA, Eclipse, or another Java IDE.

### 3. Configure MySQL

Create the required database and configure the database connection in:

```text
src/main/resources/application.properties
```

### 4. Run the application

Using Gradle:

```bash
./gradlew bootRun
```

On Windows:

```bash
gradlew.bat bootRun
```

Or run the main Spring Boot application class directly from your IDE.

## Testing the API

The endpoints can be tested using tools such as:

* Postman
* Insomnia
* cURL
* Any REST API client

Example:

```http
GET http://localhost:8080/students
```

## Learning Objectives

This project was created to practice and understand:

* Spring Boot application structure
* Spring MVC
* REST API development
* HTTP methods and status codes
* Dependency Injection
* Layered architecture
* DAO and Service patterns
* JdbcTemplate
* MySQL database connectivity
* CRUD operations
* Gradle project management

## Future Improvements

Possible improvements include:

* Exception handling using `@ControllerAdvice`
* Request validation using Bean Validation
* DTO implementation
* Proper HTTP response handling with `ResponseEntity`
* Pagination and sorting
* API documentation using Swagger/OpenAPI
* Unit and integration testing
* Authentication and authorization using Spring Security

## Author

**Arpan**

This project is part of my Java and Spring development practice, focused on building backend applications and strengthening my understanding of Spring Boot and REST APIs.

```
```
