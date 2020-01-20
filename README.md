# Project people-base-graphql
- This project shows an application which performs main crud operations on person entities.
- This is developed with spring graphql for web layer and spring data jpa for persistence.
- This uses in memory h2 db.
- This is powered by GraphiQL as a UI based query processor.

'''
query {
  person(id:"123") {
    firstName
    lastName
    age
  }
}
'''
