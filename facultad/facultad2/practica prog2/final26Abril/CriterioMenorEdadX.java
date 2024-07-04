public class CriterioMenorEdadX extends Criterios {
    private int edad;

    public CriterioMenorEdadX(int edad){
        this.edad=edad;
    }

    @Override
    public boolean cumple(Pasajero p) {
       return p.getEdad()<this.edad;
    }
}