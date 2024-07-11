import java.util.ArrayList;

public class VagonesCompuestos extends Vagones {
    private ArrayList<Vagones> vagones;

    public VagonesCompuestos(String n) {
        super(n);
        this.vagones = new ArrayList<>();
    }
    

    public void addVagon(Vagones v){
        this.vagones.add(v);
    }


    @Override
    public ArrayList<Asiento> getAsientos(Pasajero p) {
       ArrayList<Asiento> aux = new ArrayList<>();
       for (Vagones vagones : this.vagones) {
            aux.addAll(vagones.getAsientos(p));
       }
       return aux;
    }


    @Override
    public int getCantidadAsientos() {
        int aux =0;
        for (Vagones vagon : this.vagones) {
            aux+= vagon.getCantidadAsientos();
        }
        return aux;
    }


    @Override
    public Vagones getCopia(Criterios c) {
        ArrayList<Vagones> aux = new ArrayList<>();
        for (Vagones v : this.vagones) {
            Vagones vagonAux = v.getCopia(c);
            if(vagonAux!=null){
                aux.addAll(aux);
            }
        }

        if(!aux.isEmpty()){
            VagonesCompuestos vagonAux = new VagonesCompuestos(this.getNombreVagon());
            for (Vagones v :aux) {
                vagonAux.addVagon(v);
            }
            return vagonAux;
        }
        return null;
    }
    
    
}
