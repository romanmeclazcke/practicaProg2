import java.util.ArrayList;

class Treen {
    private String nombre; 
    private ArrayList<Vagones> vagones;

    public Treen(String nombre) {
        this.nombre = nombre;
    }

    public void addVagon(Vagones v){
        this.vagones.add(v);
    }

    
    
}