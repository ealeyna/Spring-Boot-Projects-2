# Spring-Boot-Projects-2
## 🏷️ Project: Gallerist – Car Purchasing System

A Spring Boot project simulating a real-world car dealership platform, combining multiple Spring technologies in a complete backend system.

## 📌 Project Description

Gallerist is a backend system where customers can browse and purchase cars listed by gallerists. The application dynamically retrieves the USD/TRY exchange rate from the Central Bank of the Republic of Turkey (CBRT) to perform real-time currency conversions during car sales.

If a customer has sufficient balance (in TRY) based on the car’s USD price, the transaction is executed successfully.

---

## ⚙️ Technologies Used

- **Java 17**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
  - Spring Security (JWT)
  - Spring Validation
- **Lombok**
- **PostgreSQL** 

---

## 🧩 Key Features

### 🔐 Authentication & Authorization

- JWT-based security
- Registration, login, and token refresh mechanisms
- Secure endpoints using filters

### 📄 Global Exception Handling

- Consistent error response structure across the application
- Handles validation, authentication, and business logic errors

### 🧱 Domain Models & Services

- `Customer`, `Account`, `Gallerist`, `Car`, `GalleristCar`, `Address`, `SoldCar`
- All entities have fully implemented service layers including `save` operations

### 💱 Live Exchange Rate Integration

- Scheduled service fetches daily USD/TRY rate from CBRT SOAP API
- Used in car price calculations during sales

### 🛒 Car Purchase Flow (`/buyCar`)

- Verifies if the car is still available
- Converts car price using current exchange rate
- Checks if customer has enough balance
- If all checks pass → creates a `SoldCar` record and finalizes the transaction

---

## 📬 Endpoints

### 🔐 Authentication
- `POST /register` – Register a new user  
- `POST /authenticate` – Login and receive JWT token  
- `POST /refreshToken` – Refresh expired access token  

### 🛒 Car Purchase
- `POST /buyCar` – Buy a car using real-time exchange rate  

### 💾 Save Operations
- `POST /address/save` – Save an Address  
- `POST /account/save` – Save an Account  
- `POST /customer/save` – Save a Customer  
- `POST /gallerist/save` – Save a Gallerist  
- `POST /car/save` – Save a Car  
- `POST /galleristCar/save` – Save a GalleristCar  

---

## ⚙️ Installations
Before getting started, ensure that the following tools are installed:
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) — Required to compile and run the project.
- [Spring Tools for Eclipse 4.30](https://spring.io/tools) — IDE used for developing and managing Spring Boot projects.
- [PostgreSQL 14](https://www.postgresql.org/download/) — The relational database used in this project.
- [DBeaver 25.0.5](https://dbeaver.io/download/) — Database management tool used to interact with PostgreSQL.
- [Postman](https://www.postman.com/downloads/) — For testing API endpoints and HTTP requests.
- [JUnit 5](https://junit.org/junit5/) — Used for writing and running unit tests.

## 🛠️ Project Configuration
All projects were created using the following setup:
- **Project Type:** Maven
- **Programming Language:** Java 17
- **Spring Boot Version:** 3.5.0
- **Packaging:** `.jar`---


