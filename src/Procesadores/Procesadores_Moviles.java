package Procesadores;

public class Procesadores_Moviles extends Procesadores{

    Boolean optimizacion_energia;

    public Procesadores_Moviles() {
    }

    public Procesadores_Moviles(int nucleos, String nombre, Double velocidad, Double consumo, Boolean optimizacion_energia) {
        super(nucleos, nombre, velocidad, consumo);
        this.optimizacion_energia = optimizacion_energia;
    }

    public Boolean getOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void setOptimizacion_energia(Boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

     public void imprimir_datos_movil(){
        System.out.println(this.optimizacion_energia);
    }

    @Override
    public void imprimir_datos(){
        System.out.println("Procesador móvil");
    }


}
