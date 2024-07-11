public class CriterioNombre extends Criterios {
    private String nombre;

    public CriterioNombre(String n){
        this.nombre= n;
    }
    @Override
    public boolean cumple(Pasajero p) {
        return !(p.getNombre()==this.nombre);    
    }
    
}
