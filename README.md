# mers-backend
Revature Project 1
By: Mario Sanchez, Jr.
Travis Jackson

Date: 3/11/2022

Angular Expense Reimbursement System
Description:
An Angular delivered reimbursement managements application consisting of:

login / logout
Manager specific endpoints
Associate specific endpoints
Managers can approve / deny reimbursement requests
Associates can submit reimbursement requests

Technologies:
Java
PostgreSQL for the database
JDBC to access the database from Java
log4j2 to log program information and errors
Javalin to create endpoints for front end to access
Angular to deliver a pleasant user experience

Functionality:

Managers can:
log in
log out
edit reimbursement requests
approve / deny requests
view all requests, pending and resolved
view all employees in company

Associates can:

log in
log out
submit new reimbursement requests
view all their requests
view their pending and resolved requests
Tables Created:
DB Tables

Assumptions:

Associates can only add a new requests, not delete them.
Associates can only provide reimbursement amount when submitting.
All requests whole numbers.
Associate must know their own employee ID.
Managers are the only employees that can edit reimbursement requests.
Managers are the only employees that can view complete list of employees and requests.

Improvements Going Forward:

Create a properties file so that the database's login information is not visible in the Java code.
Create more tables to better fit a more complex reimbursement management application.
Implement more tests using Mockito and JUnit5 as well as unit test for each Angular component.
Add a few more user input checks to ensure they cannot enter incorrect information.
Provide a more dynamic user experience leveraging the power of Angular to manipulate the DOM.
Utilize Github more effectively to better coordinate with partner.
