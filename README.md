# Sistema de Gestão de Biblioteca

## 1. Descrição do Projeto

O Sistema de Gestão de Biblioteca é uma aplicação desenvolvida em linguagem Java para auxiliar no gerenciamento de livros, utilizadores e empréstimos de uma biblioteca municipal.

O sistema funciona através de uma interface de consola e utiliza estruturas de dados em memória, nomeadamente arrays, para armazenar e manipular as informações durante a execução do programa.

A aplicação permite registar livros, consultar o catálogo, pesquisar livros, registar utilizadores, realizar empréstimos e devoluções, consultar o histórico de empréstimos e visualizar estatísticas do sistema.

---

## 2. Objetivo

### Objetivo Geral

Desenvolver um sistema informático simples, baseado em consola, capaz de automatizar o gerenciamento do inventário de livros e das operações de empréstimo e devolução de uma biblioteca.

### Objetivos Específicos

* Registar livros com identificador, título, autor, ano de publicação e quantidade disponível;
* Consultar o catálogo de livros;
* Pesquisar livros por título ou autor;
* Registar utilizadores da biblioteca;
* Realizar empréstimos de livros;
* Registar a devolução de livros;
* Manter o histórico dos empréstimos realizados;
* Apresentar estatísticas sobre os empréstimos;
* Controlar a disponibilidade dos exemplares;
* Validar os dados introduzidos pelo utilizador.

---

## 3. Funcionalidades

O sistema disponibiliza as seguintes funcionalidades:

1. **Registar Livro**

   * Inserção do ID do livro;
   * Título;
   * Autor;
   * Ano de publicação;
   * Quantidade disponível;
   * Validação de IDs duplicados.

2. **Consultar Catálogo**

   * Apresentação dos livros registados;
   * Visualização da quantidade disponível;
   * Visualização do total de empréstimos de cada livro.

3. **Pesquisar Livro**

   * Pesquisa por título;
   * Pesquisa por autor.

4. **Registar Utilizador**

   * Registo do ID;
   * Registo do nome;
   * Validação de IDs duplicados.

5. **Listar Utilizadores**

   * Apresentação dos utilizadores registados.

6. **Efetuar Empréstimo**

   * Verificação da existência do livro;
   * Verificação da existência do utilizador;
   * Verificação da disponibilidade do livro;
   * Atualização da quantidade disponível;
   * Registo do empréstimo.

7. **Efetuar Devolução**

   * Localização do empréstimo;
   * Atualização do estado do empréstimo;
   * Reposição da quantidade disponível.

8. **Histórico de Empréstimos**

   * Consulta dos empréstimos realizados;
   * Identificação do livro;
   * Identificação do utilizador;
   * Estado do empréstimo.

9. **Estatísticas**

   * Número total de livros;
   * Número total de utilizadores;
   * Número total de empréstimos;
   * Livro mais emprestado.

---

## 4. Tecnologias Utilizadas

* **Java**
* **JDK 21**
* **Visual Studio Code**
* **Git**
* **GitHub**

O sistema não utiliza uma base de dados externa. As informações são armazenadas temporariamente em memória utilizando arrays, conforme solicitado no enunciado do trabalho.

---

## 5. Estrutura do Projeto

```text
BIBLIOTECA JAVA/
│
├── src/
│   ├── Main.java
│   ├── Livro.java
│   ├── Utilizador.java
│   ├── Emprestimo.java
│   └── Biblioteca.java
│
└── README.md
```

### Descrição das Classes

**Main.java**

É a classe principal do sistema. Contém o método `main()` e apresenta o menu interativo através do qual o utilizador pode executar as diferentes funcionalidades.

**Livro.java**

Representa um livro da biblioteca. Armazena informações como ID, título, autor, ano de publicação, quantidade disponível e número total de empréstimos.

**Utilizador.java**

Representa um utilizador registado na biblioteca, armazenando o seu identificador e nome.

**Emprestimo.java**

Representa uma operação de empréstimo, relacionando um livro a um utilizador e mantendo o estado da operação, ou seja, se o livro já foi devolvido ou continua emprestado.

**Biblioteca.java**

É responsável pela gestão principal dos dados da biblioteca, incluindo livros, utilizadores e empréstimos.

---

## 6. Requisitos

Para executar o projeto é necessário ter instalado:

* Java Development Kit (JDK) 21 ou superior;
* Visual Studio Code ou outro editor/IDE compatível com Java;
* Git, caso pretenda clonar ou enviar o projeto para um repositório GitHub.

---

## 7. Como Executar o Projeto

### 1. Clonar o repositório

Depois de o projeto estar disponível no GitHub, execute:

```bash
git clone URL_DO_REPOSITORIO
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

## 8. Execução no Visual Studio Code

Também é possível executar o projeto diretamente através do Visual Studio Code.

Abra a pasta do projeto no VS Code e, dentro da pasta `src`, abra o ficheiro `Main.java`.

Depois, utilize a opção **Run Java** disponibilizada pela extensão de Java do Visual Studio Code.

---

## 9. Exemplo de Utilização

Ao iniciar o programa, será apresentado um menu semelhante a:

```text
╔════════════════════════════════════════╗
║        SISTEMA DE BIBLIOTECA          ║
╠════════════════════════════════════════╣
║ 1. Registar Livro                     ║
║ 2. Consultar Catálogo                 ║
║ 3. Pesquisar Livro                    ║
║ 4. Registar Utilizador                ║
║ 5. Listar Utilizadores                ║
║ 6. Efetuar Empréstimo                 ║
║ 7. Efetuar Devolução                  ║
║ 8. Histórico de Empréstimos           ║
║ 9. Estatísticas                       ║
║ 0. Sair                               ║
╚════════════════════════════════════════╝
```

O utilizador pode selecionar uma opção e seguir as instruções apresentadas no terminal.

---

## 10. Validações Implementadas

O sistema possui mecanismos de validação para melhorar a fiabilidade das operações, incluindo:

* Impedimento de IDs de livros duplicados;
* Impedimento de IDs de utilizadores duplicados;
* Verificação de IDs maiores que zero;
* Verificação de quantidade de livros maior que zero;
* Validação do ano de publicação;
* Impedimento de campos de texto vazios;
* Verificação da existência do livro antes de realizar operações;
* Verificação da existência do utilizador;
* Verificação da disponibilidade de exemplares;
* Verificação de empréstimos ativos antes de realizar uma devolução;
* Tratamento de entradas numéricas inválidas.

---

## 11. Armazenamento dos Dados

Os dados do sistema são armazenados temporariamente em memória através de arrays.

São utilizados arrays para armazenar:

* Livros;
* Utilizadores;
* Empréstimos.

Como não existe uma base de dados externa, os dados são perdidos quando o programa é encerrado. Esta abordagem foi adotada porque o enunciado solicita uma base de dados simulada em memória.

---

## 12. Estado do Projeto

O sistema encontra-se funcional e implementa as principais operações solicitadas no enunciado:

* [x] Registo de livros
* [x] Consulta do catálogo
* [x] Pesquisa por título
* [x] Pesquisa por autor
* [x] Registo de utilizadores
* [x] Empréstimo de livros
* [x] Devolução de livros
* [x] Histórico de empréstimos
* [x] Estatísticas
* [x] Validação de dados

---

## 13. Autor

** Ivanio Abubacar **

Projeto académico desenvolvido para a Cadeira de  Introdução a Algoritmos e Programação 

---

## 14. Repositório

O código-fonte completo do projeto está disponível publicamente no GitHub:

**Link:** [https://github.com/EdilsonLibombo/biblioteca-java.git]
