Bank Management System

Overview

The Bank Management System is a simple REST API built with Spring Boot to help manage bank accounts, transactions, and users. It mimics the core operations of a banking system—like creating accounts, handling transactions, and managing users—all while keeping things straightforward and easy to use.

Features

User Registration and Login: Users can create an account and log in to access banking services.

Account Management: Create, update, delete, and view bank accounts.

Transactions: Make deposits and withdrawals, and view transaction history.

Basic Security: Simple login security with Spring Security.

Technologies Used

Java 17: Programming language.

Spring Boot 3: Backend framework for building REST APIs.

Spring Data JPA & Hibernate: For database operations.

MySQL: Database to store data.

Maven: Dependency and build tool.

Postman: Tool for testing the API.

Project Structure

This project is organized in layers to keep things tidy:

Models

These are the core parts of the system, representing the data:

Account: Represents a bank account with fields like account number and balance.

Employee: Represents a bank employee with fields like name, role, and salary.

Transaction: Represents a banking transaction like deposits and withdrawals.

Controllers

These manage the incoming API requests and return responses:

AccountController: Handles all operations for bank accounts.

TransactionController: Manages viewing and creating transactions.

UserController: Manages user sign-up and login.

Services

Business logic lives here:

AccountService: Contains logic for account creation, updates, etc.

TransactionService: Manages deposits, withdrawals, and transaction rules.

UserService: Manages users, including checking login credentials.

Repositories

Repositories handle data access:

AccountRepository: For account-related database tasks.

TransactionRepository: For handling transactions.

UserRepository: For storing and retrieving user data.

Security Config

The SecurityConfig sets up simple security:

Authentication: Only lets registered users access sensitive endpoints, except for registration and login.

Basic Auth: Basic HTTP authentication for testing.

API Endpoints

User

POST /api/users/register: Create a new user.

POST /api/users/login: Log in with your credentials.

Account

GET /api/accounts: Get all bank accounts.

GET /api/accounts/{id}: Get details of a specific account.

POST /api/accounts: Create a new bank account.

PUT /api/accounts/{id}: Update an account.

DELETE /api/accounts/{id}: Delete an account.

Transaction

GET /api/transactions: Get all transactions.

GET /api/transactions/account/{accountId}: Get transactions for a specific account.

POST /api/transactions: Create a deposit or withdrawal.

DELETE /api/transactions/{transactionId}: Delete a transaction.

How to Run

Prerequisites

Java 17 installed.

MySQL running locally, with a database created for this project.

Maven installed.

Steps

Clone the Repo:

git clone <repository-url>

Configure Database:
Update application.properties to set up your MySQL credentials.

Build the Project:

mvn clean install

Run the App:

mvn spring-boot:run

The app runs at http://localhost:8091.

Test with Postman:
Use Postman to make API requests. Remember to include authentication for protected endpoints.

Notes on Security

CSRF is disabled to keep things simple—enable it for real-world use.

Basic Auth is okay for testing but isn’t recommended for production. JWT or OAuth would be more secure.

Improvements to Consider

JWT Authentication: To add more robust security.

Better Validation: Ensure fields like balance don’t have negative values.

Roles & Permissions: Add roles like admin to control who can do what.

Contact

Have suggestions or questions? Feel free to reach out at [aghazadahmadina@gmail.com].

