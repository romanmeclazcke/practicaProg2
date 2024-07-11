import java.util.ArrayList;

public abstract class Vagones {
    
    private String nombreVagon;

    public Vagones(String n) {
        this.nombreVagon=n;
    }

    public String getNombreVagon() {
        return nombreVagon;
    }

    public void setNombreVagon(String nombreVagon) {
        this.nombreVagon = nombreVagon;
    }

    public abstract  ArrayList<Asiento> getAsientos(Pasajero p);
    public abstract int getCantidadAsientos();
    public abstract Vagones getCopia(Criterios c);

    
}
