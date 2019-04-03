FROM openjdk:8-jre-alpine
ENV APP_FILE config-service-1.0-SNAPSHOT.jar
ENV APP_HOME /app
EXPOSE 8088
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]


ENV APP_FILE discovery-service-1.0-SNAPSHOT.jar
ENV APP_HOME /app
EXPOSE 8061
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]


ENV APP_FILE proxy-service-1.0-SNAPSHOT.jar
ENV APP_HOME /app
EXPOSE 8060
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]


ENV APP_FILE employee-service-1.0-SNAPSHOT.jar
ENV APP_HOME /app
EXPOSE 8090
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]


ENV APP_FILE organization-service-1.0-SNAPSHOT.jar
ENV APP_HOME /app
EXPOSE 8092
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]


ENV APP_FILE department-service-1.0-SNAPSHOT.jar
ENV APP_HOME /app
EXPOSE 8091
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]