import java.util.ArrayList;

public class VagonSimple extends Vagones{
    private ArrayList<Asiento> asientos;

    public VagonSimple(String nombreVagon) {
        super(nombreVagon);
        this.asientos = new ArrayList<>();
    }


    public void addAsiento(Asiento a){
        this.asientos.add(a);
    }


    @Override
    public ArrayList<Asiento> getAsientos(Pasajero p) {
        ArrayList<Asiento> aux = new ArrayList<>();
        for (Asiento asiento : this.asientos) {
            if(asiento.getCriterio().cumple(p) && asiento.getP()==null){
                aux.add(asiento);
            }
        }
        return aux;
    }


    @Override
    public int getCantidadAsientos() {
        return this.asientos.size();
    }


    @Override
    public Vagones getCopia(Criterios c) {
        ArrayList<Asiento> aux = new ArrayList<>();
        for (Asiento asiento :this.asientos) {
            if (c.cumple(asiento.getP())) {
                aux.add(asiento);
            }
        }

        if (!aux.isEmpty()) {
            VagonSimple vagonSimple = new VagonSimple(this.getNombreVagon());
            for (Asiento as :aux) {
                vagonSimple.addAsiento(as);
            }
            
            return vagonSimple;
        }
        return null;
    }
    

    

    
}
