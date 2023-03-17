FROM hub.c.163.com/housan993/centos7_jdk8:latest
COPY park-1.0-SNAPSHOT.jar /
CMD java -jar park-1.0-SNAPSHOT.jar