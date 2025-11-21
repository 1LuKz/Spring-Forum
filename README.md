# Spring Forum – REST API with Spring Boot

This project is a REST API built with Java and Spring Boot, simulating a simple forum system. It allows user registration, post creation, and comment insertion, all integrated with a MongoDB database.
It is ideal for study purposes, showcasing backend development skills, and serving as a foundation for larger applications.

## Features

- Create, update, list, and delete users
- Create and retrieve posts
- Associate posts with users
- Add comments to posts
- Search posts by title
- Clean architecture using:
    - Controllers
    - Services
    - Repositories
    - DTOs
    - Custom exceptions

## Technologies Used

- Java 21
- Spring Boot
- Spring Data MongoDB
- Maven
- MongoDB
- REST API

## Project Architecture

The API follows a clear layered structure:

```
Controller → Service → Repository → MongoDB
```

### Models (Entities)

- User
- Post
- CommentDTO
- AuthorDTO

### Main Endpoints

Users:

```
GET    /users
GET    /users/{id}
POST   /users
PUT    /users/{id}
DELETE /users/{id}
```

Posts:

```
GET    /posts
GET    /posts/{id}
GET    /posts/titlesearch?text=...
```

## How to Run the Project

### 1. Clone the repository
``` 
git clone https://github.com/your-user/repository-name.git
cd Spring-Forum
```

### 2. Configure MongoDB

Make sure **MongoDB** is running locally (default port **27017**).

To change the database URL, edit:

```
src/main/resources/application.properties
```

Default example:

```
spring.data.mongodb.uri=mongodb://localhost:27017/spring_forum
```

### 3. Run the project

You can run it via your IDE (IntelliJ / Eclipse) or using the terminal:

``` 
mvn spring-boot:run 
```

Or:

```
./mvnw spring-boot:run 
```


Once the server starts, the API will be available at:

```
http://localhost:8080 
```

## Initial Data (Seeding)

The project includes a configuration class that automatically seeds the database with:

- Sample users

- Initial posts

- Example comments

This allows you to explore the API immediately after the first run.

## Project Purpose

- The project was created with the following objectives:

- Learn and demonstrate Spring Boot usage

- Follow clean architecture and separation of concerns

- Practice MongoDB integration

- Build a fully functional REST API

- Provide a strong base for larger systems (e.g., social networks, forums, blogs)
