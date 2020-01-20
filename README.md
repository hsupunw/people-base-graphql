# Project people-base
- This is a sample sapring-boot based REST application which shows main crud operations in person entities. 
- It uses spring-graphqlc for web layer.
- Also spring-data-jpa for persistence layer with h2 in memory database.
- This is powered by GraphiQl as a query processor graphical UI.

## Prerequisite
- java 8

## Build
You can build the project with following steps
- Navigate to project root. */people-base-graphql/
- Execute a maven build by 
```shell
mvn clean package
```
or 
```shell
mvn clean install
```
- Find the executable .jar at */people-base-graphql/target/

## Test without installing
- Alternately you can download the executable .jar file directly from https://drive.google.com/open?id=1wv-yCroZx1eoFw-BZML3jAA85LpuL39x

## Run
- With the executable .jar made with the previous step, you can run the application by 
```shell
java -jar people-base-graphql-0.0.1-SNAPSHOT.jar
```
command.
- By Default it uses port 8080.

## Api Documentation
- This api is documented with swagger 2 documentation. You can navigate to the swagger-ui with http://localhost:8080/swagger-ui.html

## H2 Console
- This application uses an in memory h2 db. To navigate to h2 console, go http://localhost:8080/h2-console
    - user name: sa
    - password:
    
## Using GraphiQL
- Navigate to http://localhost:8080/graphiql and go to graphiQL web based ui
- Now you can insert the query, run the query and see results. Example queries can be found below
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
