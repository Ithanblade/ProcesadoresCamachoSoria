import Procesadores.Procesadores;
import Procesadores.Procesadores_Moviles;
import Procesadores.Procesadores_Intel;
import Procesadores.Procesadores_AMD;
public class Main {
    public static void main(String[] args) {

    //Interante1

        Procesadores_Moviles proc1 = new Procesadores_Moviles();

        Procesadores_Moviles proc2 = new Procesadores_Moviles(8,"Snapdragon 8 Gen 2",3.2,3.0,true);

    //Integrante2

        Procesadores_Intel proc3 = new Procesadores_Intel();

        Procesadores_Intel proc4 = new Procesadores_Intel(24,"Intel® Core™ i9 14900K", 6.0, 125.0, "LGA", true);

    //Instancias Intel Integrante 1

        Procesadores_Intel proc5 = new Procesadores_Intel(8,"Intel® Core™ i5-1135G7",4.20,28.0,"BGA",true);
        Procesadores_Intel proc6 = new Procesadores_Intel(12,"Intel® Core™ i7-1255U",4.70,328.0,"BGA",false);

        // Procesadores AMD

        Procesadores_AMD proc7 = new Procesadores_AMD(12, "AMD Ryzen™ 9 5900X", 3.7, 105.0, "AM4",true);
        Procesadores_AMD proc8 = new Procesadores_AMD(8, "AMD Ryzen™ 7 PRO 8700GE", 3.6, 35.0 ,"AM5", true);

        // No ip domain lockup

        Procesadores proc9 = new Procesadores();
        proc9.imprimir_datos();

        Procesadores_Moviles proc10 = new Procesadores_Moviles();
        proc10.imprimir_datos();

        Procesadores_AMD proc11 = new Procesadores_AMD();
        proc11.imprimir_datos();
    }
}