public class CriterioColor extends Criterio {
    private String color;

    public CriterioColor(String color){
        this.color=color;
    }

    @Override
    public boolean CumpleCriterio(Elemento e) {
        return e.getColor()==this.color;
    }
    
}
