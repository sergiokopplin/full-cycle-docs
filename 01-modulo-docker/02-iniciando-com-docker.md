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
