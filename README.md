# Poc-Java-Sqs-DynamoDB-


Baixe e instale a aws cli: \
https://docs.aws.amazon.com/pt_br/cli/latest/userguide/install-cliv1.html

Verifique se esta funcionando com:
```
aws --version
```
Comandos para configurar a aws. Como vamos usar o localstack pode colocar um valor fictício nas configurações. \
Localstack: https://github.com/localstack/localstack

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
