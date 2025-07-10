# 🏥 Clinic Management System (Java Console + JDBC)

A simple console-based Java application to manage patient records in a clinic.  
This project demonstrates basic **CRUD operations** using **Core Java**, **Object-Oriented Programming (OOP)** principles, and **JDBC** for database interaction with **PostgreSQL**.

---

## 👥 Group Members

1. Mayuri Vijay Surve  
2. Pragati Santosh Gore  
3. Vaishnavi Prashant Shete  

---

## 📌 Features

- ✅ Add new patient  
- ✅ View all patients  
- ✅ Update patient details  
- ✅ Delete patient record  
- ✅ Console-based menu system  
- ✅ Connected to PostgreSQL using JDBC  

---

## 🛠 Technologies Used

| Technology     | Description                       |
|----------------|-----------------------------------|
| Java           | Core Java, OOP Concepts           |
| JDBC           | Java Database Connectivity        |
| PostgreSQL     | Relational Database               |
| Maven          | Dependency Management             |
| Git & GitHub   | Version Control & Collaboration   |

---

## 📦 Dependencies

Add the following dependency to your `pom.xml`:

<dependencies>  
    <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->  
    <dependency>  
        <groupId>org.postgresql</groupId>  
        <artifactId>postgresql</artifactId>  
        <version>42.7.7</version>  
    </dependency>  
</dependencies>  

✅ Prerequisites
Java JDK 8 or above

Maven 3.6+

PostgreSQL 10 or above

IDE: Eclipse / IntelliJ IDEA

Git (for cloning the project)

🧱 Database Setup
Run the following SQL in PostgreSQL to create the required tables:

CREATE TABLE patients (  
    id SERIAL PRIMARY KEY,  
    name VARCHAR(100),  
    age INT,  
    gender VARCHAR(10),  
    contact VARCHAR(15)  
);  


**📷 Sample Output**  
<img width="346" height="173" alt="image" src="https://github.com/user-attachments/assets/5564c5c0-6bf6-4be9-8dc5-3f391319494e" />  

**📫 Contact**  
Name: Prerana Nalawade  
Email: prerananalawade5@gmail.com  
GitHub: PreranaNalawade

