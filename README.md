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
