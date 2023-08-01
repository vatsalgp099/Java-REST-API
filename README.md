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
- Using [Spring boot initilizer](https://start.spring.io/) the project file was generated. 
- In the *..\src\main\java\com.vg.App* seperate folders were created for controller, model, and repository.
- Kindly refer to the files for the code. 
 ![Screenshot (130)](https://user-images.githubusercontent.com/68069100/235363907-2f74822e-be4d-47eb-9e17-d4dd9ffa841a.png)
 - API end points were created. 
 
 ### MongoDB 
 
 - A server was created using mongodb
*mongod* is the "Mongo Daemon" it's basically the host process for the database. When you start mongod you're basically saying "start the MongoDB process and run it in the background"

![Screenshot (131)](https://user-images.githubusercontent.com/68069100/235364078-42a4d954-c9b0-4a27-96a7-1cb2e8d301d5.png)

- ![Screenshot (132)](https://user-images.githubusercontent.com/68069100/235364651-cc9b5ed9-89d1-43d7-a3e9-119834278f43.png)

- Databse is *appdata* (data stored in mongoDB local database)

![Screenshot (132)](https://user-images.githubusercontent.com/68069100/235364665-70797f33-c8f3-41f5-8c53-5f2acda00464.png)


### Postman 

The API is tested using Postman 

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/27097975-3da76797-8470-4f46-8d49-9b9f191603d9?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D27097975-3da76797-8470-4f46-8d49-9b9f191603d9%26entityType%3Dcollection%26workspaceId%3Dbfec2785-98df-4cfb-a92f-66f3bb1d8c8d)


1. All data is retrieved (GET) 

![Screenshot (133)](https://user-images.githubusercontent.com/68069100/235364919-93648b85-b9a8-4846-a99e-ea496305f38c.png)


2. Data can be added to database (POST) 

![Screenshot (134)](https://user-images.githubusercontent.com/68069100/235364984-7e9bc5bd-9286-4f92-aa5a-603b395ccb76.png)

3. Data can be searched using *name* (GET) 

![Screenshot (135)](https://user-images.githubusercontent.com/68069100/235365033-8bad4243-f0de-40e8-836c-499e2fb11014.png)

4. Data is updated by *id* (PUT) 

![Screenshot (136)](https://user-images.githubusercontent.com/68069100/235365096-d4f61422-3842-40e4-8c0d-7c2952683a87.png)

5. Data is deleted from the server using *id* (DELETE)

![Screenshot (137)](https://user-images.githubusercontent.com/68069100/235365204-356aab0f-f261-42ef-8eeb-2a229f86d671.png)

Server object is deleted 

![Screenshot (138)](https://user-images.githubusercontent.com/68069100/235365257-dbe1bda2-f0fd-4395-aa43-194d48294345.png)



