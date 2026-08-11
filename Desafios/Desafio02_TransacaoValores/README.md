# 📌 Transação de Valores

> **Módulo:** Pratique Lógica e Fundamentos em Java
> 
> 
> **Linguagem:** Java (JDK 21+)
> 

---

## 🎯 Desafio

Você foi contratado como desenvolvedor júnior em um banco digital inovador. Sua primeira tarefa é criar uma funcionalidade simples, porém essencial: um verificador de saldo. Clientes do banco frequentemente consultam seus saldos para saber se podem realizar compras ou transferências. Para garantir uma experiência ágil, o sistema precisa informar rapidamente se o saldo é suficiente para uma determinada operação. Sua missão é implementar um programa que receba o saldo atual da conta e o valor de uma transação, e informe se a transação pode ser realizada ou não.

Implemente um programa que leia dois valores inteiros: o saldo disponível na conta e o valor da transação desejada. O programa deve verificar se o saldo é maior ou igual ao valor da transação. Se for suficiente, imprima "Transacao aprovada". Caso contrário, imprima "Saldo insuficiente". Considere que os valores sempre serão inteiros e não negativos. Não utilize bibliotecas externas, apenas recursos padrão da linguagem.

## 🎯 **Entrada**

Dois números inteiros separados por espaço, representando respectivamente o saldo disponível e o valor da transação. Ambos os valores são maiores ou iguais a zero.

## 🎯 **Saída**

Uma única linha contendo "Transacao aprovada" se o saldo for suficiente para a transação, ou "Saldo insuficiente" caso contrário.

---

## 💻 Conceitos & Tecnologias Aplicados

- **Entrada e Saída de Dados:** Uso da classe `Scanner` e exibição da mensagem com `println`
- **Operações:** uso de laços `if/else` para validação e operadores relacionais para comparação de valores

---

## 🚀 Como Executar

1. Navegue até a pasta deste exercício
2. Compile o arquivo Java:
    
    ```bash
    javac NomeDoArquivo.java
    ```
