import java.util.Comparator;

public class OrdenamientoIdentificador  implements Comparator<Viaje>{

    @Override
    public int compare(Viaje o1, Viaje o2) {
        return o1.getID()-o2.getID();
    }
    
}
