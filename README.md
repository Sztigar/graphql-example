## Simple Spring Boot + Graphql example

+ Using H2 database

+ Build with maven

+ Graphiql avaliable at [localhost:8080/graphiql](localhost:8080/graphiql)

##Example usage

```
mutation {
  addAuthor(firstName: "Wiktor", lastName: "Wojdamutation and queries") {
    id
  }
  addBook(title: "1998", pageCount: 255, authorId: 1){
    id
  }
}


query {

  getAllAuthors{
    firstName,
    lastName
    books{
      id
      title
    }
  }
  getAllBooks{
    id
    title
    pageCount
    author{
      id
      lastName
      firstName
    }
  }
  getBookById(id: 2){
		id
    title
    pageCount
    author{
      id
      firstName
      lastName
    }
  }
}
```
