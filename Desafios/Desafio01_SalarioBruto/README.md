# 📌 Cálculo Salário Bruto

> **Módulo:** Desafio de Código: Aperfeiçoe Sua Lógica e Pensamento Computacional
> 
> 
> **Linguagem:** Java (JDK 21+)
> 

---

## 🎯 Enunciado

Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.

Para realizar o cálculo receba o valor bruto do salário e o adicional dos benefícios.

O salário a ser transferido é calculado da seguinte maneira:

**(valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefícios**

Para calcular o percentual de imposto segue as alíquotas:

De R$ 0.00 a R$ 1100.00 = 5.00%

De R$ 1100.01 a R$ 2500.00 = 10.00%

Maior que R$ 2500.00 = 15.00%

## 🎯 **Entrada**

A entrada consiste em vários arquivos de teste, que conterá o **valor bruto do salário** e **adicional dos benefícios**.

## 🎯 **Saída**

Gerar uma linha com um número que será a diferença entre o valor bruto do salário e o percentual de imposto mediante a faixa salarial somando com o adicional dos benefícios.

---

## 💻 Conceitos & Tecnologias Aplicados

- **Entrada e Saída de Dados:** Uso da classe `Scanner` e exibição da mensagem com `println`
- **Operações:**  uso de laços `if/else` para validação, operadores aritméticos simples para cálculos gerais e operadores relacionais para comparação de valores

---

## 🚀 Como Executar

1. Navegue até a pasta deste exercício
2. Compile o arquivo Java:
    
    ```bash
    javac NomeDoArquivo.java
    ```
