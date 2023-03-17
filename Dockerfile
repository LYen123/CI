FROM hub.c.163.com/housan993/centos7_jdk8:latest
VOLUME /tmp
ADD target/park-1.0-SNAPSHOT.jar park.jar
EXPOSE 8888
