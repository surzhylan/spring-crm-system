# spring-crm-system
spring boot project about CRM System

Created a web application in Spring Boot using Thymeleaf library as a view. 
Created a mini application of requests for processing CRM system. To implement this task we use Spring Data library + PostgreSQL. Created the basic layout (Layout) of your page, using the library Thymeleaf Layout Dialect.
So on the main page we will have a list of all requests. Requests will be added through the form of requests.
The main page will look like this (All requests):

<img width="1350" alt="Снимок экрана 2023-04-19 в 20 24 38" src="https://user-images.githubusercontent.com/102981223/233108240-496b74f0-3e5c-4955-896c-241be78b87ba.png">

The entity of the request itself will be like this:
 
ApplicationRequest.java
- Long id;
- String userName;
- String courseName;
- String commentary;
- String phone;
- boolean handled; //processed or not
- Courses course; //@ManyToOne
 
Used the Lombok library to automatically generate constructors, getters and setters.
We should be able to create tasks, see their list, edit the task and of course delete them. Use Bootstrap as your CSS library.
We will have a pre-added list of all possible courses in the database. Pro add a request, in the sample you can display the name of the course and the price, as shown in the example (Add request):

<img width="1297" alt="Снимок экрана 2023-04-19 в 20 09 47" src="https://user-images.githubusercontent.com/102981223/233108876-008d08ff-3447-4171-8e00-6bc0dc4a2aa5.png">

I added a separate list of operators to the database. These operators will be some kind of handlers for all requests.
 
Operators.java
- Long id;
- String name;
- String name;
- String department; //IT, sales, marketing.
 
I have built a mapping between the application tables and the operator through many-to-many.
 
The assignment process will look like this:

<img width="1297" alt="Снимок экрана 2023-04-19 в 20 23 28" src="https://user-images.githubusercontent.com/102981223/233110804-71df9068-d2d3-47ca-bb1e-335194080295.png">

As a result, we can see a list of all assigned operators:

<img width="1297" alt="Снимок экрана 2023-04-19 в 20 23 47" src="https://user-images.githubusercontent.com/102981223/233111063-8368ab67-1b52-4ff5-89bb-3a4692428107.png">

As a result, we can see a list of all processed applications and unprocessed (new) applications:

<img width="1343" alt="Снимок экрана 2023-04-19 в 20 25 19" src="https://user-images.githubusercontent.com/102981223/233111870-b856b37f-c07a-4211-8125-3b7920b2b163.png">

<img width="1347" alt="Снимок экрана 2023-04-19 в 20 24 59" src="https://user-images.githubusercontent.com/102981223/233111934-7eb121fa-f610-46c5-a480-59b2984fca26.png">
