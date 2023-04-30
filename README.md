# Java-REST-API

## About

Implement an application in java which provides a REST API with endpoints for searching. creating and deleting "server" objects. 

## Index 
* Tasks to be achieved
* Database
* Tech Stack
* Process

## Task to be achieved: 
- GET servers: Should return all the servers if no parameter are passed. When server id is passed as a parameter - return a single server or 404 if there's no such a server.
- PUT a server: The server object is passed as a json-encoded message body.
- DELETE a server: The parameter is server ID
- GET(find) server by name. The parameter is a string. Must check if a server name contains this string and return one or more servers found. Return 40 if nothing is found.

## Database

"Server" objects should be stored in MongoDB database. 

*Postman is used for API testing*

## Tech Stack

- Java
- Maven
- Spring Boot (Framework)
- MongoDB

## Process

### IntelliJ 
The Intellij IDE is used to cater the project as a whole. 
- Using [Spring boot initilizer](https://start.spring.io/) 
