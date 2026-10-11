# JDBC CRUD Operations Using Statement

## Project Overview
This project demonstrates database operations using Java JDBC and MySQL. It contains two console-based applications: an Employee Management System and a Student Management System. Both applications perform CRUD operations using the JDBC `Statement` interface.

## Technologies Used
- Core Java
- JDBC (Java Database Connectivity)
- MySQL
- `Statement`
- `ResultSet`
- SQL Queries
- Exception Handling

## Project Structure
```text
JDBC-CRUD-Operations/
└── src/
    └── com/
        └── jdbc/
            ├── client/
            │   ├── EmployeeTest.java
            │   └── Test.java
            ├── serviceI/
            │   └── Requirement.java
            └── serviceImpl/
                ├── EmployeeReq.java
                └── ServiceImpel.java
```

## Application 1: Employee Management System

**Database:** `employee_sc`

**Table:** `Employee`

### Employee Attributes
- Employee ID (`eid`) — Primary Key
- Employee Name (`ename`)
- Employee Email (`email`) — Unique
- City (`city`)

### Features
1. Create the Employee table.
2. Insert multiple employee records.
3. Update employee ID, name, email, or city.
4. View all employee records.
5. Delete an employee using their ID.
6. Drop the Employee table.

## Application 2: Student Management System

**Database:** `jdbc_task_db`

**Table:** `student`

### Student Attributes
- Roll Number (`rollno`) — Primary Key
- Name (`name`)
- Marks (`marks`)
- Email (`email`) — Unique

### Features
1. Create the Student table.
2. Insert predefined student records.
3. Update a student's name.
4. View all student records.
5. Delete a student using their roll number.
6. Drop the Student table.

## Database Configuration
Both applications use MySQL with the following configuration:

- Host: `localhost`
- Port: `3308`
- Username: `root`

Create the databases `employee_sc` and `jdbc_task_db` before running the respective applications. Update the connection settings in the source code if your MySQL credentials differ.

## How to Run
1. Install Java and MySQL.
2. Create both databases in MySQL.
3. Add MySQL Connector/J to the Java project.
4. Open the project in Eclipse, IntelliJ IDEA, or VS Code.
5. Run `EmployeeTest.java` for the Employee Management System.
6. Run `Test.java` for the Student Management System.
7. Select the required operation from the console menu.

## Learning Outcomes
- Connecting Java applications to MySQL using JDBC.
- Executing SQL queries using `Statement`.
- Performing CRUD operations.
- Retrieving database records with `ResultSet`.
- Managing tables using SQL commands.

## Important Note
The current implementation uses SQL statements built through string concatenation in the Employee application. For safer database operations, use `PreparedStatement` with parameterized queries to reduce SQL injection risks.

## Author
Java Developer Fresher
