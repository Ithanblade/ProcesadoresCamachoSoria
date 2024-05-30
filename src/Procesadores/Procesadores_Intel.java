package Procesadores;

public class Procesadores_Intel extends Procesadores_Escritorio
{
    // Definir atributos
    boolean tarjeta_video;

    // Definir constructor vacío
    public Procesadores_Intel() {}

    // Definir super cpnstructor lleno
    public Procesadores_Intel(int nucleos, String nombre, Double velocidad, Double consumo, String socket, boolean tarjeta_video)
    {
        super(nucleos, nombre, velocidad, consumo, socket);
        this.tarjeta_video = tarjeta_video;
    }

    // Definir getters y setters
    public boolean isTarjeta_video() {return tarjeta_video;}

    public void setTarjeta_video(boolean tarjeta_video) {this.tarjeta_video = tarjeta_video;}

    //Definir métodos personalizados
    public void mostrar_datos_intel()
    {
        System.out.println(this.tarjeta_video);
    }
}
