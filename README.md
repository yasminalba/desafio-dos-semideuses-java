# 🏛️ Desafio dos Semideuses

Projeto desenvolvido em **Java**, com tema inspirado no universo de Percy Jackson.
O programa permite que o usuário escolha um semideus, visualize sua ficha técnica e participe de um minijogo relacionado ao personagem escolhido.

---

## 🎮 Como funciona

Ao iniciar o programa, o usuário pode escolher entre quatro semideuses:

- ⚡ **Percy Jackson** — Jogo de adição
- 🦉 **Annabeth Chase** — Jogo de adivinhação
- 💀 **Nico di Angelo** — Jogo de multiplicação
- 🌩️ **Thalia** — Jogo de subtração

Após escolher um personagem, o programa apresenta algumas informações sobre ele:

- Poder
- Pai ou mãe divino(a)
- Inimigo
- Objeto de poder
- Efeito colateral

Depois da ficha técnica, o usuário participa do minijogo correspondente ao semideus escolhido.
Ao final, é possível escolher se deseja **jogar novamente**.

---

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
- Estrutura `do/while`
- Entrada de dados com `Scanner`
- Geração de números aleatórios com `Random`
- Métodos estáticos
- Organização do código em diferentes classes

---

## 🏗️ Estrutura do projeto

```text
desafio-dos-semideuses-java/
│
├── main.java
├── deuses.java
├── joguinho.java
├── minijogos.java
├── Personagem.java
├── semideuses.java
└── README.md
```

---

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

---

## 🎲 Minijogos

Cada personagem possui um desafio diferente:

| Semideus | Desafio | Operação |
|---|---|---|
| ⚡ Percy Jackson | Desafio das Águas de Poseidon | ➕ Adição |
| 🦉 Annabeth Chase | Desafio de Adivinhação | 🎯 Número de adivinhar |
| 💀 Nico di Angelo | Desafio do Submundo de Hades | ✖️ Multiplicação |
| 🌩️ Thalia | Desafio dos Raios de Zeus | ➖ Subtração |

O jogo da Annabeth possui um sistema de **5 vidas**.
Durante o desafio, o jogador recebe dicas sobre se o número secreto é **maior ou menor** que o número informado.

---

## 💻 Tecnologias

- ☕ Java
- 💻 IntelliJ IDEA

---

## ▶️ Como executar

### Pré-requisitos
- JDK instalado (Java 8 ou superior)
- IntelliJ IDEA (ou outra IDE de sua preferência) — opcional se for rodar via terminal

### Baixando o projeto

**Opção 1 — Clonar com Git**
```bash
git clone https://github.com/yasminalba/desafio-dos-semideuses-java.git
cd desafio-dos-semideuses-java
```

**Opção 2 — Baixar o ZIP**
1. No repositório do GitHub, clique em **Code → Download ZIP**
2. Extraia o arquivo `.zip` em uma pasta de sua preferência

### Via IntelliJ IDEA

1. Abra o IntelliJ IDEA
2. Selecione **Open** (ou **File → Open**)
3. Escolha a pasta onde os arquivos `.java` foram salvos/extraídos (a pasta com `main.java`, `Personagem.java`, etc.)
4. Se o IntelliJ pedir para criar um projeto a partir dos arquivos, confirme (ele detecta os `.java` automaticamente)
5. Localize o arquivo `main.java` no painel de projetos
6. Clique com o botão direito sobre ele e selecione **Run 'main.main()'**, ou abra o arquivo e pressione `Shift + F10`

> 💡 Não é necessário criar pastas ou mover arquivos manualmente — basta apontar o IntelliJ para a pasta onde os `.java` estão, e ele organiza o projeto sozinho.

### Via terminal

```bash
# Dentro da pasta onde estão os arquivos .java
javac *.java

# Execute o programa
java main
```

---

## 🎯 Objetivo

O objetivo principal deste projeto foi colocar em prática conceitos estudados em **Java** e **Programação Orientada a Objetos**, utilizando uma aplicação simples e interativa.
O projeto também foi desenvolvido para praticar a organização de diferentes classes, herança, interfaces, métodos e estruturas de controle.

Este projeto faz parte da minha jornada de aprendizagem em **desenvolvimento de software**.

---

## 🚀 Próximos passos

- [ ] Adicionar sistema de pontuação
- [ ] Criar novos personagens
- [ ] Adicionar novos minijogos
- [ ] Melhorar o tratamento de entradas inválidas
- [ ] Criar uma interface gráfica
- [ ] Adicionar níveis de dificuldade

---

## 📚 Aprendizados

Durante o desenvolvimento deste projeto, pude praticar conceitos importantes de Java e entender melhor como diferentes classes podem trabalhar juntas dentro de uma aplicação.
Também foi uma oportunidade para transformar conceitos teóricos de **Programação Orientada a Objetos** em uma aplicação interativa.

---

<div align="center">

### ⚡ Desenvolvido durante minha jornada de aprendizado em Java ⚡

💻 **Projeto desenvolvido para fins de estudo.**

</div>
