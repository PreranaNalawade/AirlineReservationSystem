**Airline Reservation System**
A console-based Airline Reservation System built using Core Java, Maven, and PostgreSQL. It allows users to manage flights, book tickets, and view real-time booking statistics with timestamps.


**Features**

 Add Flights	:- Insert flight data with source, destination, seats
 View All Flights	:- View all available flights
 Book Tickets	:- Reserve ticket under passenger name with timestamp
 Auto Seat Update	:- Decreases available seats after booking
 Booking Stats	:-Shows who booked which flight and when
 Thread-ready design	:- Clean separation of DAO & model for thread support
 

**Technologies Used**
Java – Core Java (OOP, Collections, Exception Handling)

Maven – Project & Dependency Management

JDBC – Java Database Connectivity for SQL operations

PostgreSQL – Backend database

Eclipse/IntelliJ – IDE for development


**Dependencies**

   <dependencies>
    <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.7</version>
</dependency>
    </dependencies>


**Prerequisites**

1.Java JDK	8 or above
2.Maven	3.6+
3.PostgreSQL	10 or above
4.IDE	Eclipse / IntelliJ
5.Git For cloning
6.create postgreSQL database with the following table
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



**contact**
Name:- Prerana Nalawade
Email:- prerananalawade5@gmail.com
GitHub:- https://github.com/PreranaNalawade
