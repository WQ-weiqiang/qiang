FROM python:3.6.7-alpine
COPY ./app /app
WORKDIR /app
ENV LANG C.UTF-8

RUN apk add --no-cache bash \
    && apk add --no-cache --virtual=.build-deps \
    tzdata \
    gcc \
    libc-dev \
    libxml2 \
    libxml2-dev \
    libxslt \
    libxslt-dev \
    python3-dev \
    linux-headers \
    && cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo Asia/Shanghai > /etc/timezone \
    && pip install -r requestments.txt \
    && apk del .build-deps \
    && rm -rf /tmp/* /root/.cache
CMD ["python"] 