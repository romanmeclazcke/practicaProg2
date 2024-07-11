import java.util.ArrayList;

public class TarjetaCompuesta extends Tarjeta {
    protected ArrayList<Tarjeta> tarjetas;
    protected static int extraFijo=10;

    public TarjetaCompuesta(){
        this.tarjetas= new ArrayList<>();
    }

    public static void setExtraFijo(int extra){
        extraFijo= extra;
    }
    public static int getExtraFijo(){
        return extraFijo; 
    }

    @Override
    public double getTiempoEjecucion() {
        double aux =0;
        for (Tarjeta t : this.tarjetas) {
            aux += t.getTiempoEjecucion();
        }
        return aux;
    }

    @Override
    public double getGastoBateria() {
        double resultado =0;
     for (Tarjeta t : this.tarjetas) {
        if (Robot.getInstancia().getBateria()<50) {
            extraFijo= extraFijo*2;
            resultado+= t.getTiempoEjecucion()* extraFijo;
        }else{
            extraFijo=extraFijo/2;
            resultado+= t.getTiempoEjecucion()* extraFijo;
        }
     }  
     return resultado+ (extraFijo* Math.floor(resultado));
    }

    @Override
    public ArrayList<String> getComandos() {
        ArrayList<String> aux=  new ArrayList<>();
        for (Tarjeta t: this.tarjetas) {
            aux.addAll(t.getComandos());
        }
        return aux;
    }

    @Override
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
            TarjetaCompuesta tCompuesta= new TarjetaCompuesta();
            for (Tarjeta t : this.tarjetas) {
                tCompuesta.addTarjeta(t);
            }
            return tCompuesta;
        }
    }


    public void addTarjeta(Tarjeta t){
        this.tarjetas.add(t);
    }

    
}
