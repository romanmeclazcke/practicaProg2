import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    private ArrayList<Viaje> viajes;
    public Main(){
        this.viajes= new ArrayList<>();
    }
    


    public ArrayList<Viaje> getViajesCondicionOrdenados(CondicionViajes cr, Comparator<Viaje> co){
        ArrayList<Viaje> aux = new ArrayList<>();

        for (Viaje v: this.viajes) {
            aux.addAll(v.busquedaViajes(cr));
        }
        aux.sort(co);
        return  aux;
    }


    
}
