Kubernetes

- open source, k8s, utilizado para automatizar a implantação, o dimensionamento e o gerenciamento de aplicativos em contâiner
- ele é disponibilizado através de APIs, acessado pelo kubectl
- o k8s trabalha através de Clusters, ou seja, um conjunto de máquinas (nodes)
- cada máquina dentro desses clusters possui uma quantidade de vCPU e memória

Pods

- unidade que contém os containers provisionados
- o pod representa os processos rodando no cluster

ReplicaSet

- estrategia para manter e replicar pods, mesmo que você finalize um deles, o serviço coloca de pé para seguir a regra

Deployment

- controla a quantidade de ReplicaSets de uma instância, de modo que provisiona automaticamente a escala
- dado que um cluster está esgotado em recurso, pode alocar automaticamente em outro nó do cluster

Rodando

- kind create cluster
- docker ps (precisa mostrar o kind rodando)
- kubectl get nodes (mostrar o node que subiu)
- kind create cluster --config=./k8s/kind.yaml --name=fullcycle

Ordem de Execução para aplicação de configuração

- Deployment > ReplicaSet > Pod

Rollout

- kubectl rollout undo deploymeny goserver // volta a última imagem do deployment, re-configurando o replicaSet
- kubectl rollout undo deploymeny goserver --to-revision=2 // para uma específica

Proxy

- para acesso das apis internas
- kubectl proxy --port=8080
