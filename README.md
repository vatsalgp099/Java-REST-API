# Java-REST-API

## About

Implement an application in java that provides a REST API with endpoints for searching. creating and deleting "server" objects. 

## Index 
* Tasks to be achieved
* Database
* Tech Stack
* Process

## Task to be achieved: 
- GET servers: Should return all the servers if no parameters are passed. When server id is passed as a parameter - return a single server or 404 if there's no such server.
- PUT a server: The server object is passed as a json-encoded message body.
- DELETE a server: The parameter is the server ID
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

**UPDATED USING RELEVANT NAMING**
![Screenshot (243)](https://github.com/vatsalgp099/Java-REST-API/assets/68069100/44e3011d-81e5-478c-afe3-847b20f54967)

 - API end points were created. 
 
 ### MongoDB 
 
 - A server was created using Mongodb
*mongod* is the "Mongo Daemon" it's basically the host process for the database. When you start mongod you're basically saying "start the MongoDB process and run it in the background"

![Screenshot (131)](https://user-images.githubusercontent.com/68069100/235364078-42a4d954-c9b0-4a27-96a7-1cb2e8d301d5.png)

- ![Screenshot (132)](https://user-images.githubusercontent.com/68069100/235364651-cc9b5ed9-89d1-43d7-a3e9-119834278f43.png)

- Databse is *appdata* (data stored in mongoDB local database)

![Screenshot (132)](https://user-images.githubusercontent.com/68069100/235364665-70797f33-c8f3-41f5-8c53-5f2acda00464.png)


### Postman 

The API is tested using Postman 

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/27097975-3da76797-8470-4f46-8d49-9b9f191603d9?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D27097975-3da76797-8470-4f46-8d49-9b9f191603d9%26entityType%3Dcollection%26workspaceId%3Dbfec2785-98df-4cfb-a92f-66f3bb1d8c8d)

## UPDATED with relevant naming

1. All server is retrieved (GET) - Read Servers

![Screenshot (245)](https://github.com/vatsalgp099/Java-REST-API/assets/68069100/ab28b7d8-da59-4df3-908f-30b0d5933649)

2. Server can be created (POST) - Create server

![Screenshot (244)](https://github.com/vatsalgp099/Java-REST-API/assets/68069100/caf0b10a-41a6-40cf-8bd8-6473d1e3c40a)

3. Server can be searched using *name* (GET) - Search server

![Screenshot (246)](https://github.com/vatsalgp099/Java-REST-API/assets/68069100/a0cb326d-2f6c-49cd-bd6a-44a0f9333c73)

4. Server is updated by *id* (PUT) - Update servers

![Screenshot (247)](https://github.com/vatsalgp099/Java-REST-API/assets/68069100/592750b7-f569-4846-8dc1-853591527999)

5. Server is deleted using *id* (DELETE) - Delete server

![Screenshot (248)](https://github.com/vatsalgp099/Java-REST-API/assets/68069100/368d309d-473f-4c3d-8421-1d50625df8df)

Server object is deleted 

![Screenshot (245)](https://github.com/vatsalgp099/Java-REST-API/assets/68069100/519c67d9-d332-49f3-82e4-397fdb627e51)



