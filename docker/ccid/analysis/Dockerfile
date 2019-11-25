FROM python:3.6.7-slim
MAINTAINER qiang.wei@deltaww.com
COPY ./app /app
WORKDIR /app
RUN apt-get update -y && apt-get install --no-install-recommends -y gcc g++ \
    && pip uninstall -y setuptools &&  pip install --ignore-installed setuptools==41.0.0 \
    && pip install -r requirements.txt \
    && apt-get remove -y gcc g++ && apt-get autoremove -y && apt-get autoclean && rm -rf /var/lib/apt/lists/*

#https://www.java.com/en/download/manual.jsp

ADD jre-8u221-linux-x64.tar.gz /usr/java/jre/
ENV  JAVA_HOME /usr/java/jre
ENV PATH ${PATH}:${JAVA_HOME}/jre1.8.0_221/bin

EXPOSE 5569
CMD  [ "bash", "./run.sh" ]

#FROM python:3.6.7-alpine
#MAINTAINER qiang.wei@deltaww.com
#
#COPY ./app /app
#WORKDIR /app
#ENV LANG C.UTF-8
#
#RUN apk add --no-cache bash openjdk8-jre \
#    && apk add --no-cache --virtual=.build-deps \
#    tzdata \
#    gcc \
#    g++ \
#    alpine-sdk \
#    build-base \ 
#    libc-dev \
#    libxml2 \
#    libxml2-dev \
#    libxslt \
#    libxslt-dev \
#    jpeg-dev \
#    python3-dev \
#    linux-headers \
#    lapack-dev \
#    && cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
#    && echo Asia/Shanghai > /etc/timezone \
#    && pip install -r requirements_3.txt \
#    && pip install --no-index --find-links=./whls -r requirements_1.txt \
#    && pip install -r requirements.txt \
#    && apk del .build-deps \
#    && rm -rf /tmp/* /root/.cache
#
#EXPOSE 5569
#CMD  [ "bash", "./run.sh" ]


#FROM ubuntu:18.04
#MAINTAINER qiang.wei@deltaww.com
#
#COPY ./app /app
#WORKDIR /app
#ENV LANG C.UTF-8
#
#ADD jre-8u221-linux-x64.tar.gz /usr/java/jre/
#ENV JAVA_HOME /usr/java/jre
#ENV PATH ${PATH}:${JAVA_HOME}/jre1.8.0_221/bin
#
#
#RUN apt-get install -y  python3.6.7  &&  pip install -r requirements.txt
#
#EXPOSE 5569
#CMD  [ "bash", "./run.sh" ]