# Testing
Object <> Entity <> Controller <> Service <> Repository <> Api / UI

## Strategy
- Inside out testing : Left to right
- Outside in testing : Right to Left ( - for more difficult integrations)

## Red - Green refactoring
- Build a test
- Write the code to satisfy the test
- Repeat


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