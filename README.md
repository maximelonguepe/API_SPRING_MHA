# Creation of an api spring boot with hibernate connection to a MYSQL database
The purpose of this project is to allow me to practice with APIs (in particular SPRING APIs) and to have an overview of the API I will create.
The goal would be in a second time to consume this API with a site developed in REACT or a heavy client application in JAVA.
I chose the SPRING framework because it is known for its speed in developing APIs.
Concerning the theme of the API I chose to make it on My Hero Academia because I was watching this anime when I started my developments.
If you want more information about this series you can visit the following website: https://en.wikipedia.org/wiki/My_Hero_Academia
<br>
## My hero academia in a nutshell
In a nutshell: almost the entire population of the planet starts to develop superhuman powers, also called Quirks. In this society there is an upsurge of villains. To compensate for this, professional heroes defend the population against these criminals. It is therefore a permanent struggle and promising young people can enter special schools to improve their quirks and thus become professional heroes.
This api allows to expose the heroes, to have their rankings but also to have more information on the villains and their quirks. It also allows to expose the student superheroes and their school.

## The different routes defined for my api.
Get : Get data.<br>
Post : Save or update (thanks to partial update) an object provided in the body of the request.<br>
Delete : Delete an object provided in the body of the request.

## The different return HTTP codes
200 : ok<br>
404 : data not found<br>
409: conflict (for a deletion: foreign key constraint problem, for an insertion: primary key problem).

## Interaction with the database
For the interaction with the database I used Hibernate.
<br>
Coupled with that I used the JpaRepository interface which allows to greatly facilitate the interactions with the database with already built methods

## Problems I encountered during this project
At first I had some difficulties building the project and configuring the IDE but the problem was quickly solved.<br>
Then I had problems because I wanted to create the entityFactory without the help of the framework, I could have made the project work with this outadated method but I chose to go with JpaRepository and the @Autowired annotations<br>
Then I had some problems with the @OneToMany and @ManyToOne relationships which created an infinite recursion between my entities. To solve this problem I added the @JsonIgnoreProperties annotation


## What I gained from this project
It is a relatively simple API but it allows to have a global vision of the project. This project also allowed me to practice unit testing.
I also gained experience with the spring boot framework, the use of JpaRepository which greatly simplifies interactions with the database.
I also understood the interest of autowired. I configured a swagger to allow me to test my api.



