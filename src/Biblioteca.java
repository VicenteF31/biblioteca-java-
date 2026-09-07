public class Biblioteca {

    private Livro[] livros;
    private Utilizador[] utilizadores;
    private Emprestimo[] emprestimos;

    private int totalLivros;
    private int totalUtilizadores;
    private int totalEmprestimos;

    public Biblioteca() {

        livros = new Livro[100];
        utilizadores = new Utilizador[100];
        emprestimos = new Emprestimo[500];

        totalLivros = 0;
        totalUtilizadores = 0;
        totalEmprestimos = 0;
    }

    // ==========================================
    // LIVROS
    // ==========================================

    public void adicionarLivro(Livro livro) {

        if (livro.getId() <= 0) {
            System.out.println("Erro: o ID do livro deve ser maior que zero.");
            return;
        }

        if (procurarLivro(livro.getId()) != null) {
            System.out.println("Erro: já existe um livro com o ID "
                    + livro.getId() + ".");
            return;
        }

        if (livro.getQuantidadeDisponivel() <= 0) {
            System.out.println("Erro: a quantidade deve ser maior que zero.");
            return;
        }

        if (totalLivros >= livros.length) {
            System.out.println("Não há espaço para mais livros.");
            return;
        }

        livros[totalLivros] = livro;
        totalLivros++;

        System.out.println("Livro registado com sucesso!");
    }

    public Livro procurarLivro(int id) {

        for (int i = 0; i < totalLivros; i++) {

            if (livros[i].getId() == id) {
                return livros[i];
            }
        }

        return null;
    }

    public void listarLivros() {

        if (totalLivros == 0) {
            System.out.println("\nNão existem livros registados.");
            return;
        }

        System.out.println("\n========== CATÁLOGO ==========");

        for (int i = 0; i < totalLivros; i++) {
            livros[i].mostrarDados();
        }
    }

    public void pesquisarPorTitulo(String titulo) {

        boolean encontrado = false;

        System.out.println("\n========== PESQUISA POR TÍTULO ==========");

        for (int i = 0; i < totalLivros; i++) {

            if (livros[i].getTitulo()
                    .toLowerCase()
                    .contains(titulo.toLowerCase())) {

                livros[i].mostrarDados();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum livro encontrado.");
        }
    }

    public void pesquisarPorAutor(String autor) {

        boolean encontrado = false;

        System.out.println("\n========== PESQUISA POR AUTOR ==========");

        for (int i = 0; i < totalLivros; i++) {

            if (livros[i].getAutor()
                    .toLowerCase()
                    .contains(autor.toLowerCase())) {

                livros[i].mostrarDados();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum livro encontrado.");
        }
    }

    // ==========================================
    // UTILIZADORES
    // ==========================================

    public void adicionarUtilizador(Utilizador utilizador) {

        if (utilizador.getId() <= 0) {
            System.out.println(
                    "Erro: o ID do utilizador deve ser maior que zero.");
            return;
        }

        if (procurarUtilizador(utilizador.getId()) != null) {

            System.out.println(
                    "Erro: já existe um utilizador com o ID "
                    + utilizador.getId() + ".");

            return;
        }

        if (totalUtilizadores >= utilizadores.length) {
            System.out.println("Não há espaço para mais utilizadores.");
            return;
        }

        utilizadores[totalUtilizadores] = utilizador;
        totalUtilizadores++;

        System.out.println("Utilizador registado com sucesso!");
    }

    public Utilizador procurarUtilizador(int id) {

        for (int i = 0; i < totalUtilizadores; i++) {

            if (utilizadores[i].getId() == id) {
                return utilizadores[i];
            }
        }

        return null;
    }

    public void listarUtilizadores() {

        if (totalUtilizadores == 0) {

            System.out.println(
                    "\nNão existem utilizadores registados.");

            return;
        }

        System.out.println("\n========== UTILIZADORES ==========");

        for (int i = 0; i < totalUtilizadores; i++) {
            utilizadores[i].mostrarDados();
        }
    }

    // ==========================================
    // EMPRÉSTIMOS
    // ==========================================

    public void emprestarLivro(int idLivro, int idUtilizador) {

        Livro livro = procurarLivro(idLivro);
        Utilizador utilizador = procurarUtilizador(idUtilizador);

        if (livro == null) {
            System.out.println("Erro: livro não encontrado.");
            return;
        }

        if (utilizador == null) {
            System.out.println("Erro: utilizador não encontrado.");
            return;
        }

        if (livro.getQuantidadeDisponivel() <= 0) {

            System.out.println(
                    "Erro: não existem exemplares disponíveis.");

            return;
        }

        if (totalEmprestimos >= emprestimos.length) {

            System.out.println(
                    "Erro: limite de empréstimos atingido.");

            return;
        }

        livro.emprestar();

        Emprestimo novoEmprestimo =
                new Emprestimo(idLivro, idUtilizador);

        emprestimos[totalEmprestimos] = novoEmprestimo;
        totalEmprestimos++;

        System.out.println(
                "Empréstimo realizado com sucesso!");
    }

    public void devolverLivro(int idLivro, int idUtilizador) {

        Livro livro = procurarLivro(idLivro);

        if (livro == null) {

            System.out.println(
                    "Erro: livro não encontrado.");

            return;
        }

        for (int i = 0; i < totalEmprestimos; i++) {

            if (emprestimos[i].getIdLivro() == idLivro
                    && emprestimos[i].getIdUtilizador() == idUtilizador
                    && !emprestimos[i].isDevolvido()) {

                emprestimos[i].devolver();
                livro.devolver();

                System.out.println(
                        "Livro devolvido com sucesso!");

                return;
            }
        }

        System.out.println(
                "Erro: não existe um empréstimo ativo para este livro e utilizador.");
    }

    // ==========================================
    // HISTÓRICO
    // ==========================================

    public void mostrarHistorico() {

        if (totalEmprestimos == 0) {

            System.out.println(
                    "\nNão existem empréstimos registados.");

            return;
        }

        System.out.println(
                "\n========== HISTÓRICO DE EMPRÉSTIMOS ==========");

        for (int i = 0; i < totalEmprestimos; i++) {

            Emprestimo emprestimo = emprestimos[i];

            Livro livro =
                    procurarLivro(emprestimo.getIdLivro());

            Utilizador utilizador =
                    procurarUtilizador(emprestimo.getIdUtilizador());

            System.out.println("\nEmpréstimo #" + (i + 1));

            System.out.println(
                    "Livro: " + livro.getTitulo());

            System.out.println(
                    "Utilizador: " + utilizador.getNome());

            if (emprestimo.isDevolvido()) {

                System.out.println("Estado: Devolvido");

            } else {

                System.out.println("Estado: Emprestado");
            }

            System.out.println("-----------------------------------");
        }
    }

    // ==========================================
    // ESTATÍSTICAS
    // ==========================================

    public void mostrarEstatisticas() {

        System.out.println("\n========== ESTATÍSTICAS ==========");

        System.out.println(
                "Total de livros: " + totalLivros);

        System.out.println(
                "Total de utilizadores: " + totalUtilizadores);

        System.out.println(
                "Total de empréstimos: " + totalEmprestimos);

        if (totalLivros == 0) {

            System.out.println(
                    "Não existem livros registados.");

            return;
        }

        Livro maisEmprestado = livros[0];

        for (int i = 1; i < totalLivros; i++) {

            if (livros[i].getTotalEmprestimos()
                    > maisEmprestado.getTotalEmprestimos()) {

                maisEmprestado = livros[i];
            }
        }

        System.out.println("\nLivro mais emprestado:");

        System.out.println(
                "Título: " + maisEmprestado.getTitulo());

        System.out.println(
                "Autor: " + maisEmprestado.getAutor());

        System.out.println(
                "Total de empréstimos: "
                + maisEmprestado.getTotalEmprestimos());

        System.out.println("==================================");
    }
}