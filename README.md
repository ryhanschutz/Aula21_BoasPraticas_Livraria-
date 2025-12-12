<div align="center">

  <img src="https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExczR4ODI0bDZ4ajJudW5wMTNwaHI0Y2R6eDZmZ3FpYjBmMjIybHhtNyZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/aK2sYhvQdvFYY/giphy.gif" width="200px" alt="Java Animation">

  # ☕ Dominando a Orientação a Objetos com Java
  
  ### 🚀 Minha Evolução no SENAI
  <p>
    <img src="https://img.shields.io/badge/Professor-Lucas-blue?style=for-the-badge&logo=teacher" alt="Professor Lucas">
    <img src="https://img.shields.io/badge/Curso-SENAI-red?style=for-the-badge&logo=senai" alt="SENAI">
    <img src="https://img.shields.io/badge/Foco-Boas_Práticas-green?style=for-the-badge&logo=clean-code" alt="Boas Práticas">
    <img src="https://img.shields.io/badge/Status-Pronto_para_Cybersistemas-orange?style=for-the-badge&logo=robot" alt="Cybersistemas">
  </p>

</div>

---

## 💡 Sobre o Projeto
Este repositório documenta conceitos fundamentais de **POO (Programação Orientada a Objetos)** que absorvi durante as aulas práticas de Desenvolvimento de Sistemas. O código simula um sistema de livraria digital, focando na interação entre leitores e livros.

---

## 🧠 Conceitos Aprendidos
Analisando os códigos `Pessoa.java`, `Livro.java`, `Publicacao.java` e `Main.java`, consolidei os seguintes conhecimentos:

### 1. 🏗️ Pilares da POO
* **Abstração & Classes:** Aprendi a modelar entidades do mundo real (como uma `Pessoa` ou um `Livro`) transformando-as em classes de código.
* **Encapsulamento:** O uso estrito de modificadores de acesso (`private`) nos atributos e a criação de métodos `getters` e `setters` para proteger os dados.
* **Herança & Implementação:** Uso da palavra-chave `implements` para conectar a classe `Livro` à interface `Publicacao`.
* **Polimorfismo:** Sobrescrita de métodos (`@Override`) para dar comportamentos específicos aos métodos `abrir`, `fechar` e `folhear`.

### 2. 🔌 Interfaces e Contratos
O arquivo `Publicacao.java` me ensinou a criar **Interfaces**. Aprendi que uma interface define um "contrato" de métodos (como `abrir()` ou `folhear()`) que a classe implementadora é *obrigada* a desenvolver.

### 3. 🤝 Relacionamento entre Objetos (Agregação)
Um dos pontos altos foi entender como objetos conversam entre si.
> *Exemplo:* A classe `Livro` possui um atributo do tipo `Pessoa` (`private Pessoa leitor;`). Isso cria uma conexão onde o objeto Livro "conhece" quem o está lendo.

### 4. 🧩 Estrutura de Dados Básica
No `Main.java`, aprendi a manipular **Arrays de Objetos**, instanciando múltiplos livros e pessoas de forma organizada:
```java
Pessoa[] p = new Pessoa[2];
Livro[] l = new Livro[4];
