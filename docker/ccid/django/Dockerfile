FROM  docker.io/python:3.6.7-alpine
MAINTAINER qiang.wei@deltaww.com
COPY ./app /app
WORKDIR /app
ENV LANG C.UTF-8
EXPOSE 8000

RUN apk add --no-cache bash   \
    && apk add --no-cache --virtual=.build-deps \
    tzdata \
    gcc \
    g++ \
    alpine-sdk \
    build-base \ 
    libc-dev \
    libxml2 \
    libxml2-dev \
    libxslt \
    libxslt-dev \
    jpeg-dev \
    python3-dev \
    linux-headers \
    && cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo Asia/Shanghai > /etc/timezone \
    && pip install -r requirements.txt \
    && pip install --no-index --find-links=./whls -r requirements_1.txt \
    && apk del .build-deps \
    && rm -rf /tmp/* /root/.cache


CMD [ "bash", "./start.sh" ]

