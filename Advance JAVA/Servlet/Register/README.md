# Java Servlet Registration Module

A simple web-based registration module built with Java Servlets, JDBC,
and MySQL. It demonstrates collecting registration details from an HTML
form and saving them to a MySQL database.

## Screenshots

### Registration Form

![Registration Form](screenshots/registration-form.png)

### Registration Response

![Registration Response](screenshots/registration-success.png)

### MySQL Database Records

![MySQL Database Records](screenshots/database-record.png)

> **Privacy note:** The database screenshot has been redacted to avoid
> publishing plaintext passwords. Never store or display plaintext
> passwords in a real application; store a secure password hash instead.

## Technologies Used

-   Java
-   Jakarta Servlet API
-   JDBC
-   MySQL
-   HTML
-   Materialize CSS
-   jQuery
-   Apache Tomcat 10.1
-   Eclipse IDE

## Features

-   Registration form for username, password, and email
-   Form submission handled by a Java Servlet
-   JDBC connection to MySQL
-   Parameterized SQL insert using `PreparedStatement`
-   Registration success response

## Database Setup

``` sql
CREATE DATABASE register;
USE register;

CREATE TABLE register (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);
```

## Configuration

1.  Add MySQL Connector/J to the web application's `WEB-INF/lib` folder.
2.  Update the JDBC URL, username, and password in the Servlet to match
    your local MySQL configuration.
3.  Keep database credentials out of public repositories.

## Run Locally

1.  Import the project into Eclipse as a web project.
2.  Configure Apache Tomcat 10.1.
3.  Create the database and table using the SQL above.
4.  Configure the MySQL connection details.
5.  Run the project on Tomcat.
6.  Open `http://localhost:8080/Register/` (adjust the context path if
    needed).

## Learning Objective

This project practices the integration of Java Servlets, JDBC, and MySQL
to handle and persist registration form data.

## Author

Pratik Adlinge
