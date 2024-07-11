import java.time.LocalDate;
import java.util.ArrayList;

public class ViajeSimple extends Viaje {
    private String origen;
    private String destino;
    protected LocalDate fechaPago;
    protected int monto;

    
    public ViajeSimple(int id, int cant, String origen, String destino, LocalDate fechaPago, int monto) {
        super(id, cant);
        this.origen = origen;
        this.destino = destino;
        this.fechaPago = fechaPago;
        this.monto = monto;
    }


    @Override
    public String getCiudadOrigen() {
        return this.origen;
    }


    @Override
    public String getCiudadDestino() {
        return this.destino;
    }


    @Override
    public LocalDate getFechaPago() {
       return this.fechaPago;
    }


    @Override
    public int getCostoViaje() {
       return this.monto;
    }


    @Override
    public ArrayList<Viaje> busquedaViajes(CondicionViajes c) {
      ArrayList<Viaje> aux = new ArrayList<>();
        if (c.Cumple(this)) {
            aux.add(this);
        }
        return aux;
    }

    
}
