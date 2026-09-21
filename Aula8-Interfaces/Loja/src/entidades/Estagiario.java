package entidades;

public class Estagiario extends Funcionario {

    private String institucaoEnsino;

    public Estagiario(String nome, double salario, String institucaoEnsino) {
        super(nome,salario);
        this.institucaoEnsino = institucaoEnsino;
    }

    public String getInstitucaoEnsino() {
        return institucaoEnsino;
    }

    public void setInstitucaoEnsino(String institucaoEnsino) {
        this.institucaoEnsino = institucaoEnsino;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nInstitução de Ensino: " + institucaoEnsino;
    }
}
