# Sistema de GestÃ£o de Biblioteca

## 1. DescriÃ§Ã£o do Projeto

O Sistema de GestÃ£o de Biblioteca Ã© uma aplicaÃ§Ã£o desenvolvida em linguagem Java para auxiliar no gerenciamento de livros, utilizadores e emprÃ©stimos de uma biblioteca municipal.

O sistema funciona atravÃ©s de uma interface de consola e utiliza estruturas de dados em memÃ³ria, nomeadamente arrays, para armazenar e manipular as informaÃ§Ãµes durante a execuÃ§Ã£o do programa.

A aplicaÃ§Ã£o permite registar livros, consultar o catÃ¡logo, pesquisar livros, registar utilizadores, realizar emprÃ©stimos e devoluÃ§Ãµes, consultar o histÃ³rico de emprÃ©stimos e visualizar estatÃ­sticas do sistema.

---

## 2. Objetivo

### Objetivo Geral

Desenvolver um sistema informÃ¡tico simples, baseado em consola, capaz de automatizar o gerenciamento do inventÃ¡rio de livros e das operaÃ§Ãµes de emprÃ©stimo e devoluÃ§Ã£o de uma biblioteca.

### Objetivos EspecÃ­ficos

* Registar livros com identificador, tÃ­tulo, autor, ano de publicaÃ§Ã£o e quantidade disponÃ­vel;
* Consultar o catÃ¡logo de livros;
* Pesquisar livros por tÃ­tulo ou autor;
* Registar utilizadores da biblioteca;
* Realizar emprÃ©stimos de livros;
* Registar a devoluÃ§Ã£o de livros;
* Manter o histÃ³rico dos emprÃ©stimos realizados;
* Apresentar estatÃ­sticas sobre os emprÃ©stimos;
* Controlar a disponibilidade dos exemplares;
* Validar os dados introduzidos pelo utilizador.

---

## 3. Funcionalidades

O sistema disponibiliza as seguintes funcionalidades:

1. **Registar Livro**

   * InserÃ§Ã£o do ID do livro;
   * TÃ­tulo;
   * Autor;
   * Ano de publicaÃ§Ã£o;
   * Quantidade disponÃ­vel;
   * ValidaÃ§Ã£o de IDs duplicados.

2. **Consultar CatÃ¡logo**

   * ApresentaÃ§Ã£o dos livros registados;
   * VisualizaÃ§Ã£o da quantidade disponÃ­vel;
   * VisualizaÃ§Ã£o do total de emprÃ©stimos de cada livro.

3. **Pesquisar Livro**

   * Pesquisa por tÃ­tulo;
   * Pesquisa por autor.

4. **Registar Utilizador**

   * Registo do ID;
   * Registo do nome;
   * ValidaÃ§Ã£o de IDs duplicados.

5. **Listar Utilizadores**

   * ApresentaÃ§Ã£o dos utilizadores registados.

6. **Efetuar EmprÃ©stimo**

   * VerificaÃ§Ã£o da existÃªncia do livro;
   * VerificaÃ§Ã£o da existÃªncia do utilizador;
   * VerificaÃ§Ã£o da disponibilidade do livro;
   * AtualizaÃ§Ã£o da quantidade disponÃ­vel;
   * Registo do emprÃ©stimo.

7. **Efetuar DevoluÃ§Ã£o**

   * LocalizaÃ§Ã£o do emprÃ©stimo;
   * AtualizaÃ§Ã£o do estado do emprÃ©stimo;
   * ReposiÃ§Ã£o da quantidade disponÃ­vel.

8. **HistÃ³rico de EmprÃ©stimos**

   * Consulta dos emprÃ©stimos realizados;
   * IdentificaÃ§Ã£o do livro;
   * IdentificaÃ§Ã£o do utilizador;
   * Estado do emprÃ©stimo.

9. **EstatÃ­sticas**

   * NÃºmero total de livros;
   * NÃºmero total de utilizadores;
   * NÃºmero total de emprÃ©stimos;
   * Livro mais emprestado.

---

## 4. Tecnologias Utilizadas

* **Java**
* **JDK 21**
* **Visual Studio Code**
* **Git**
* **GitHub**

O sistema nÃ£o utiliza uma base de dados externa. As informaÃ§Ãµes sÃ£o armazenadas temporariamente em memÃ³ria utilizando arrays, conforme solicitado no enunciado do trabalho.

---

## 5. Estrutura do Projeto

```text
BIBLIOTECA JAVA/
â”‚
â”œâ”€â”€ src/
â”‚   â”œâ”€â”€ Main.java
â”‚   â”œâ”€â”€ Livro.java
â”‚   â”œâ”€â”€ Utilizador.java
â”‚   â”œâ”€â”€ Emprestimo.java
â”‚   â””â”€â”€ Biblioteca.java
â”‚
â””â”€â”€ README.md
```

### DescriÃ§Ã£o das Classes

**Main.java**

Ã‰ a classe principal do sistema. ContÃ©m o mÃ©todo `main()` e apresenta o menu interativo atravÃ©s do qual o utilizador pode executar as diferentes funcionalidades.

**Livro.java**

Representa um livro da biblioteca. Armazena informaÃ§Ãµes como ID, tÃ­tulo, autor, ano de publicaÃ§Ã£o, quantidade disponÃ­vel e nÃºmero total de emprÃ©stimos.

**Utilizador.java**

