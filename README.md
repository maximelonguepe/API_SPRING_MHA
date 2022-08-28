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

## The different return HTTP codes
200 : ok<br>
404 : data not found<br>
409: conflict (for a deletion: foreign key constraint problem, for an insertion: primary key problem).

## What I gained from this project
It is a relatively simple API but it allows to have a global vision of the project. This project also allowed me to practice unit testing.
I also gained experience with the spring boot framework, the use of JpaRepository which greatly simplifies interactions with the database.
I also understood the interest of autowired. I configured a swagger to allow me to test my api.



