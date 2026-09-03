public class Aluno {

    String nome;
    int primeiraNota;
    int segundaNota;

    public Aluno(String nome, int primeiraNota, int segundaNota) {

        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public String getNome() {
        return nome;
    }

    public int getPrimeiraNota() {
        return primeiraNota;
    }

    public int getSegundaNota() {
        return segundaNota;
    }
}
