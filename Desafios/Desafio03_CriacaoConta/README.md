# 📌 Criação de Conta em um Banco

> **Módulo:** Pratique Lógica e Fundamentos em Java
> 
> 
> **Linguagem:** Java (JDK 21+)
> 

---

## 🎯 **Desafio**

Você foi contratado como desenvolvedor júnior para a equipe de um novo app bancário digital chamado BankEasy. Seu primeiro desafio é implementar uma funcionalidade essencial: o sistema de saudação personalizada para clientes. Toda vez que um usuário faz login, o app deve exibir uma mensagem de boas-vindas com base no nome do cliente e no tipo de conta que ele possui. O objetivo é garantir que cada cliente se sinta valorizado ao acessar o aplicativo.

Sua tarefa é criar um programa que receba o nome do cliente e o tipo de conta (corrente, poupanca ou investimento) e retorne uma mensagem de saudação personalizada. Se o tipo de conta informado não for reconhecido, o sistema deve retornar uma mensagem de erro amigável. Não utilize bibliotecas externas, apenas recursos básicos da linguagem.

## 🎯 **Entrada**

Uma única linha contendo dois valores separados por espaço: o nome do cliente (sem espaços) e o tipo de conta (corrente, poupanca ou investimento). O nome pode conter letras e números.

## 🎯 **Saída**

Uma linha com a mensagem de saudação no seguinte formato: "Bem-vindo(a), `[nome]`! Sua conta `[tipo]` está pronta para uso." Caso o tipo de conta não seja válido, exiba: "Tipo de conta invalido."

---

## 💻 Conceitos & Tecnologias Aplicados

- **Entrada e Saída de Dados:** Uso da classe `Scanner` e exibição da mensagem com `println`
- **Operações:**
    - Uso de laços `if/else` para validação e uso do método `equalsIgnoreCase()` para comparação de Strings
    - Uso do método `split()` , da classe String, para separar a entrada string em duas informações

---

## 🚀 Como Executar

1. Navegue até a pasta deste exercício
2. Compile o arquivo Java:
    
    ```bash
    javac NomeDoArquivo.java
    ```
