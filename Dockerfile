From tomcat:8.0.51-jre8-alpine

#RUN rm -rf /usr/local/tomcat/webapps/*

copy ./target/services.war /usr/local/tomcat/webapps/services.war

#EXPOSE 80

#CMD ["catalina.sh","run"]
