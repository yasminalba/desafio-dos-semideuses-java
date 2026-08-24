# 🏛️ Desafio dos Semideuses

Projeto desenvolvido em **Java** com temática inspirada no universo de Percy Jackson.

O programa permite que o usuário escolha um semideus, visualize sua ficha técnica e participe de um minijogo relacionado ao personagem escolhido.

## 🎮 Como funciona

Ao iniciar o programa, o usuário pode escolher entre quatro semideuses:

- ⚡ **Percy Jackson** — Jogo de adição
- 🦉 **Anabeth Chase** — Jogo de adivinhação
- 💀 **Nico di Angelo** — Jogo de multiplicação
- ⚡ **Thalia** — Jogo de subtração

Após escolher um personagem, o programa apresenta algumas informações sobre ele:

- Poder
- Pai ou mãe divino(a)
- Inimigo
- Objeto de poder
- Efeito colateral

Depois da ficha técnica, o usuário participa do minijogo correspondente ao semideus escolhido.

Ao final, é possível escolher se deseja **jogar novamente**.

## 🧩 Conceitos de Java utilizados

Este projeto foi desenvolvido para praticar conceitos de **Programação Orientada a Objetos (POO)** e lógica de programação.

- Classes e objetos
- Encapsulamento
- Herança (`extends`)
- Interfaces (`implements`)
- Sobrescrita de métodos (`@Override`)
- Getters e Setters
- Estruturas condicionais (`if/else`)
- Estrutura `switch/case`
- Estrutura de repetição `do/while`
- Entrada de dados com `Scanner`
- Geração de números aleatórios com `Random`
- Métodos estáticos
- Organização do código em diferentes classes

## 🏗️ Estrutura do projeto

```text
src/
│
├── Personagem.java
├── deuses.java
├── semideuses.java
├── joguinho.java
├── minijogos.java
└── main.java
```

## 🧬 Hierarquia das classes

```text
Personagem
    │
    ▼
  deuses
    │
    ▼
semideuses
```

A classe `semideuses` também implementa a interface `joguinho`, responsável por definir o método de execução dos minijogos.

## 🎲 Minijogos

Cada personagem possui um desafio diferente:

| Semideus       | Desafio                       | Operação            |
|----------------|-------------------------------|---------------------|
| Percy Jackson  | Desafio das Águas de Poseidon | ➕ Adição            |
| Anabeth Chase  | Desafio de Adivinhação        | 🎯 Adivinhar número |
| Nico di Angelo | Desafio do Submundo de Hades  | ✖️ Multiplicação    |
| Thalia         | Desafio dos Raios de Zeus     | ➖ Subtração         |

O jogo da Anabeth possui um sistema de **5 vidas**. O jogador recebe dicas indicando se o número secreto é maior ou menor que o número informado.

## 💻 Tecnologias

- Java
- IntelliJ IDEA

## 🎯 Objetivo

O principal objetivo deste projeto foi colocar em prática conceitos estudados em Java e **Programação Orientada a Objetos**, utilizando uma aplicação simples e interativa.

Este projeto faz parte da minha jornada de aprendizado em desenvolvimento de software.

## 🚀 Próximos passos

- [ ] Adicionar sistema de pontuação
- [ ] Criar novos personagens
- [ ] Adicionar novos minijogos
- [ ] Melhorar o tratamento de entradas inválidas
- [ ] Criar uma interface gráfica
- [ ] Adicionar níveis de dificuldade

---

💻 **Projeto desenvolvido para fins de estudo.**
