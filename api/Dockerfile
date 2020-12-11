FROM openjdk:11-jre-slim-sid

WORKDIR /usr/src/app
COPY target/api.jar api.jar

EXPOSE 8084
EXPOSE 8085

ENV JAVA_OPTS "-Xms128m -Xmx1536m"

CMD ["java", "$JAVA_OPTS", "-jar", "/usr/src/app/api.jar"]
# java ${JAVA_OPTS} -jar "/usr/src/app/api.jar"