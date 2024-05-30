package Procesadores;
public class Procesadores {
    int nucleos;
    Double consumo;
    Double velocidad;
    String nombre;

    public Procesadores() {
    }

    public Procesadores(int nucleos, String nombre, Double velocidad, Double consumo) {
        this.nucleos = nucleos;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.consumo = consumo;
    }
//Setters y Getters

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

//Metodos Personalizados
    public void imprimir_datos() {
        System.out.println("Nucleos: " + nucleos);
        System.out.println("Consumo: " + consumo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Nombre: " + nombre);
    }



}
