# Poc-Java-Sqs-DynamoDB-

Link api utilizada:<br></br>
https://jsonplaceholder.typicode.com/posts<br></br>
https://jsonplaceholder.typicode.com/posts/1

Localstack: https://github.com/localstack/localstack

Faça um clone do projeto atual e deste https://github.com/Ratkovski/Poc-Java-Sqs-DynamoDB-Consumer- para que ambos se comuniquem:

Esta aplicação tem por finalidade fazer uma consulta pegar as informações de determinado userID e publicá-las com o amazon sqs em filas de mensagens que ficam esperando esperando processamento.

E a aplicação https://github.com/Ratkovski/Poc-Java-Sqs-DynamoDB-Consumer- terá como objetivo escutar e consumir estes dados gravando no banco.

# Caso não tenha o docker

Download -> https://www.docker.com/products/docker-desktop

Configurações adicionais -> https://docs.microsoft.com/en-us/windows/wsl/install-manual

Ficou com dúvidas de como instalar siga o tutorial do youtube: <br></br>
https://www.youtube.com/watch?v=oQ08ZaOAiGU&ab_channel=CaravanaCloud

# Como rodar a aplicação

Dentro do projeto onde se encontra o arquivo docker-compose.yml rode o comando do docker para subir as configuraçoes do localstack:

```
docker-compose up  
```
Estes dois comandos abaixo servem para forçar a deletar imagens ou containers do docker que possam causar conflito
Comando do docker-compose para limpar os containers
```
docker container prune  
```
Comando do docker compose para limpar as imagens
```
docker images prune 
```

Baixe e instale a aws cli: \
https://docs.aws.amazon.com/pt_br/cli/latest/userguide/install-cliv1.html

Verifique se esta funcionando com:
```
aws --version
```
Comandos para configurar a aws. 

```
aws configure
AWS Access Key ID [None]: fakeAcessKey
AWS Secret Access Key [None]: fakeAcessSecret
Default region name [None]: sa-east-1
Default output format [None]: json
```
Criando uma fila:
```
aws --endpoint-url=http://localhost:4566 sqs create-queue --queue-name fila_dados
```

Criando uma stack:
```
aws cloudformation create-stack --stack-name jsonstack --template-body file://resource.yml --region sa-east-1 --endpoint-url http://localhost:4566
```

Listando tabelas do dynamodb:
```
aws dynamodb list-tables --endpoint-url http://localhost:4566
```
Listando os dados do banco:
```
aws dynamodb scan --table-name posts --endpoint-url http://localhost:4566
```
Exemplo de requisição: GET:
```
http://localhost:8081/posts/1
```
