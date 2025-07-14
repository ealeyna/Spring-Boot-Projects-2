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
- **Swagger**
- **CBRT SOAP Web Service (Exchange Rate API)**

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
  


