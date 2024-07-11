import java.util.Comparator;

public class OrdenamientoOrigen implements Comparator<Viaje> {

    @Override
    public int compare(Viaje o1, Viaje o2) {
        return o1.getCiudadOrigen().compareTo(o2.getCiudadOrigen());
    }
    
}
