import java.util.ArrayList;

public abstract class Elemento{


    public abstract double getTiempo();
    public abstract double getCoste();
    public abstract int cantidadTareasSimples();
    public abstract Elemento getCopia(Criterio c);
    public abstract ArrayList<String> getAcciones();

}