# Note Taker Web Application

A simple Java web application for creating and viewing personal notes. The project uses Java Servlets and JSP for the web layer, Hibernate ORM for database operations, and MySQL for storing notes.

## Features

- Add a note with a title and content.
- Automatically record the date when a note is created.
- View saved notes on the **All Notes** page.
- Persist note data in a MySQL database using Hibernate.
- Use Bootstrap-based components for the web interface.

> **Current limitation:** The Delete button shown on the All Notes page is currently a placeholder and does not delete notes.

## Technologies Used

- Java
- Jakarta Servlet API 5.0
- JSP (JavaServer Pages)
- Hibernate ORM 7.4.14.Final
- MySQL
- Maven
- HTML, CSS, Bootstrap, JavaScript
- Apache Tomcat (or another compatible Jakarta Servlet 5.0 container)

## Prerequisites

Install the following before running the application:

- JDK 17 or newer (JDK 21 recommended)
- Maven (or Eclipse with Maven integration)
- MySQL Server
- Apache Tomcat 10 or another server compatible with Jakarta Servlet 5.0
- Eclipse IDE or another Java IDE

## Database Setup

1. Start MySQL.
2. Create the database:

   ```sql
   CREATE DATABASE notetaker;
   ```

3. Open `src/main/resources/hibernate.cfg.xml` and update the database connection properties for your local environment:

   ```xml
   <property name="connection.url">jdbc:mysql://localhost:3306/notetaker</property>
   <property name="connection.username">YOUR_MYSQL_USERNAME</property>
   <property name="connection.password">YOUR_MYSQL_PASSWORD</property>
   ```

Hibernate is configured with `hbm2ddl.auto` set to `update`, so it can update the schema based on the mapped `Note` entity. For production use, prefer a controlled database migration strategy.

## Run the Project in Eclipse

1. Clone or download this repository.
2. In Eclipse, choose **File → Import → Existing Maven Projects** and select the project folder.
3. Right-click the project and choose **Maven → Update Project**.
4. Confirm that the project uses JDK 17 or newer.
5. Make sure MySQL is running and the database connection details in `hibernate.cfg.xml` are correct.
6. Run the project on a compatible Tomcat server.
7. Open the application URL provided by Tomcat. The main page is `index.jsp`; use **Add Notes** to create a note and **All Notes** to view saved notes.

## Project Structure

```text
NoteTaker/
├── src/main/java/
│   ├── com/entities/Note.java
│   ├── com/helper/Factory_Provider.java
│   └── com/servlet/SaveNoteServlet.java
├── src/main/resources/
│   └── hibernate.cfg.xml
├── src/main/webapp/
│   ├── index.jsp
│   ├── addnotes.jsp
│   ├── all_notes.jsp
│   ├── navbar.jsp
│   ├── all_js_css.jsp
│   ├── css/
│   ├── images/
│   └── WEB-INF/web.xml
└── pom.xml
```

## Application Flow

1. The user enters a note title and content on `addnotes.jsp`.
2. The form submits to `SaveNoteServlet`.
3. The servlet creates a `Note` entity and saves it using a Hibernate `Session` and transaction.
4. The `all_notes.jsp` page queries the database and displays saved notes.

## Configuration and Security Notes

- Do not commit real database passwords or other secrets to GitHub. Use local configuration or environment-based secrets for public repositories.
- The current `Note` entity generates IDs using a random number. Random IDs can collide; a database-generated ID strategy would be safer as the project evolves.
- The current JSP page displays note fields directly. For production use, validate input and escape user-provided content before rendering it.
- The Delete button is not implemented yet.

## Future Improvements

- Implement note deletion and note editing.
- Replace random ID generation with database-generated identifiers.
- Add input validation and safe output escaping.
- Add user authentication and per-user notes.
- Improve exception handling and user-friendly error messages.

## Author

**Pratik Adlinge**

- GitHub: [PratikAdlinge](https://github.com/PratikAdlinge)
