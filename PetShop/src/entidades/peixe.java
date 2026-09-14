package entidades;

public class peixe extends animal{
    private String especie;

    public peixe(String nome, int idade, double peso, String especie) {
       super(nome, peso, idade);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nespecie: " + especie;
    }
}
