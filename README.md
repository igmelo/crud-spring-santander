[![CircleCI](https://circleci.com/gh/igmelo/crud-spring-santander.svg?style=svg)](https://circleci.com/gh/igmelo/crud-spring-santander)

## Spring Boot Project connected to MongoDB Atlas

### Instructions

- Access the project directory (for me "C:\crud-spring-santander") and open a terminal (you can use Shift + Right Click inside the directory and click "Open Terminal" option).

**RUN THE COMMAND BELOW**
```sh
mvn clean install
```

- The command above will download all necessary dependencies. After that is complete, you can execute the command below:

```sh
mvn spring-boot:run
```

- Now the project will be running, you can access the endpoints using *Postman* for example.

######Tip:
>**You can press *Ctrl+C* to finish the build anytime**

### CRUD operations - Endpoints

- GET ALL
> http://localhost:8080/user

- GET BY ID
> http://localhost:8080/user/{id}

- POST
> http://localhost:8080/user 

- DELETE
> http://localhost:8080/user/{id}

- PATCH
> http://localhost:8080/user/{id}