import java.util.ArrayList;

public class EntrenamientoRepetitivo extends EntrenamientoCompuesto {

    private int repeticiones;


    public EntrenamientoRepetitivo(String n, Double f, int repeticiones) {
        super(n, f);
    }

    

    @Override
    public int getDuracionEntrenamiento() {
        int resultadoParcial=0;
        for (Entrenamiento entremiento : this.entrenamientos) {
            resultadoParcial+= entremiento.getDuracionEntrenamiento();
        }
        return (int) (resultadoParcial* this.repeticiones+ this.factor);
    }
    

    @Override
    public double getCosteEnergetico() {
        double resultadoParcial=0;
        for (Entrenamiento entrenamiento : this.entrenamientos) {
            resultadoParcial+= entrenamiento.getCosteEnergetico();
        }
        return resultadoParcial* this.repeticiones+this.factor;
    }

   
}
