Demo: Using GraalVM native image for Spring Boot App
============
### Before beginning
- Make sure you've installed
  - Docker.
  - Maven.
### Steps to run the demo
- Build the image by the following command 

```mvn -Pnative spring-boot:build-image```
- To run the image:

```docker run --rm -p 8080:8080 docker.io/library/spring-graalvm-demo:0.0.1-SNAPSHOT```
