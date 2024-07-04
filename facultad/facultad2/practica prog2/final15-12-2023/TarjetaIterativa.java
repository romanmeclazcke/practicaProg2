import java.util.ArrayList;

public class TarjetaIterativa extends TarjetaCompuesta {

    private int cantidadRepeticiones;
    private int porcentajeExtra;

    public TarjetaIterativa(int cantidadRepeticiones, int porcentajeExtra){
        this.cantidadRepeticiones= cantidadRepeticiones;
        this.porcentajeExtra=porcentajeExtra;
    }
    
    

    @Override
    public double getTiempoEjecucion() {
         return super.getTiempoEjecucion()* Robot.getInstancia().getBateria()*porcentajeExtra/100;
    }

    public Tarjeta getCopia(Condiciones c) {
        ArrayList<Tarjeta> aux = new ArrayList<>();
        for (Tarjeta t : this.tarjetas) {
            if (c.Cumple(t)) {
                Tarjeta tarjeta = t.getCopia(c);
                aux.add(tarjeta);
            }
        }

        if (aux.isEmpty()) {
            return null;
        }else{
            TarjetaIterativa tCompuesta= new TarjetaIterativa(this.cantidadRepeticiones, this.porcentajeExtra);
            for (Tarjeta t : this.tarjetas) {
                tCompuesta.addTarjeta(t);
            }
            return tCompuesta;
        }
    }

}
