O que é Docker?

- Docker is an open platform for developing, shipping, and running applications. Docker enables you to separate your applications from your infrastructure so you can deliver software quickly. With Docker, you can manage your infrastructure in the same ways you manage your applications. By taking advantage of Docker’s methodologies for shipping, testing, and deploying code quickly, you can significantly reduce the delay between writing code and running it in production.
  https://docs.docker.com/get-started/overview/

---

Namespaces:
Parte responsável por isolar os processos, de forma que os processos de cada container conhecem apenas o seu próprio contexto.

CGroups:
Uma parte importante do Docker são os CGroups, onde podemos dimensionar os limites que os recursos que processos usarão.

Imagens:
São compostas por dependências, onde eu construo a minha aplicação e injeto as minhas dependências em camadas, com um formato de árvore de dependências.

Dockerfile:
Arquivo declarativo que configura um ambiente docker.

Docker file gera um build, e quando o build é gerado, uma nova imagem é criada. Através de um commit também é possível gerar uma nova versão de imagem através de um container.

Image Registry:
Onde podemos fazer push das nossas imagens e versões.

Camadas do Docker:

- Docker Client, faz a comunicação com o Docker Host, através de run, pull, push, volumes e networks através da API do HOST, daemon API.
- Docker Host, contêm todas as propriedades dos containers, daemon API, Volumes, Cache e Network.
- daemon API, responsável pela comunicação entre client e host.
- Volumes, persistência de dados, quando se mata todo o dado se perde.
- Cache, pull e push do registry do docker.
- Network, comunicação entre containers (processos).
