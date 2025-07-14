# Spring-Boot-Projects-2
## 🏷️ Project: Gallerist – Car Purchasing Platform
This project brings together all major Spring technologies developed and practiced so far from Spring Boot Projects-1 repository, by implementing a car purchasing application that simulates a real-world dealership workflow.

The system is built using Spring Web, Spring Data JPA, Spring Security (JWT-based authentication), Lombok, and PostgreSQL. It features a full-stack backend where customers can browse and purchase cars from galleries, with financial calculations based on live USD/TRY exchange rates retrieved from the official Central Bank of the Republic of Turkey (CBRT) web service.

🔧 Technologies & Features
Authentication & Authorization: Implemented via JWT, including login, registration, token refresh, and protected endpoints.

Exception Handling: Global exception handling layer ensures consistent and user-friendly error responses across the system.

Domain Entities & Services:
Includes full CRUD operations for:
Customer
Gallerist
Car
Address
Account
GalleristCar
SoldCar

Exchange Rate Integration:
A scheduled service connects to the CBRT SOAP Web Service to fetch the latest USD/TRY exchange rate daily, which is then used in price conversions during car purchasing.

Core Business Logic – Car Purchase Flow:
A buyCar POST endpoint is implemented under the SoldCarService, which:
Checks if the desired car is available for purchase
Converts the car price from USD to TRY using the daily exchange rate
Verifies if the customer has sufficient balance
Finalizes the sale by updating ownership, customer account balance, car status and deducting the payment

---
## Ön Koşullar
- Java
- Spring Tools for Eclipse
- PosgreSQL
- DBeaver
- Postman
- JUnit 5
---
## Kurulumlar
- [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)  version 17 used. For the installment, you can check the url.
- [Spring Tools for Eclipse] https://spring.io/tools)  version 4.30 used. For the installment, you can check the url.
- [PostgreSQL]( https://www.postgresql.org/download/windows/)  version 14 used. For the installment, you can check the url.
- [DBeaver]( https://dbeaver.io/download/)version 25.0.5 used. For the installment, you can check the url.
- [Postman]( https://www.postman.com/downloads/). For the installment, you can check the url.
- Proje olarak Maven, Yazılım dili olarak Java versiyon 17, Spring Boot versiyonu olarak 3.5.0, packaging olarak .jar seçimleri ile bütün projeler oluşturulmuştur.
---
### Kullanılan Kütüphaneler
- [react-bootstrap](https://react-bootstrap.github.io/getting-started/introduction/)
- [react-router-dom](https://www.npmjs.com/package/react-router-dom)
- [axios](https://www.npmjs.com/package/axios)
- [react-chartjs-2](https://www.npmjs.com/package/react-chartjs-2)
---
