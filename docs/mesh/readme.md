Service Mesh

- é uma camada extra junto ao cluster visando monitorar e modificar em tempo real o tráfego das aplicações, bem como a segurança e confiabilidade

Istio

- open source que implementa service mesh visando gerenciar aplicações distribuidas independente de linguagem

Pra que serve?

- gerenciar trafego
- - gateways
- - load balancer
- - timeout
- - politicas de retry
- - circuit breaker
- - fault injection

- observabilidade
- - métricas
- - traces distribuidos
- - logs

- segurança
- - man-in-the-middle
- - mTLS
- - AAA (authentication, authorization e audit)

Como Funciona?
Dentro de cada pod é inserido um proxy controlado pelo Istio, e esses proxys são monitorados pelo mesmo Istio. A conversa entre os proxys dos pods se chama Data Plane (Mesh Traffic) e o controlador dos Proxies se chama Control Plane

proxy <-> proxy (olhando pros dois -> istio)

Em cada POD, para enviar ou receber informações, os dados precisam passar pelo proxy
O tráfego que entra na Mesh chama Ingress Traffic, e o que sai da Mesh é o Egress Traffic
