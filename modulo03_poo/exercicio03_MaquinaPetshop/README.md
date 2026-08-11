# 📌 Administração Máquina Petshop

> **Módulo:** Java e a Arte da Abstração com Classes e Encapsulamento
> 
> 
> **Linguagem:** Java (JDK 21+)
> 

---

## 🎯 Enunciado

Desenvolva um algoritmo onde temos o controle de banho de um petshop, a maquina de banho dos pets deve ter as seguintes operações:

- Dar banho não pet;
- Abastecer com água;
- Abastecer com shampoo;
- Verificar nível de água;
- Verificar nível de shampoo;
- Verifique se o animal não tem banho;
- Colocar pet na máquina;
- Retirar pet da máquina;
- Limpar máquina.

Cumprindo as seguintes regras de negócio:

- A máquina de banho deve permitir apenas 1 animal de estimação por vez;
- Cada banho realizado deverá consumir 10 litros de água e 2 litros de shampoo;
- A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
- Se o animal for retirado da máquina sem estar limpo, será necessário limpar a máquina para permitir a entrada de outro animal;
- A máquina de limpeza irá consumir 3 litros de água e 1 litro de shampoo;
- O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;

---

## 💻 Conceitos & Tecnologias Aplicados

- **Entrada e Saída de Dados:** Uso da classe `Scanner` e exibição da mensagem com `println`
- **Operações:**
    - Criação da classe `Maquina` com os atributos solicitados, métodos getter, setter e construtor
    - Criação do menu usando o `do/while` para aplicação encerrar somente quando o usuário solicitar, além do uso do `switch/case` para ações de acordo com a escolha
    - Uso de laços `if/else` para validação, operadores aritméticos simples para cálculos gerais e operadores relacionais para comparação de valores

---

## 🚀 Como Executar

1. Navegue até a pasta deste exercício
2. Compile o arquivo Java:
    
    ```bash
    javac NomeDoArquivo.java
    ```
