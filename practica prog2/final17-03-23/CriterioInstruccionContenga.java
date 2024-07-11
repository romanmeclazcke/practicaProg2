public class CriterioInstruccionContenga extends Criterios {
    private String instruccion;

    public CriterioInstruccionContenga(String instruccion){
        this.instruccion= instruccion;
    }

    public boolean Cumple(Entrenamiento entrenamiento){
        return  entrenamiento.getActividadEntrenamiento().contains(this.instruccion);
    }

    
}
