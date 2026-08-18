# **📌 Relógio**

> **Módulo:** Herança e Poliformismo em Java
> 
> 
> **Linguagem:** Java (JDK 21+)
> 

---

## **🎯 Enunciado**

- Crie uma hierarquia de classes que para criação de relógios para diferentes lugares do mundo
- Classe mãe com as propriedades: hora, minuto e segundos com seus respectivos getters e setters (atendendo as regras do funcionamento de um relógio)
    - Método que deve retornar a hora no formato HH:MM:SS
    - Outro método que ficará por responsabilidade da classe que estende-la definir seu funcionamento, esse método deve receber um relógio ( independente da implementação) e deve-se extrair as informações dele e usa-la no objeto que recebeu para acertar as novas informações do relógio
- A partir dessa classe crie 2 implementações, uma chamada relógio Americano e outra chamada relógio Brasileiro, (lembrando que para o relógio americano não existem as horas de 13 até 24)

---

## **💻 Conceitos & Tecnologias Aplicados**

- **Entrada e Saída de Dados:** Uso da classe `Scanner` e exibição da mensagem com `println`
- **Operações:**
    - Criação da classe Relogio com os atributos solicitados, métodos getter, setter, construtor e `formatoRelogio()` que retorna o horário no formato especificado
    - Criação dos menus usando o `do/while` para aplicação encerrar somente quando o usuário solicitar, além do uso do `switch/case` para ações de acordo com a escolha
    - Uso da classe `Calendar` para extrair valor de hora, minuto e segundo

---

## **🚀 Como Executar**

1. Navegue até a pasta deste exercício
2. Compile o arquivo Java:
    
    ```
    javac NomeDoArquivo.java
    ```
