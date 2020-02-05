# Project people-base-graphql
- This is a sample sapring-boot based REST application which shows main crud operations in person entities. 
- It uses spring-graphql for web layer.
- Also spring-data-jpa for persistence layer with h2 in memory database.
- More over it is protected by basic authentication supported by spring-security.
- This is powered by GraphiQl as a query processor graphical UI.

## Prerequisite
- java 8

## Build
You can build the project with following steps
- Navigate to project root. */people-base-graphql/
- Execute a maven build by 
```shell
mvnw clean package
```
or 
```shell
mvnw clean install
```
- Find the executable .jar at */people-base-graphql/target/

## Test without installing
- Alternately you can download the executable .jar file directly from https://drive.google.com/open?id=1B4OaFXnTbCVZr-ZbHDstxIg82f5c631f

## Run
- With the executable .jar made with the previous step, you can run the application by 
```shell
java -jar people-base-graphql-0.0.1-SNAPSHOT.jar
```
command.
- By Default it uses port 8080.

## Authentication 
- This application is secured by basic authentication. So whenever asked please submit following credentials
    - user name: admin
    - password: admin

## H2 Console
- This application uses an in memory h2 db. To navigate to h2 console, go http://localhost:8080/h2-console
    - user name: sa
    - password:

## Command line client (curl)
- Below, you can can find sample basic curl command collection to test this application. 
- Get all
```shell
 curl --user admin:admin -X POST localhost:8080/graphql -H 'Content-type:application/json' -d '{
  "query": "{\n  allPersons {\n    firstName\n    lastName\n    age\n    favouriteColour\n    hobby\n  }\n}",
  "variables": null,
  "operationName": null
}'
```
- Get one
```shell
 curl --user admin:admin -X POST localhost:8080/graphql -H 'Content-type:application/json' -d '{
  "query": "{\n  person(id: \"123\") {\n    firstName\n    lastName\n    age\n    favouriteColour\n    hobby\n  }\n}",
  "variables": null,
  "operationName": null
}'
```
- Create
```shell
 curl --user admin:admin -X POST localhost:8080/graphql -H 'Content-type:application/json' -d '{
  "query": "mutation {\n  createPerson(firstName: \"Sarah\", lastName: \"Robinson\", age: 54, favouriteColour: \"blue\", hobby: [\"chess\"]) {\n    firstName\n    lastName\n    age\n    favouriteColour\n    hobby\n  }\n}",
  "variables": null
}'
```
- Update
```shell
 curl --user admin:admin -X POST localhost:8080/graphql -H 'Content-type:application/json' -d '{
  "query": "mutation {\n  updatePerson(id: \"123\", firstName: \"John\", lastName: \"Keynes\", age: 29, favouriteColour: \"black\", hobby: [\"cricket\"]) {\n    firstName\n    lastName\n    age\n    favouriteColour\n    hobby\n  }\n}",
  "variables": null
}'
```
- Delete
```shell
 curl --user admin:admin -X POST localhost:8080/graphql -H 'Content-type:application/json' -d '{
  "query": "mutation {\n  deletePerson(id: \"123\")\n}",
  "variables": null
}'
```

## Postman Collection
- You can import the postman collection created for testing purpose from https://www.getpostman.com/collections/0baa77c579770b4f7f92
    
## Using GraphiQL
- Navigate to http://localhost:8080/graphiql and go to graphiQL web based ui
- Now you can insert the query, run the query and see results. Example queries can be found below. Please note that in GraphQL you can explicitly specify what attributes are specifically needed for you in the response. Refer below samples.
- Get All
```shell
{
  allPersons {
    firstName
    lastName
    age
    favouriteColour
    hobby
  }
}
```
- Get by id
```shell
{
  person(id: "123") {
    firstName
    lastName
    age
    favouriteColour
    hobby
  }
}
```
- Create person
```shell
mutation {
  createPerson(firstName: "Sarah", lastName: "Robinson", age: 54, favouriteColour: "blue", hobby: ["chess"]) {
    firstName
    lastName
    age
    favouriteColour
    hobby
  }
}
```
- Update person
```shell
mutation {
  updatePerson(id: "123", firstName: "John", lastName: "Keynes", age: 29, favouriteColour: "black", hobby: ["cricket"]) {
    firstName
    lastName
    age
    favouriteColour
    hobby
  }
}
```
- Delete person
```shell
mutation {
  deletePerson(id: "123")
}
```

