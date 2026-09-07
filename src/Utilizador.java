public class Utilizador {

    private int id;
    private String nome;

    public Utilizador(int id, String nome) {

        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void mostrarDados() {

        System.out.println("-----------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("-----------------------------------");
    }
}