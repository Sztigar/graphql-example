### Example mutation
mutation {
  addAuthor(firstName: "Wiktor", lastName: "Wojda") {
    id
  }
  addBook(title: "1998", pageCount: 255, authorId: 1){
    id
  }
}
