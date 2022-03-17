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
