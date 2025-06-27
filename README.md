# 💸 Spring Boot Transaction Management App

A simple banking-style application built with **Spring Boot**, **JPA**, and **Hibernate** that demonstrates how to manage **transactional money transfers** between accounts with automatic **rollback** support using `@Transactional`.

## 🚀 Features

- Create and store multiple bank accounts
- Transfer money from one account to another
- Transaction is atomic — rollback on failure
- Store transaction logs with timestamps
- Demonstrates `@OneToMany` and `@ManyToOne` JPA relationships
- Uses H2/PostgreSQL (configurable)

---


## 📦 Project Structure

<pre>
📁 src/
 └── 📁 main/
     ├── 📁 java/
     │   └── 📁 com.transaction.management.Transaction_Management_App
     │       ├── 📄 TransactionManagementAppApplication.java
     │
     │   ├── 📁 entities/
     │   │   ├── 📄 Account.java
     │   │   └── 📄 Transaction.java
     │
     │   ├── 📁 repositories/
     │   │   ├── 📄 AccountRepository.java
     │   │   └── 📄 TransactionRepository.java
     │
     │   └── 📁 services/
     │       └── 📄 TransactionService.java
     │
     └── 📁 resources/
         └── 📄 application.properties
</pre>



---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 / PostgreSQL (DB)
- Maven

---

## ⚙️ How to Run

### ✅ Prerequisites

- Java 17+
- Maven
- (Optional) PostgreSQL if not using in-memory H2

### ▶️ Run the App

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/transaction-management-app.git
   cd transaction-management-app

---

### ✅ How to Use This

1. Save the above as `README.md` in your project root folder.
2. Push your project to GitHub.
3. It will automatically render as your repository’s homepage.

Let me know if you'd like to generate badges, API documentation, or a front-end UI!

