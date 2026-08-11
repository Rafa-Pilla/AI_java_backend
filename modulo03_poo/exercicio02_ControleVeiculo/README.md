# 📌 Controle Veículo

> **Módulo:** Java e a Arte da Abstração com Classes e Encapsulamento
> 
> 
> **Linguagem:** Java (JDK 21+)
> 

---

## 🎯 Enunciado

Desenvolva um algoritmo onde controlamos as funções de um carro, ele deve ter as seguintes funções:

- Ligar o carro;
- Desligar o carro;
- Acelerador;
- Diminuir a velocidade;
- Virar para a esquerda/
- Verificar velocidade;
- Trocar a marcha

Cumprindo as seguintes regras de negócio:

- Quando o carro criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
- O carro desligado não pode realizar nenhuma função;
- Quando o carro para acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
- Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no mínimo a 0km);
- O carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
- A velocidade do carro deve respeitar os seguintes limites para cada velocidade
    - se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
    - se você estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
    - se você estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
    - se você estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
    - se você estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
    - se você estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
    - se você estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
- O carro pode ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
- O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km;

---

## 💻 Conceitos & Tecnologias Aplicados

- **Entrada e Saída de Dados:** Uso da classe `Scanner` e exibição da mensagem com `println`
- **Operações:**
    - Criação da classe `Carro` com os atributos solicitados, métodos getter, setter e construtor
    - Criação do menu usando o `do/while` para aplicação encerrar somente quando o usuário solicitar, além do uso do `switch/case` para ações de acordo com a escolha
    - Uso de laços `if/else` para validação, operadores aritméticos simples para cálculos gerais e operadores relacionais para comparação de valores
    - Criação de uma classe Record para armazenar os valores das marchas e o intervalo de velocidade suportado para cada uma delas

→ Auxilio do Gemini na criação da classe Record e criação da lógica de troca de marcha seguindo os limites de velocidade

---

## 🚀 Como Executar

1. Navegue até a pasta deste exercício
2. Compile o arquivo Java:
    
    ```bash
    javac NomeDoArquivo.java
    ```
