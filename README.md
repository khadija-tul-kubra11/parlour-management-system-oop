# parlour-management-system-oop
A desktop-based application built with Java (OOP) using Swing for GUI and JDBC for database connectivity. It manages customers, services, employees, and appointments with a simple dashboard.  Technologies Used: Java (Eclipse IDE), Swing, JDBC, Oracle SQL Developer.
1.Introduction:
GlowUp Parlor Management System is a custom-built desktop software aimed at automating the manual operations of a beauty parlor. Traditional parlors often manage appointments, customer records, and services on paper, which can lead to inefficiencies and data loss. Our system is designed using Java (Swing for GUI) and Oracle SQL Developer for a robust backend, ensuring a reliable, interactive, and connected solution.
2. Technologies Used:
- Java (Swing): Used to build the graphical user interface for each module
- Oracle SQL Developer: Used for database schema, data management, and queries
- JDBC: Java Database Connectivity for linking the Java app with Oracle DB
- Eclipse IDE: Primary development environment for Java coding
3. Problem Statement:
Managing a parlor manually can be prone to errors, delays, and data duplication. Receptionists may forget appointments, and there's no central record to track service history. This project solves these problems by centralizing all records — from customers to employees to appointments — in a single digital system.
4. System Overview:
The system includes multiple interfaces:
- Dashboard: The central screen from where the user navigates
- Customer Module: Add and manage customer details
- Services Module: Displays services, their prices, and assigned staff
- Appointment Module: Allows date-specific booking
- Employee Module: Protected by password and used to manage staff

All modules are integrated and store information in the database automatically using JDBC.
5. Database Design:
The backend consists of 4 main tables:
- EMPLOYES (stores employee data)
- CUSTOMERS (records client info)
- SERVICES (parlor offerings)
- APPOINTMENTS (booked sessions)

Sequences like seq_customer_id, seq_service_id, etc., auto-generate IDs.
Views such as view_customers and view_appointments_summary are created for easier data retrieval.
6. Java Application Structure:
Each module is a Java Swing JFrame class (like customer.java, employe.java). The forms collect input through text fields and validate it before saving it to the database using JDBC queries.

For example:
- The appointment form ensures date format correctness before inserting it into the database.
- The employee form is protected by a password dialog before giving access.
7. Features and Functionalities:
- Login-protected employee panel
- Customer input form with validation (name, phone, email)
- Auto ID generation using Oracle sequences
- SQL views for easy access to customer/service data
- Services table pre-filled with service names and prices
- JDBC integration using DBUtil.executeQuery() for all inserts
8. Testing & Validation:
We tested every module by inserting valid and invalid data. For instance:
- Invalid date formats are rejected in appointment booking
- Wrong email format prompts an error
- All data entered is shown in tables to confirm persistence
- Console and popup messages guide the user at every step
9. Screenshots & GUI Summary:
Each module was built with attention to user experience. Buttons like Back, Save, and Clear help navigate and manage data. The services module displays a table, while others use input fields.
10. Conclusion:
This project demonstrates how desktop applications in Java can be effectively combined with Oracle databases to create real-world solutions. The parlor management system digitalizes customer bookings, reduces manual effort, and ensures data accuracy and security.


