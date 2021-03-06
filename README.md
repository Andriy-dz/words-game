# Word`s Game

### Postman commands for docker

###### Inject Data:
- Post: localhost:8081/inject

###### Game:
- Get: localhost:8081/words-game/begin    
- Get: localhost:8081/words-game/next?word=$word
- Post: localhost:8081/words-game/end

## Implementation details and technologies

### Project based on 3-layer architecture:
>- Presentation layer (controllers)
>- Application layer (services)
>- Data access layer (DAO)

### Technologies
>- Spring Boot
>- Spring Boot WEB
>- Spring Boot DATA
>- Hibernate
>- PostgreSQL
>- Lombok
>- Maven
>- Maven Checkstyle Plugin


## Setup by docker
Execute commands in the terminal :
- mvn clean package
- docker-compose up
