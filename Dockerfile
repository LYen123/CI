FROM jdk:8
VOLUME /tmp
ADD target/park-1.0-SNAPSHOT.jar park.jar
EXPOSE 8888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/park.jar"]