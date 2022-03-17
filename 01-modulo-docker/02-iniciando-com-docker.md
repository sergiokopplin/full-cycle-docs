Comandos Docker:

- docker ps
  lista os containers em uso no sistema

- docker ps -a
  lista os containers ativos e inativos

- docker run hello-world
  executa uma imagem específica docker, localmente ou remota. Se for remota, será baixada para rodar

- docker run -it ubuntu bash
  modo interativo do container run ubuntu

- docker run -it --rm ubuntu bash
  modo interativo do container, quando sair od container será desligado automaticamente

- docker run -p 8080:80 nginx
  quando acessar o 8080 do host, o docker redireciona para o 80 do container

- docker run -d -p 8080:80 nginx
  rodar o container em modo detached no terminal

- docker run -d -p 8080:80 --name nginx nginx
  inicia um container com um nome específico

- docker start 3fa355139c2b
  inicia um container específico que estava desligado

- docker rm 3fa355139c2b
  remove um container específico

- docker rm jovial_mclaren
  remove container pelo nome

- docker rm jovial_mclaren -f
  mata o processo e remove container pelo nome

- docker exec nginx ls
  executa um comando dentro do container que estava rodando

- docker exec -it nginx bash
  executa um comando dentro do container e inicia o processo

- docker run -d -p 8080:80 --name nginx -v ~/projects/full-cycle-course/01-modulo-docker/examples/html:/usr/share/nginx/html nginx
  monta uma pasta específica em um container, porém é melhor usar o --mount

- docker run -d -p 8080:80 --name nginx --mount type=bind,source="$(pwd)"/html,target=/usr/share/nginx/html nginx
  monta volume com --mount

- docker volume ls
  lista os driver e volumes

- docker volume create meuvolume
  cria um volume

- docker volume inspect meuvolume
  inspeciona um volume específico

- docker run -d -p 8080:80 --name nginx --mount type=volume,source=meuvolume,target=/usr/share/nginx/html nginx
  monta container apontando um volume

- docker volume prune
  elimina volumes
