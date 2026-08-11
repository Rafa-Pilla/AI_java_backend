# 📌 Seleção de Números em um Intervalo Informado

> **Módulo:** Estrutura de Controle em Java
> 
> 
> **Linguagem:** Java (JDK 21+)
> 

---

## 🎯 Enunciado

Desenvolva um algoritmo que o usuário entre com dois números, sendo que o segundo precisa ser maior que o primeiro, e escolha entre as opções par ou ímpar. Com isso, o código precisa informar todos os números pares ou ímpares, de acordo com a seleção, no intervalo de números informados e em ordem decrescente

---

## 💻 Conceitos & Tecnologias Aplicados

- **Entrada e Saída de Dados:** Uso da classe `Scanner` e exibição da mensagem com `println`
- **Operações Matemáticas:**
    - Uso do laço for para percorrer os números entre o intervalo indicado;
    - Uso do operador aritmético `%` para verificar se o número é par ou ímpar;
    - Uso de ArrayList para transformar o resultado do laço em uma lista que poderia ser ordenada;
    - Uso do método `reverseOrder()` da classe Collections do Java, encontrada no Java Document, para ordenação decrescente da lista de números

---

## 🚀 Como Executar

1. Navegue até a pasta deste exercício
2. Compile o arquivo Java:
    
    ```bash
    javac NomeDoArquivo.java
    ```
