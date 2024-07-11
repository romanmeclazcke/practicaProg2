import java.util.ArrayList;

public class EntrenamientoCompuesto extends Entrenamiento {
    protected ArrayList<Entrenamiento> entrenamientos;
    protected Double factor;


    public EntrenamientoCompuesto(String n,Double f){
        super(n);
        this.entrenamientos= new ArrayList<>();
        this.factor=f;
    }


    @Override
    public int getDuracionEntrenamiento() {
        int resultadoParcial=0;
        for (Entrenamiento entremiento : this.entrenamientos) {
            resultadoParcial+= entremiento.getDuracionEntrenamiento();
        }
        return resultadoParcial;
    }


    @Override
    public double getCosteEnergetico() {
        double resultadoParcial=0;
        for (Entrenamiento entrenamiento : this.entrenamientos) {
            resultadoParcial+= entrenamiento.getCosteEnergetico();
        }
        return resultadoParcial* this.factor;
    }


    @Override
    public ArrayList<String> getActividadEntrenamiento() {
        ArrayList<String> aux = new ArrayList<>();
        for (Entrenamiento e :this.entrenamientos) {
            aux.addAll(e.getActividadEntrenamiento());
            aux.add("-");
        }
        return aux;
    }


    @Override
    public ArrayList<Entrenamiento> getEntrenamientos(Criterios criterio) {
       ArrayList<Entrenamiento> aux = new ArrayList<>();
       if(criterio.Cumple(this)){
        aux.add(this);
       }else{
        for(Entrenamiento e: this.entrenamientos){
            if (e.getEntrenamientos(criterio).size()>0) {
                aux.addAll(e.getEntrenamientos(criterio));
            }
        }
       }
       return aux;
    }
}
