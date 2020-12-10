FROM openjdk:11-jre-slim-sid

WORKDIR /usr/src/app
COPY target/api.jar api.jar

EXPOSE 8080
EXPOSE 8081

ENV JAVA_OPTS "-Xms128m -Xmx1536m"

java ${JAVA_OPTS} -jar "/usr/src/app/api.jar"