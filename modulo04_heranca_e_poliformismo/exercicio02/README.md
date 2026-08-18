# **📌 Usuário de um Sistema**

> **Módulo:** Herança e Poliformismo em Java
> 
> 
> **Linguagem:** Java (JDK 21+)
> 

---

## **🎯 Enunciado**

- Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, use os seguintes requisitos:
    - Classe Gerente que terá os atributos:
        - Nome, Email, Senha e um atributo que informa se ele é administrador, esse último deve ser sempre verdadeiro;
    - Classe Vendedor que terá os seguintes atributos:
        - Nome, Email, Senha, Quantidade de vendas e um atributo que informa se ele é administrador, esse último deve ser sempre falso;
    - Classe Atendente que terá os seguintes atributos:
        - Nome, Email, Senha, Valor em caixa e um atributo que informa se ele é administrador, esse ultimo deve ser sempre falso.

Cada classe deve ter seus respectivos getters e setters ( para atributos que façam sentido ter) e as classes devem ter os seguintes métodos 

- A classe Gerente deve ter os métodos Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha;
- A classe Vendedor deve ter os métodos Realizar venda ( incrementar o número de vendas quando acionado), Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha;
- A classe Atendente deve ter os métodos Receber pagamentos (onde o método recebe um valor que deve ser incrementado no valor em caixa), Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar senha;

---

## **💻 Conceitos & Tecnologias Aplicados**

- **Entrada e Saída de Dados:** Uso da classe `Scanner` e exibição da mensagem com `println`
- **Operações:**
    - Uso de laços `if/else` para validação e operadores relacionais para comparação de valores
    - Criação da classe mãe `Usuario` com as propriedades solicitadas, métodos construtor, `alterarDados()` e `alterarSenha()`
    - Criação das subclasses `Gerente`, `Atendente` e `Vendedor` com as propriedades solicitadas, método construtor e um métodos específicos para cada tipo de funcionário de acordo com o solicitado
    - Criação das classes `MenuPrincipal` e `MenuUsuario` para melhor organização do código e uso dos laços `do/while`, para aplicação encerrar somente quando o usuário solicitar, e `switch/case` , para ações de acordo com a escolha

---

## **🚀 Como Executar**

1. Navegue até a pasta deste exercício
2. Compile o arquivo Java:
    
    ```
    javac NomeDoArquivo.java
    ```
