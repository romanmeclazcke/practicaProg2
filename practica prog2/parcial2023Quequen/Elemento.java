import java.util.ArrayList;

public abstract class Elemento {
    private String nombre;
    private static int precioGramo=0;
    private static int costoUnidad=0;



    public Elemento(String n){
        this.nombre=n;
    }

    public static int getPrecioGramo() {
        return precioGramo;
    }

    public static void setPrecioGramo(int precioGramo) {
        Elemento.precioGramo = precioGramo;
    }

    public static int getCostoUnidad() {
        return costoUnidad;
    }

    public static void setCostoUnidad(int costoUnidad) {
        Elemento.costoUnidad = costoUnidad;
    }


    public abstract int getPeso();
    public abstract int getVolumen();
    public abstract ArrayList<String> getCaracteristicas();
    public abstract ArrayList<ProductoColeccionable> buscar(Condicion c);
    public abstract int getCantidadColeccionables();


    public int getCosto(){
        return getCantidadColeccionables()*costoUnidad+(getPeso()*precioGramo);
    }
    
}