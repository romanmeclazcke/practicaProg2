import java.util.ArrayList;

public class TarjetaSimple extends Tarjeta{
    private String comando;
    private int gastoBateria;
    private int tiempoEjecucion;

    public TarjetaSimple(String comando, int gastoBateria, int tiempoEjecucion){
        this.comando = comando;
        this.gastoBateria=gastoBateria;
        this.tiempoEjecucion=tiempoEjecucion;
    }

    @Override
    public double getTiempoEjecucion() {
        return this.tiempoEjecucion;
    }

    @Override
    public double getGastoBateria() {
        return this.gastoBateria;
    }

    @Override
    public ArrayList<String> getComandos() {
        ArrayList<String> aux= new ArrayList<>();
        aux.add(this.comando);
        return aux;
    }

    public Tarjeta getCopia(Condiciones c ){
        if (c.Cumple(this)) {
            TarjetaSimple aux= new TarjetaSimple(comando, gastoBateria, tiempoEjecucion);
            return aux;
        }
        return null;
    }

    

}
