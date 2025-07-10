# ✈️ Airline Reservation System

A **console-based Airline Reservation System** built using **Core Java**, **Maven**, and **PostgreSQL**.  
It allows users to manage flights, book tickets, and view real-time booking statistics with timestamps.

---

## 👥 Group Members

1. **Prerana Anand Nalawade**
2. **Rajnandini Ravindra Ambure**
3. **Samruddhi More**

---

## 🚀 Features

- **Add Flights** – Insert flight data with source, destination, and number of seats  
- **View All Flights** – Display all available flights  
- **Book Tickets** – Reserve a ticket under a passenger's name with timestamp  
- **Auto Seat Update** – Automatically decreases available seats after booking  
- **Booking Stats** – Shows who booked which flight and when  
- **Thread-Ready Design** – Clean separation of DAO & model for multithreading support  

---

## 🛠️ Technologies Used

- **Java** – Core Java (OOP, Collections, Exception Handling)  
- **Maven** – Project & Dependency Management  
- **JDBC** – Java Database Connectivity for SQL operations  
- **PostgreSQL** – Backend database  
- **IDE** – Eclipse or IntelliJ IDEA  

---

## 📦 Dependencies

<dependencies>
    <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.7.7</version>
    </dependency>
</dependencies>    
   


**✅ Prerequisites**
Java JDK 8 or above

Maven 3.6+

PostgreSQL

IDE: Eclipse 

Git (for cloning the project)


**🧱 Database Setup**  
Run the following SQL in PostgreSQL to create the required tables:  
CREATE TABLE flights (    
    id SERIAL PRIMARY KEY,    
    source VARCHAR(100),    
    destination VARCHAR(100),    
    seats INT    
);    

CREATE TABLE bookings (    
    id SERIAL PRIMARY KEY,    
    flight_id INT REFERENCES flights(id),    
    passenger_name VARCHAR(100),    
    booking_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP    
);    



**📷 Sample Output**  
<img width="346" height="173" alt="image" src="https://github.com/user-attachments/assets/5564c5c0-6bf6-4be9-8dc5-3f391319494e" />  

**📫 Contact**  
Name: Prerana Nalawade  
Email: prerananalawade5@gmail.com  
GitHub: PreranaNalawade

