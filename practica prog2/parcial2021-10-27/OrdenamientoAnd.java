import java.util.Comparator;

public class OrdenamientoAnd implements Comparator<Viaje> {
    private Comparator<Viaje> c1;
    private Comparator<Viaje> c2;

    public OrdenamientoAnd(Comparator<Viaje> c1,Comparator<Viaje> c2){
        this.c1=c1;
        this.c2=c2;
    }

    @Override
    public int compare(Viaje o1, Viaje o2) {
        int result= c1.compare(o1, o2);
        if (result==0) {
            return c2.compare(o1,o2);
        }
        return result;
    }
    
}
