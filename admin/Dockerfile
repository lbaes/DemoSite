FROM openjdk:11-jre-slim-sid

WORKDIR /usr/src/app
COPY target/admin.jar admin.jar

EXPOSE 8082
EXPOSE 8083

ENV JAVA_OPTS "-Xms128m -Xmx1536m"

CMD ["java", "-Xms128m -Xmx1536m", "-jar", "/usr/src/app/admin.jar"]
# java ${JAVA_OPTS} -jar "/usr/src/app/admin.jar"