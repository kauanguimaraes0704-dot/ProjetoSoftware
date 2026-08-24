public class Filme {

    String titulo;
    String genero;
    String autor;
    int duracao;
    int qtdIngressos;
    double valor;

    public Filme(String titulo, String genero, String autor, int duracao, int qtdIngressos, double valor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.duracao = duracao;
        this.qtdIngressos = qtdIngressos;
        this.valor = valor;
    }

    public void decrementaIngresso(int ingressos) {
        if (ingressos > 0 && ingressos <= this.qtdIngressos) {
            this.qtdIngressos -= ingressos;
            System.out.println("Compra feita com Sucesso!");
        } else {
            System.out.println("Quantidade Inválida");
        }
    }

    ;

    public double compraIngresso(int ingressos) {
        if (ingressos > 0 && ingressos <= this.qtdIngressos) {
            return this.valor * ingressos;
            System.out.println("Compra feita com Sucesso!");
        } else {
            System.out.println("Quantidade Inválida");
        }
        @Override
        public String toString () {
            return "Título: " + titulo +,
                    "\nGênero: " + genero +,
                    "\nDuração: " + duracao +,
                    "\nAutor: " + autor +,
                    "\nQuantidade Disponível: " + qtdIngressos +,
                    "\nValor do Ingresso: " + valor;
        }
    }
}
