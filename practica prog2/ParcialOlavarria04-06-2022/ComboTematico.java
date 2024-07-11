
public class ComboTematico extends Combo {
    private Criterio criterioAceptacion;

    public ComboTematico(String marca, int descuento, Criterio c) {
        super(marca,descuento);
        this.criterioAceptacion=c;
    }

    public void addElemento(Elemento e){
        if (this.criterioAceptacion.CumpleCriterio(e)) {
            this.elementos.add(e);
        }
    }


    
}
