package fina2Diciembre2022;

public class CondicionGastoPalabraClave extends Condicion {
    private String palabraClave;

    public CondicionGastoPalabraClave(String p){
        this.palabraClave=p;

    }
    @Override
    public boolean Cumple(gasto g) {
        return g.getPalabrasClaves().contains(this.palabraClave);
    }
    
}
