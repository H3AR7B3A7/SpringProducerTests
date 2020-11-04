# Reactive web
Producer -> Consumer  
RESTful web service with Spring WebFlux that gets consumed by service with a WebClient.  
See the [SpringConsumerTests](https://github.com/H3AR7B3A7/SpringConsumerTests) for the consumer side.

# Testing
Object <> Entity <> Controller <> Service <> Repository <> Api / UI

### Strategy
- Inside out testing : Left to right
- Outside in testing : Right to Left ( - for more difficult integrations)

### Red - Green refactoring
- Build a test
- Write the code to satisfy the test
- Repeat

## Mockito
Mockito is an open source testing framework for Java. It allows the creation of test double objects (mock objects) in automated unit tests for the purpose of test-driven development.

## Spring cloud contract
When using wiremock to mock producer data there is no way to tell if there are fields that no longer exist in the api you consume data from.
To detect this we can use a contract that defines a relation you expect to exist.

# Mongo

[Mongo Docs](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#reference)

### Atlas
application.properties:

    spring.data.mongodb.uri= <Uri provided by atlas>
    spring.data.mongodb.database= <Database name>
    
### Local daemon
application.properties:

    spring.data.mongodb.host=localhost
    spring.data.mongodb.port=27017
    spring.data.mongodb.database= <Database name>
    
---
[CLI Cheat Sheet](https://gist.github.com/bradtraversy/f407d642bdc3b31681bc7e56d95485b6)