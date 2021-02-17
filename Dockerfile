FROM openjdk:8
COPY target/api-pedidos-kubernetes.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar