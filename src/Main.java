import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int opcao;

        do {

            mostrarMenu();

            opcao = lerInteiro(scanner, "Escolha uma opção: ");

            switch (opcao) {

                case 1:
                    registarLivro(scanner, biblioteca);
                    break;

                case 2:
                    biblioteca.listarLivros();
                    break;

                case 3:
                    pesquisarLivro(scanner, biblioteca);
                    break;

                case 4:
                    registarUtilizador(scanner, biblioteca);
                    break;

                case 5:
                    biblioteca.listarUtilizadores();
                    break;

                case 6:
                    efetuarEmprestimo(scanner, biblioteca);
                    break;

                case 7:
                    efetuarDevolucao(scanner, biblioteca);
                    break;

                case 8:
                    biblioteca.mostrarHistorico();
                    break;

                case 9:
                    biblioteca.mostrarEstatisticas();
                    break;

                case 0:
                    System.out.println(
                            "\nSistema encerrado. Até breve!");
                    break;

                default:
                    System.out.println(
                            "\nOpção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // ==========================================
    // MENU
    // ==========================================

    public static void mostrarMenu() {

        System.out.println();
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║        SISTEMA DE BIBLIOTECA          ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║ 1. Registar Livro                     ║");
        System.out.println("║ 2. Consultar Catálogo                 ║");
        System.out.println("║ 3. Pesquisar Livro                    ║");
        System.out.println("║ 4. Registar Utilizador                ║");
        System.out.println("║ 5. Listar Utilizadores                ║");
        System.out.println("║ 6. Efetuar Empréstimo                 ║");
        System.out.println("║ 7. Efetuar Devolução                  ║");
        System.out.println("║ 8. Histórico de Empréstimos           ║");
        System.out.println("║ 9. Estatísticas                       ║");
        System.out.println("║ 0. Sair                               ║");
        System.out.println("╚════════════════════════════════════════╝");
    }

    // ==========================================
    // REGISTAR LIVRO
    // ==========================================

    public static void registarLivro(
            Scanner scanner,
            Biblioteca biblioteca) {

        System.out.println(
                "\n========== REGISTAR LIVRO ==========");

        int id = lerInteiro(
                scanner,
                "ID do livro: ");

        String titulo = lerTexto(
                scanner,
                "Título: ");

        String autor = lerTexto(
                scanner,
                "Autor: ");

       int ano;

           while (true) {

            ano = lerInteiro(
            scanner,
            "Ano de publicação: ");

           if (ano > 0 && ano <= 2026) {
            break;
             }

             System.out.println(
            "Ano inválido. Digite um ano entre 1 e 2026.");
             }

        int quantidade = lerInteiro(
                scanner,
                "Quantidade disponível: ");

        Livro livro = new Livro(
                id,
                titulo,
                autor,
                ano,
                quantidade
        );

        biblioteca.adicionarLivro(livro);
    }

    // ==========================================
    // PESQUISAR LIVRO
    // ==========================================

    public static void pesquisarLivro(
            Scanner scanner,
            Biblioteca biblioteca) {

        System.out.println(
                "\n========== PESQUISAR LIVRO ==========");

        System.out.println("1. Pesquisar por título");
        System.out.println("2. Pesquisar por autor");

        int opcao = lerInteiro(
                scanner,
                "Escolha uma opção: ");

        if (opcao == 1) {

            String titulo = lerTexto(
                    scanner,
                    "Digite o título: ");

            biblioteca.pesquisarPorTitulo(titulo);

        } else if (opcao == 2) {

            String autor = lerTexto(
                    scanner,
                    "Digite o autor: ");

            biblioteca.pesquisarPorAutor(autor);

        } else {

            System.out.println("Opção inválida.");
        }
    }

    // ==========================================
    // REGISTAR UTILIZADOR
    // ==========================================

    public static void registarUtilizador(
            Scanner scanner,
            Biblioteca biblioteca) {

        System.out.println(
                "\n========== REGISTAR UTILIZADOR ==========");

        int id = lerInteiro(
                scanner,
                "ID do utilizador: ");

        String nome = lerTexto(
                scanner,
                "Nome do utilizador: ");

        Utilizador utilizador =
                new Utilizador(id, nome);

        biblioteca.adicionarUtilizador(utilizador);
    }

    // ==========================================
    // EMPRÉSTIMO
    // ==========================================

    public static void efetuarEmprestimo(
            Scanner scanner,
            Biblioteca biblioteca) {

        System.out.println(
                "\n========== EFETUAR EMPRÉSTIMO ==========");

        int idLivro = lerInteiro(
                scanner,
                "ID do livro: ");

        int idUtilizador = lerInteiro(
                scanner,
                "ID do utilizador: ");

        biblioteca.emprestarLivro(
                idLivro,
                idUtilizador
        );
    }

    // ==========================================
    // DEVOLUÇÃO
    // ==========================================

    public static void efetuarDevolucao(
            Scanner scanner,
            Biblioteca biblioteca) {

        System.out.println(
                "\n========== EFETUAR DEVOLUÇÃO ==========");

        int idLivro = lerInteiro(
                scanner,
                "ID do livro: ");

        int idUtilizador = lerInteiro(
                scanner,
                "ID do utilizador: ");

        biblioteca.devolverLivro(
                idLivro,
                idUtilizador
        );
    }

    // ==========================================
    // LER NÚMERO COM SEGURANÇA
    // ==========================================

    public static int lerInteiro(
            Scanner scanner,
            String mensagem) {

        while (true) {

            System.out.print(mensagem);

            String entrada = scanner.nextLine();

            try {

                return Integer.parseInt(entrada);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Entrada inválida. Digite um número.");
            }
        }
    }

    // ==========================================
    // LER TEXTO COM SEGURANÇA
    // ==========================================

    public static String lerTexto(
            Scanner scanner,
            String mensagem) {

        while (true) {

            System.out.print(mensagem);

            String texto = scanner.nextLine().trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            System.out.println(
                    "Este campo não pode ficar vazio.");
        }
    }
}