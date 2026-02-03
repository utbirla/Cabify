
# 🚕 Cabify – Cab Booking System

Cabify is a **Java + MySQL based cab booking system** that allows users to book cabs, manage trips, and add rest points during a journey. The system is designed to simulate real-world cab booking operations with a focus on simplicity, efficiency, and database-driven functionality.

---

## 📌 Features

- 👤 **User Management**
  - User registration and login
  - Secure handling of user details

- 🚖 **Cab Booking**
  - Book a cab by specifying source and destination
  - View booking details and trip history

- 📍 **Rest Point Functionality**
  - Users can add rest points where they want to take breaks during the trip
  - Useful for long-distance journeys

- 🗄️ **Database Integration**
  - All user, cab, trip, and rest point data stored in MySQL
  - Efficient CRUD operations using SQL queries

---

## 🛠️ Tech Stack

- **Programming Language:** Java  
- **Database:** MySQL  
- **Backend:** JDBC (Java Database Connectivity)  
- **IDE Used:** IntelliJ IDEA / Eclipse / VS Code  
- **Architecture:** Console-based / Modular Java application  

---

## 🧩 Database Schema (Overview)

- **Users Table**
  - user_id
  - name
  - email
  - password

- **Cabs Table**
  - cab_id
  - driver_name
  - cab_status

- **Bookings Table**
  - booking_id
  - user_id
  - cab_id
  - source
  - destination

- **RestPoints Table**
  - rest_id
  - booking_id
  - location_name

---

## ⚙️ How to Run the Project

1. Clone the repository
   ```bash
   git clone https://github.com/your-username/Cabify.git
