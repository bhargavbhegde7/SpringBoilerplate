FROM java:8
VOLUME /tmp
EXPOSE 8070
ADD target/SpringHello.jar SpringHello.jar
ENTRYPOINT ["java","-jar","SpringHello.jar"]
