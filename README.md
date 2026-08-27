# Spring Boot Student REST API

A simple REST API built using **Spring Boot, Spring MVC, Spring JDBC, and MySQL**.  
The project implements CRUD operations for student records using a layered architecture.

## Tech Stack

- Java 21
- Spring Boot
- Spring MVC
- Spring JDBC / JdbcTemplate
- MySQL
- Gradle
- REST API

## Project Architecture

The application follows a layered architecture:

```text
Client
  ↓
Controller
  ↓
Service
  ↓
DAO
  ↓
MySQL Database
````

### Layers

* **Controller** – Handles HTTP requests and REST API endpoints.
* **Service** – Acts as an intermediate layer between the controller and DAO.
* **DAO** – Performs database operations using `JdbcTemplate`.
* **Model** – Represents the student data.

## Features

* Create a student record
* Retrieve all student records
* Retrieve a student by ID
* Update a student record
* Delete a student record
* MySQL database integration
* CRUD operations using `JdbcTemplate`
* Layered Controller-Service-DAO architecture
* RESTful API endpoints

## API Endpoints

The Student API uses the base path:

```text
/api/student
```

| Method   | Endpoint            | Description                |
| -------- | ------------------- | -------------------------- |
| `POST`   | `/api/student`      | Create a new student       |
| `GET`    | `/api/student`      | Get all students           |
| `GET`    | `/api/student/{id}` | Get a student by ID        |
| `PUT`    | `/api/student`      | Update an existing student |
| `DELETE` | `/api/student/{id}` | Delete a student by ID     |
| `GET`    | `/home`             | Test/home endpoint         |

## Example Requests

### Create Student

```http
POST http://localhost:8080/api/student
Content-Type: application/json
```

Example request body:

```json
{
  "id": 101,
  "uname": "Arpan",
  "uphy": "85",
  "uche": "90",
  "umath": "88"
}
```

The API returns the created student with HTTP status:

```text
201 CREATED
```

### Get All Students

```http
GET http://localhost:8080/api/student
```

Returns all student records from the database.

### Get Student by ID

```http
GET http://localhost:8080/api/student/101
```

Returns the student with the specified ID.

If the student does not exist, the API returns:

```text
404 NOT FOUND
```

### Update Student

```http
PUT http://localhost:8080/api/student
Content-Type: application/json
```

Example request body:

```json
{
  "id": 101,
  "uname": "Arpan Patel",
  "uphy": "90",
  "uche": "92",
  "umath": "95"
}
```

### Delete Student

```http
DELETE http://localhost:8080/api/student/101
```

If the student exists, the API returns:

```text
204 NO CONTENT
```

If the student does not exist:

```text
404 NOT FOUND
```

## Database

The application uses **MySQL** and the Spring `JdbcTemplate` for database operations.

The current implementation works with the following table structure:

```text
insmarks
├── urno
├── uname
├── uphy
├── uche
└── umath
```

Database credentials are intentionally not included in this repository.

Configure your local database connection in:

```text
src/main/resources/application.properties
```

Example:

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

Open the project using IntelliJ IDEA, Eclipse, or another Java IDE.

### 3. Configure MySQL

Create the required MySQL database and table.

Then update:

```text
src/main/resources/application.properties
```

with your local database credentials.

### 4. Run the application

Using Gradle:

```bash
./gradlew bootRun
```

On Windows:

```bash
gradlew.bat bootRun
```

You can also run the main Spring Boot application class directly from your IDE.

## Testing the API

The API can be tested using:

* Postman
* Insomnia
* cURL
* Any REST API client

Example:

```http
GET http://localhost:8080/api/student
```

## HTTP Status Codes Used

| Status Code      | Meaning                         |
| ---------------- | ------------------------------- |
| `200 OK`         | Request completed successfully  |
| `201 CREATED`    | Student successfully created    |
| `204 NO CONTENT` | Student successfully deleted    |
| `404 NOT FOUND`  | Requested student was not found |

## Learning Objectives

This project was created to practice:

* Spring Boot application development
* Spring MVC
* REST API development
* HTTP methods
* REST endpoints
* Dependency Injection
* Controller-Service-DAO architecture
* Spring `JdbcTemplate`
* MySQL connectivity
* CRUD operations
* Gradle project management
* `ResponseEntity`
* HTTP status codes

## Future Improvements

Possible improvements include:

* Global exception handling using `@ControllerAdvice`
* Request validation using Bean Validation
* DTO implementation
* Better error responses
* `ResponseEntity` improvements
* Pagination and sorting
* Swagger/OpenAPI documentation
* Unit and integration testing
* Authentication and authorization using Spring Security
* Environment-based database configuration

## Author

**Arpan Patel**

This project is part of my Java and Spring development practice, focused on building backend applications and strengthening my understanding of Spring Boot, Spring MVC, REST APIs, JDBC, and MySQL.
