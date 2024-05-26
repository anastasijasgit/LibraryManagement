# Library Management API

## Introduction

The Library Management API is designed to handle book inventories, member subscriptions, book borrowing, and returning processes. The system also supports tracking book conditions and managing late returns.

## Base URL

http://localhost:8080/api

bash
Copy code

## Endpoints

### 1. Create a New Book

**HTTP Method:** POST

**Endpoint:** `/books`

**Description:** Add a new book to the inventory.

**Request Headers:**
- `Content-Type: application/json`

**Request Body:**
```json
{
  "title": "Effective Java",
  "author": "Joshua Bloch",
  "isbn": "978-0134685991",
  "available": true,
  "condition": "New"
}

Responses:

201 Created:
json
Copy code
{
  "id": 1,
  "title": "Effective Java",
  "author": "Joshua Bloch",
  "isbn": "978-0134685991",
  "available": true,
  "condition": "New"
}
400 Bad Request: Invalid input

2. Create a New Member
HTTP Method: POST

Endpoint: /members

Description: Register a new member.

Request Headers:

Content-Type: application/json
Request Body:

json
Copy code
{
  "name": "Anastasija Sazdovska",
  "email": "anastasijasazdovska@icloud.com",
  "active": true
}
Responses:

201 Created:
json
Copy code
{
  "id": 1,
  "name": "Anastasija Sazdovska",
  "email": "anastasijasazdovska@icloud.com",
  "active": true
}
400 Bad Request: Invalid input
3. View All Books
HTTP Method: GET

Endpoint: /books

Description: View detailed information about all books, including availability.

Request Headers:

Accept: application/json
Responses:

200 OK:
json
Copy code
[
  {
    "id": 1,
    "title": "Effective Java",
    "author": "Joshua Bloch",
    "isbn": "978-0134685991",
    "available": true,
    "condition": "New"
  },
  {
    "id": 2,
    "title": "Clean Code",
    "author": "Robert C. Martin",
    "isbn": "978-0132350884",
    "available": false,
    "condition": "Used"
  }
]
204 No Content: No books found
4. View All Members
HTTP Method: GET

Endpoint: /members

Description: View detailed information about all members.

Request Headers:

Accept: application/json
Responses:

200 OK:
json
Copy code
[
  {
    "id": 1,
    "name": "Anastasija Sazdovska",
    "email": "anastasijasazdovska@icloud.com",
    "active": true
  },
  {
    "id": 2,
  "name": "Anastasija Sazdovska",
  "email": "anastasijasazdovska@icloud.com",
    "active": true
  }
]
204 No Content: No members found

5. View a Single Book
HTTP Method: GET

Endpoint: /books/{id}

Description: Retrieve details of a single book by its ID.

Request Headers:

Accept: application/json
Path Parameters:

id (integer): ID of the book
Responses:

200 OK:
json
Copy code
{
  "id": 1,
  "title": "Effective Java",
  "author": "Joshua Bloch",
  "isbn": "978-0134685991",
  "available": true,
  "condition": "New"
}
404 Not Found: Book not found
6. View a Single Member
HTTP Method: GET

Endpoint: /members/{id}

Description: Retrieve details of a single member by their ID.

Request Headers:

Accept: application/json
Path Parameters:

id (integer): ID of the member
Responses:

200 OK:
json
Copy code
{
  "id": 1,
  "name": "Anastasija Sazdovska",
  "email": "anastasijasazdovska@icloud.com",
  "active": true
}
404 Not Found: Member not found

7. Update a Book
HTTP Method: PUT

Endpoint: /books/{id}

Description: Update the status of a book (e.g., borrowed, returned) and modify other details.

Request Headers:

Content-Type: application/json
Path Parameters:

id (integer): ID of the book
Request Body:

json
Copy code
{
  "title": "Effective Java",
  "author": "Joshua Bloch",
  "isbn": "978-0134685991",
  "available": false,
  "condition": "Good"
}
Responses:

200 OK:
json
Copy code
{
  "id": 1,
  "title": "Effective Java",
  "author": "Joshua Bloch",
  "isbn": "978-0134685991",
  "available": false,
  "condition": "Good"
}
400 Bad Request: Invalid input
404 Not Found: Book not found
8. Update a Member
HTTP Method: PUT

Endpoint: /members/{id}

Description: Modify member information.

Request Headers:

Content-Type: application/json
Path Parameters:

id (integer): ID of the member
Request Body:

json
Copy code
{
  "name": "Anastasija Sazdovska",
  "email": "anastasijasazdovska@icloud.com",
  "active": true
}
Responses:

200 OK:
json
Copy code
{
  "id": 1,
  "name": "Anastasija Sazdovska",
  "email": "anastasijasazdovska@icloud.com",
  "active": true
}
400 Bad Request: Invalid input
404 Not Found: Member not found
9. Delete a Book
HTTP Method: DELETE

Endpoint: /books/{id}

Description: Remove a book from the inventory.

Request Headers:

Accept: application/json
Path Parameters:

id (integer): ID of the book
Responses:

204 No Content: Successfully deleted
404 Not Found: Book not found
10. Delete a Member
HTTP Method: DELETE

Endpoint: /members/{id}

Description: Unregister a member.

Request Headers:

Accept: application/json
Path Parameters:

id (integer): ID of the member
Responses:

204 No Content: Successfully deleted
404 Not Found: Member not found
