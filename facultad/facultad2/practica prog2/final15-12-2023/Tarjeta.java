import java.util.ArrayList;

abstract class Tarjeta{

    public Tarjeta(){

    }

    public abstract double getTiempoEjecucion();
    public abstract double getGastoBateria();
    public abstract ArrayList<String> getComandos();
    public abstract Tarjeta getCopia(Condiciones c);

}