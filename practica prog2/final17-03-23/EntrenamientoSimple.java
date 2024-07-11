import java.util.ArrayList;

public class EntrenamientoSimple extends Entrenamiento {
    private int duracion;
    private int cantidadEnergia;
    private int intensidad;
    private String actividad;

    public EntrenamientoSimple(String n, int d, int cE, int i, String a){
        super(n);
        this.duracion=d;
        this.cantidadEnergia=cE;
        this.intensidad=i;
        this.actividad=a;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadEnergia() {
        return cantidadEnergia;
    }

    public void setCantidadEnergia(int cantidadEnergia) {
        this.cantidadEnergia = cantidadEnergia;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public int getDuracionEntrenamiento() {
        return this.duracion;
    }

    @Override
    public double getCosteEnergetico() {
        return this.cantidadEnergia;
    }

    @Override
    public ArrayList<String> getActividadEntrenamiento() {
        ArrayList<String> aux = new ArrayList<>();
        aux.add(this.actividad);
        return aux;
    }

    @Override
    public ArrayList<Entrenamiento> getEntrenamientos(Criterios criterio) {
       ArrayList<Entrenamiento> aux = new ArrayList<>();
       if (criterio.Cumple(this)) {
            aux.add(this);
       }
       return aux;
    }

    
}
