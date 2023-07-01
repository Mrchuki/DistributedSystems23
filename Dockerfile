FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ADD target/distributed_systems-0.0.1-SNAPSHOT.jar distributed_systems-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/distributed_systems-0.0.1-SNAPSHOT.jar" ]