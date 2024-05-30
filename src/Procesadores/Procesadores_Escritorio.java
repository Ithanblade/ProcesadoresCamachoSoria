package Procesadores;

public class Procesadores_Escritorio extends Procesadores
{
    // Definir atributos
    String socket;

    // Definir constructor vacío
    public Procesadores_Escritorio() {}

    // Definir super constructor
    public Procesadores_Escritorio(int nucleos, String nombre, Double velocidad, Double consumo, String socket)
    {
        super(nucleos, nombre, velocidad, consumo);
        this.socket = socket;
    }

    //Definir getters y setters
    public String getSocket() {return socket;}

    public void setSocket(String socket) {this.socket = socket;}

    //Definir métodos personalizados
    public void imprimir_datos_escritorio()
    {
        System.out.println(this.socket);
    }
}
