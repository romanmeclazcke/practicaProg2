public class CondicionTiempo extends Condiciones {
    private int tiempoMaximo;

    public CondicionTiempo(int tiempoMaximo){
        this.tiempoMaximo= tiempoMaximo;
    }

    @Override
    public boolean Cumple(Tarjeta t) {
       return t.getTiempoEjecucion()<this.tiempoMaximo;
    }
    
}
