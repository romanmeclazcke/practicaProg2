public class CriterioCosteEnergia  extends Criterios{
    private int costeEnergia;

    public CriterioCosteEnergia(int energia){
        this.costeEnergia= energia;
    }

    public boolean Cumple(Entrenamiento entrenamiento){
        return entrenamiento.getCosteEnergetico()< this.costeEnergia;
    }

    
}
