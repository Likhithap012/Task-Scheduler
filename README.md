# Task-Scheduler


A simple Spring Boot RESTful API that allows users to **create**, **retrieve**, **update**, and **delete** tasks with priorities and due dates.

---

## 🚀 Features

- Create a task with validation (title, priority, due date)
- Get all tasks or a specific task by ID
- Update task details
- Delete a task by ID
- Built-in validation and exception handling
- Layered architecture (Controller, Service Interface & Impl, DTOs, Entity, Repository)

---

## 📦 Tech Stack

- Java 17+
- Spring Data JPA
- H2 Database (or any other JPA-compatible DB)
- Lombok
- Jakarta Bean Validation

---

## 📁 Project Structure

```

src
├── main
│   ├── java
│   │   └── com.gevernova.taskscheduler
│   │       ├── controller
│   │       ├── dto
│   │       ├── entity
│   │       ├── exception
│   │       ├── repository
│   │       └── service
│   └── resources
│       ├── application.properties

````

---

##  Setup & Run

### ✅ Prerequisites

- Java 17 or later
- Maven or Gradle
- IDE (IntelliJ recommended)


## API Endpoints

### Create Task

`POST /tasks`

```json
{
  "title": "Finish Assignment",
  "description": "DSA Practice",
  "priority": "HIGH",
  "dueDate": "2025-06-15"
}
```

---

###  Get All Tasks

`GET /tasks`

---

###  Get Task by ID

`GET /tasks/{id}`

---

###  Update Task

`PUT /tasks/{id}`


---

###  Delete Task

`DELETE /tasks/{id}`

---

## ✅ Validations

* `@NotBlank`: Title is required
* `@NotNull`: Priority must be specified
* `@FutureOrPresent`: Due date must not be in the past

---

##  Error Handling

Custom exceptions are handled globally using `@RestControllerAdvice`.

Example:

```json
{
  "error": "Task not found with ID: 99"
}
```

---

## 🧪 Testing with Postman

* Import collection or use endpoints manually.
* Make sure Spring Boot app is running at `http://localhost:8080`.

---




