public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int quantidadeDisponivel;
    private int totalEmprestimos;

    public Livro(int id, String titulo, String autor, int anoPublicacao, int quantidadeDisponivel) {

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.totalEmprestimos = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public int getTotalEmprestimos() {
        return totalEmprestimos;
    }

    public void emprestar() {

        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
            totalEmprestimos++;
        }
    }

    public void devolver() {
        quantidadeDisponivel++;
    }

    public void mostrarDados() {

        System.out.println("-----------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Quantidade disponível: " + quantidadeDisponivel);
        System.out.println("Total de empréstimos: " + totalEmprestimos);
        System.out.println("-----------------------------------");
    }
}