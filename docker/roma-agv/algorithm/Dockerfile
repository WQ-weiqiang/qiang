FROM python:3.7.3-alpine
COPY ./app /app
WORKDIR /app
ENV LANG C.UTF-8

RUN apk add --no-cache bash libxml2 libxml2-dev \
    && apk add --no-cache --virtual=.build-deps \
    tzdata \
    py-pip \
    gcc \
    g++ \
    freetype-dev \
    libc-dev \
    libxslt \
    libxslt-dev \
    python3-dev \
    linux-headers \
    && cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo Asia/Shanghai > /etc/timezone \
    && pip install --no-cache-dir -r requirements.txt \
    && apk del .build-deps \
    && rm -rf /tmp/* /root/.cache
#RUN pip install -r requirements.txt
EXPOSE 8085
CMD [ "bash", "./start.sh" ]