Representa um utilizador registado na biblioteca, armazenando o seu identificador e nome.

**Emprestimo.java**

Representa uma operaÃ§Ã£o de emprÃ©stimo, relacionando um livro a um utilizador e mantendo o estado da operaÃ§Ã£o, ou seja, se o livro jÃ¡ foi devolvido ou continua emprestado.

**Biblioteca.java**

Ã‰ responsÃ¡vel pela gestÃ£o principal dos dados da biblioteca, incluindo livros, utilizadores e emprÃ©stimos.

---

## 6. Requisitos

Para executar o projeto Ã© necessÃ¡rio ter instalado:

* Java Development Kit (JDK) 21 ou superior;
* Visual Studio Code ou outro editor/IDE compatÃ­vel com Java;
* Git, caso pretenda clonar ou enviar o projeto para um repositÃ³rio GitHub.

---

## 7. Como Executar o Projeto

### 1. Clonar o repositÃ³rio

Depois de o projeto estar disponÃ­vel no GitHub, execute:

```bash
git clone https://github.com/VicenteF31/biblioteca-java-.git
```

### 2. Entrar na pasta do projeto

```bash
cd "BIBLIOTECA JAVA"
```

### 3. Compilar o projeto

No terminal, execute:

```bash
javac -d bin src/*.java
```

### 4. Executar o programa

```bash
java -cp bin Main
```

---

## 8. ExecuÃ§Ã£o no Visual Studio Code

TambÃ©m Ã© possÃ­vel executar o projeto diretamente atravÃ©s do Visual Studio Code.

Abra a pasta do projeto no VS Code e, dentro da pasta `src`, abra o ficheiro `Main.java`.

Depois, utilize a opÃ§Ã£o **Run Java** disponibilizada pela extensÃ£o de Java do Visual Studio Code.

---

## 9. Exemplo de UtilizaÃ§Ã£o

Ao iniciar o programa, serÃ¡ apresentado um menu semelhante a:

```text
â•”â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•—
â•‘        SISTEMA DE BIBLIOTECA          â•‘
â• â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•£
â•‘ 1. Registar Livro                     â•‘
â•‘ 2. Consultar CatÃ¡logo                 â•‘
â•‘ 3. Pesquisar Livro                    â•‘
â•‘ 4. Registar Utilizador                â•‘
â•‘ 5. Listar Utilizadores                â•‘
â•‘ 6. Efetuar EmprÃ©stimo                 â•‘
â•‘ 7. Efetuar DevoluÃ§Ã£o                  â•‘
â•‘ 8. HistÃ³rico de EmprÃ©stimos           â•‘
â•‘ 9. EstatÃ­sticas                       â•‘
â•‘ 0. Sair                               â•‘
â•šâ•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•â•
```

O utilizador pode selecionar uma opÃ§Ã£o e seguir as instruÃ§Ãµes apresentadas no terminal.

---

## 10. ValidaÃ§Ãµes Implementadas

O sistema possui mecanismos de validaÃ§Ã£o para melhorar a fiabilidade das operaÃ§Ãµes, incluindo:

* Impedimento de IDs de livros duplicados;
* Impedimento de IDs de utilizadores duplicados;
* VerificaÃ§Ã£o de IDs maiores que zero;
* VerificaÃ§Ã£o de quantidade de livros maior que zero;
* ValidaÃ§Ã£o do ano de publicaÃ§Ã£o;
* Impedimento de campos de texto vazios;
* VerificaÃ§Ã£o da existÃªncia do livro antes de realizar operaÃ§Ãµes;
* VerificaÃ§Ã£o da existÃªncia do utilizador;
* VerificaÃ§Ã£o da disponibilidade de exemplares;
* VerificaÃ§Ã£o de emprÃ©stimos ativos antes de realizar uma devoluÃ§Ã£o;
* Tratamento de entradas numÃ©ricas invÃ¡lidas.

---

## 11. Armazenamento dos Dados

Os dados do sistema sÃ£o armazenados temporariamente em memÃ³ria atravÃ©s de arrays.

SÃ£o utilizados arrays para armazenar:

* Livros;
* Utilizadores;
* EmprÃ©stimos.

Como nÃ£o existe uma base de dados externa, os dados sÃ£o perdidos quando o programa Ã© encerrado. Esta abordagem foi adotada porque o enunciado solicita uma base de dados simulada em memÃ³ria.

---

## 12. Estado do Projeto

O sistema encontra-se funcional e implementa as principais operaÃ§Ãµes solicitadas no enunciado:

* [x] Registo de livros
* [x] Consulta do catÃ¡logo
* [x] Pesquisa por tÃ­tulo
* [x] Pesquisa por autor
* [x] Registo de utilizadores
* [x] EmprÃ©stimo de livros
* [x] DevoluÃ§Ã£o de livros
* [x] HistÃ³rico de emprÃ©stimos
* [x] EstatÃ­sticas
* [x] ValidaÃ§Ã£o de dados

---

## 13. Autor

** Ivanio Abubacar **

Projeto acadÃ©mico desenvolvido para a Cadeira de  IntroduÃ§Ã£o a Algoritmos e ProgramaÃ§Ã£o 

---

## 14. RepositÃ³rio

O cÃ³digo-fonte completo do projeto estÃ¡ disponÃ­vel publicamente no GitHub:

**Link:** [https://github.com/VicenteF31/biblioteca-java-.git]

