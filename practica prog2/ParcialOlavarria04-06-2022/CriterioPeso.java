public class CriterioPeso extends Criterio {
    private double peso;

    public CriterioPeso(double peso){
    this.peso=peso;
    }

    @Override
    public boolean CumpleCriterio(Elemento e) {
        return e.getPeso()<=peso;
    }
    
    
}
