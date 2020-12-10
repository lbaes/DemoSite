FROM openjdk:11-jre-slim-sid

WORKDIR /usr/src/app
COPY target/admin.jar admin.jar

EXPOSE 8080
EXPOSE 8081

ENV JAVA_OPTS "-Xms128m -Xmx1536m"

# java ${JAVA_OPTS} -jar "/usr/src/app/admin.jar"