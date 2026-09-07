public class Emprestimo {

    private int idLivro;
    private int idUtilizador;
    private boolean devolvido;

    public Emprestimo(int idLivro, int idUtilizador) {

        this.idLivro = idLivro;
        this.idUtilizador = idUtilizador;
        this.devolvido = false;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public int getIdUtilizador() {
        return idUtilizador;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void devolver() {
        devolvido = true;
    }
}