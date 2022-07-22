
# Spring Boot Hexagonal Architecture Installment Simulator

Tecnologias utilizadas:

- Spring Boot
- Spring Data MongoDB
- REST
- MongoDB
- JUnit
- Mockito
- Lombok
- OpenAPI

## Simulando Parcelamento

POST /v1/simulations
RequestBody : SimulatorRequestDto

O projeto simulador de parcelamento consiste em gerar parcelas a partir dos seguintes dados informados.

Dados para simulação:
- valueTotal = 120.0

- firstDueDate = 2022-07-22

- quantityParcel = 10

- description = Parcelas referente a assinatura XX

Acessando o endpoint informado e efetuando o request com os dados acima teremos o seguinte resultado:

- 01 -> Parcela : 01/03 - Valor : 40.00 - Data vencimento : 20/09/2022 

- 02 -> Parcela : 02/03 - Valor : 40.00 - Data vencimento : 20/10/2022 

- 03 -> Parcela : 03/03 - Valor : 40.00 - Data vencimento : 19/11/2022 

Ao gerar as parcelas, é verificado se a soma das parcelas não deu alguma diferença do valor total, se der, a diferença é
somada a última parcela, como por exemplo:

Dados para simulação:
- valueTotal = 36,50 

- firstDueDate = 2022-07-22

- quantityParcel = 4


- 01 -> Parcela : 01/04 - Valor : 9.12 - Data vencimento : 20/09/2022

- 02 -> Parcela : 02/04 - Valor : 9.12 - Data vencimento : 20/10/2022

- 03 -> Parcela : 03/04 - Valor : 9.12 - Data vencimento : 19/11/2022

- 04 -> Parcela : 04/04 - Valor : 9.14 - Data vencimento : 19/12/2022

Total parcelas = 36,48 - 36,50 = 0,2 ( adicionado a última parcela )

O retorno da simulação irá retornar um campo id com um valor, esse valor poderá ser usado para recuperar a simulação.

#E Recuperando Simulação

GET /v1/simulations

Acessando o endpoint e informando o id da simulação é possível recuperar as parcelas da mesma.
