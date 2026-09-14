import entidades.animal;
import entidades.cachorro;
import entidades.gato;
import entidades.peixe;

public class main {

    public static void main(String[] args) {

        //Cachorro
        cachorro marley = new cachorro("Marley", 5, 30, "Labrador");
        //Gato
        gato neko = new gato("Neko", "Laranja", 5, 15);
        //Peixe
        peixe dory =  new peixe("Dory", 5, 20, "Cirurgião-Patela");


        System.out.println("Cachorro" + marley);
        System.out.println("Gato" + neko);
        System.out.println("Peixe" + dory);


    }
}
