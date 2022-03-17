FROM nginx:latest

# cria uma pasta e aciona como working directory
WORKDIR /app

RUN apt-get update
RUN apt-get install vim -y

COPY html /usr/share/nginx/html