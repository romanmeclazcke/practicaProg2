import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Viaje {
    private int id;
    private int cantidadPersonas;

    public Viaje(int id, int cant){
        this.id =id;
        this.cantidadPersonas=cant;
    }

    public abstract String getCiudadOrigen();
    public abstract String getCiudadDestino();
    public abstract LocalDate getFechaPago();
    public abstract int getCostoViaje();
    public abstract ArrayList<Viaje> busquedaViajes(CondicionViajes c);

    public int getCantidadPersonas(){
        return this.cantidadPersonas;
    }
    public int getID(){
        return this.id;
    }
}