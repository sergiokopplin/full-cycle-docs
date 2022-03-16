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
  modo interativo do container, quando sair o container será desligado automaticamente

- docker run -p 8080:80 nginx
  quando acessar o 8080 do host, o docker redireciona para o 80 do container

- docker run -d -p 8080:80 nginx
  rodar o container em modo detached no terminal
