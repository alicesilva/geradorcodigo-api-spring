# Gerador de código para uma API REST baseada no framework Spring Boot

Repositório para o gerador de código para uma API REST baseada no framework Spring Boot com o objetivo de minimizar a programaço repetitiva e oferecer um sistema CRUD para o desenvolvimento de back-end em Spring Boot.

## Plugin do gerador de código para IDE Eclipse

Link para download: [Plugin](https://github.com/alicesilva/geradorcodigo-api-spring/blob/master/plugin/org.xtext.tcc.mydsl.feature_1.0.0.201911140943.jar)

## Instalação do plugin na IDE Eclipse

Entre na IDE Eclipse e siga os seguintes passos:

1. Help -> Install New Software -> Add -> Local...;
2. Selecione a pasta onde o plugin está salvo e clique em Add;
3. Selecione o plugin e clique em Next e logo após em Finish.

## Arquivo de configuração:

Logo após a reinicializaço da IDE é preciso criar um projeto Java (New -> Java Project).
Para obter os arquivos gerados é necessário inserir na pasta src um arquivo .mydsl, de acordo com o seguinte template:

<ul>
  <li>Nome da api;</li>
  <li>Uma lista de entidades;</li>
  <li>Para cada entidade deve ser informado:</li>
  <ul>
    <li>Nome da entidade;</li>
    <li>Lista de atributos.</li>
  </ul>
  <li>Para cada atributo deve ser fornecido:</li>
  <ul>
    <li>Nome do atributo;</li>
    <li>Tipo do atributo;</li>
  </ul>
  <li>Nome da associação/relacionamento entre alguma entidade e este atributo;</li>
  <li>Lista de operações que serão realizadas em cascata, no caso em que houver relacionamentos.</li>
</ul>

![](https://github.com/alicesilva/geradorcodigo-api-spring/blob/master/img/Captura%20de%20tela%20de%202019-11-20%2020-36-12.png?raw=true)


Os arquivos resultantes são gerados na pasta src-gen.
