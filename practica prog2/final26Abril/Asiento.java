import java.util.ArrayList;

public class Asiento {
    private int id;
    private ArrayList<String> facilidades;
    private Pasajero p;
    private Criterios criterioAsiento;


    public Asiento(int id, Pasajero p,Criterios criterio) {
        this.id = id;
        this.p = p;
        this.criterioAsiento= criterio;
    }
    
    public void addFacilidad(String s){
        this.facilidades.add(s);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<String> getFacilidades() {
        return facilidades;
    }
   
    public Pasajero getP() {
        return p;
    }
    public void setP(Pasajero p) {
        this.p = p;
    }

    public Criterios getCriterio(){
        return this.criterioAsiento;
    }


    
}
