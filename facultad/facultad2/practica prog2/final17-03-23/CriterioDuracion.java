public class CriterioDuracion extends Criterios {
    private int duracion;

    public CriterioDuracion(int duracion){
        this.duracion=duracion;
    }


    public boolean Cumple(Entrenamiento entrenamiento){
        return entrenamiento.getDuracionEntrenamiento()> this.duracion;
    }
}
