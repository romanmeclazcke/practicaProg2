import java.util.ArrayList;

public abstract class Entrenamiento {
    private String nombre;

    public Entrenamiento(String n){
        this.nombre =n;
    }

    public abstract int getDuracionEntrenamiento();
    public abstract double getCosteEnergetico();
    public abstract ArrayList<String> getActividadEntrenamiento();
    public abstract ArrayList<Entrenamiento> getEntrenamientos(Criterios criterio);
    
    
}
