# Finance Dashboard Backend

## 📌 Overview

This project is a backend system for managing financial records with role-based access control. It supports user management, transaction tracking, and dashboard analytics.

---

## 🚀 Tech Stack

* Java
* Spring Boot
* MySQL
* Spring Data JPA

---

## ⚙️ Features

### 👤 User Management

* Create users
* Assign roles (ADMIN, ANALYST, VIEWER)
* Manage user status

### 💰 Financial Records

* Add income and expense records
* View all transactions

### 📊 Dashboard

* Total Income
* Total Expense
* Net Balance

### 🔐 Access Control

* Role-based restrictions (basic implementation)

---

## 🔗 API Endpoints

### User APIs

* POST /users → Create user
* GET /users → Get all users

### Financial APIs

* POST /records → Add record
* GET /records → Get all records

### Dashboard API

* GET /dashboard/summary → Get summary

---

## 🧪 Sample Request

POST /records

{
"amount": 5000,
"type": "INCOME",
"category": "Salary",
"date": "2026-04-02",
"notes": "Monthly salary",
"createdBy": 1
}

---

## 🛠️ Setup Instructions

1. Clone the repository
2. Open in IntelliJ IDEA
3. Configure MySQL database:

    * Create database: finance_db
4. Update application.properties:
   spring.datasource.username=root
   spring.datasource.password=your_password
5. Run the application

---

## 📈 Future Improvements

* JWT Authentication
* Advanced filtering
* Pagination
* Category-wise analytics

---

## 👩‍💻 Author

Preeti V Savanur
