FROM nginx:latest

# cria uma pasta e aciona como working directory
WORKDIR /app

RUN apt-get update
RUN apt-get install vim -y

# comando fixo de entrada
ENTRYPOINT ["echo", "Hello"]

# comando de entrada, porém que pode ser sobescrito pelos params de entrada no comando docker
CMD ["echo", "World"]

COPY html /usr/share/nginx/html