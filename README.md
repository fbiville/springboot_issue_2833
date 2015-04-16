# Issue 2833 with Spring Boot

## Build & run

```shell
 $> mvn
```

## Check

```shell
 # sanity check with Jersey - 200 OK
 $> curl -I http://localhost:8080/api/hello 
 # static file in src/main/webapp - 200 OK
 # thanks to JerseyConfig.java & application.properties
 $> curl -I http://localhost:8080/static.html
 # generated file in war exploded dir - 404 Not Found :(
 $> curl -I http://localhost:8080/index.html
```
