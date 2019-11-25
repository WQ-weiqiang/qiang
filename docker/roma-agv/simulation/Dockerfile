FROM openjdk:8-jre-alpine
WORKDIR /app
ENV LANG C.UTF-8
ADD *.jar /app/
ADD config /app/config
ADD start.sh /app
EXPOSE 8091
CMD [ "sh", "./start.sh" ]