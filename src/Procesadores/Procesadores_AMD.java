package Procesadores;

public class Procesadores_AMD extends Procesadores_Escritorio {

    Boolean sensor_temperatura;

    public Procesadores_AMD() {
    }

    public Procesadores_AMD(int nucleos, String nombre, Double velocidad, Double consumo, String socket, Boolean sensor_temperatura) {
        super(nucleos, nombre, velocidad, consumo, socket);
        this.sensor_temperatura = sensor_temperatura;
    }

    public Boolean getSensor_temperatura() {
        return sensor_temperatura;
    }

    public void setSensor_temperatura(Boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }

    //Metodo personalizado

    public void imprimir_datos_AMD(){
        System.out.println(this.sensor_temperatura);
    }

}
