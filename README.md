# TOURS API

## Author

Linet Mutheu

### Description

This is a REST API for querying and retrieving tour packages, tours and tour ratings.

### Prerequisites

You need to have the following installed on your machine

1. Postman
2. Maven
3. JDK
4. Maven
5. Java IDE (Intellij, Eclipse, Spring Tool Suite)
6. Postgres

### Setup and Installation

To access this project on your local files, you can clone it using these steps

1. Open your terminal
2. Use this command to clone `$ git clone
   https://github.com/MutheuLinet/Tours_Management.git
3. This will clone the repository into your local folder
4. Navigate to the folder you cloned into, within src/main/java/com/lyn/ExploreCaliApplication.java and open it with intellij.
5. Run App on localhost:8080
6. Via postman, use localhost url to navigate different routes accordingly either using post and get to test the api.

### Live Site

[Live Link](https://tour-manager.herokuapp.com/)

### HTTP Methods

### End Points

| End Points                                      | HTTP VERB | DESCRIPTION                                                                                                 |
| ----------------------------------------------- | --------- |-------------------------------------------------------------------------------------------------------------|
| /packages                                       | GET       | Get list of all tour packages                                                                               |
| /packages/search/findByName?name=Backpack%20Cal | GET       | Search tour package item by name                                                                            |
| /packages/BC                                    | GET       | Get tour package by code                                                                                    |
| /tours                                          | GET       | Get list of all tours                                                                                       |
| /tours?size=3&page=0&sort=title,asc             | GET       | Get all tours,size=no. of items you want in the page, page=page no., sort by attribute in asc or desc order |
| /tours/search/findByTourPackageCode?code=BC     | GET       | Search tours within a tour package by tour package code                                                     |
| tours/1/ratings/                                | GET       | Get list of all ratings for a tour (1 represents {tourId} path parameter for tour 1)                        |
| tours/1/ratings/average                         | GET       | Get average score of ratings for a tour                                                                     |

### API Documentation

1. Creating Tour Package

{
"code" : "ZC",
"name" : "Zany Cali"
}

2. Creating Tour Rating

{
"score":5,
"comment":"It is great",
"customerId": 123
}
