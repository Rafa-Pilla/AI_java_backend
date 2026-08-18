# **📌 Ingressos de Cinema**

> **Módulo:** Herança e Poliformismo em Java
> 
> 
> **Linguagem:** Java (JDK 21+)
> 

---

## **🎯 Enunciado**

Desenvolva um algoritmo que:

- Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema. O ingresso deve ter:
    - valor,
    - nome do filme
    - informar se é dublado ou legendado
- A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso família.
- Cada ingresso deve ter um método que retorna o seu valor real ( baseado no valor informado na criação do ingresso)
    - Para os de meia entrada o seu valor deve ser de metade do valor,
    - Para os ingressos família deve-se retornar o valor multiplicado pelo número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.

---

## **💻 Conceitos & Tecnologias Aplicados**

- **Entrada e Saída de Dados:** Uso da classe `Scanner` e exibição da mensagem com `println`
- **Operações:**
    - Uso de laços `if/else` para validação, operadores aritméticos para cálculos gerais e operadores relacionais para comparação de valores
    - Criação da classe mãe `Ingresso` com as propriedades solicitadas, métodos construtor, `toString()` e criação do catálogo de filmes por meio de lista, usando a classe Record `Filmes` para armazenar os valores
    - Criação das subclasses `Familia` e `MeiaEntrada` com as propriedades solicitadas, método construtor e um método específico para retornar o valor de ingresso de acordo com as regras de negócio estabelecidas

---

## **🚀 Como Executar**

1. Navegue até a pasta deste exercício
2. Compile o arquivo Java:
    
    ```
    javac NomeDoArquivo.java
    ```
