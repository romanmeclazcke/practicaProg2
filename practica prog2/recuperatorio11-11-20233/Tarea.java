import java.util.ArrayList;

public class Tarea extends Elemento{
    private String accion;
    private double costo;
    private double tiempo;


    public Tarea(String a, double c, double t){
        this.accion= a;
        this.costo=c;
        this.tiempo=t;
    }


    @Override
    public double getTiempo() {
       return this.tiempo;
    }


    @Override
    public double getCoste() {
        return this.costo;
    }


    @Override
    public int cantidadTareasSimples() {
        return 1;
    }


    @Override
    public Elemento getCopia(Criterio c) {
        if (c.Cumple(this)) {
            return  new Tarea(this.accion, this.costo, this.costo);
        }
        return null;
    }


    @Override
    public ArrayList<String> getAcciones() {
       ArrayList<String> aux= new ArrayList<>();
       aux.add(accion);
       return aux;
    }
}