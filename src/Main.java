import Procesadores.Procesadores;
import Procesadores.Procesadores_Moviles;
import Procesadores.Procesadores_Intel;
public class Main {
    public static void main(String[] args) {

    //Interante1

        Procesadores_Moviles proc1 = new Procesadores_Moviles();

        Procesadores_Moviles proc2 = new Procesadores_Moviles(8,"Snapdragon 8 Gen 2",3.2,3.0,true);

    //Integrante2

        Procesadores_Intel proc3 = new Procesadores_Intel();
        Procesadores_Intel proc4 = new Procesadores_Intel(24,"Intel® Core™ i9 14900K", 6.0, 125.0, "LGA", true);


    }
}