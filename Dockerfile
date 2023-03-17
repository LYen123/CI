FROM hub.c.163.com/housan993/centos7_jdk8:latest
COPY demo-0.0.1-SNAPSHOT.jar /
CMD java -jar demo-0.0.1-SNAPSHOT.jar
