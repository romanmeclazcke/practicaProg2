import java.util.ArrayList;

public abstract class Elemento implements Comparable<Elemento> {
    private String marca;

    public Elemento(String m){
        this.marca=m;
    }

    public abstract String getColor();
    public abstract double getPeso();
    public abstract int getCantidadEncastres();
    public abstract double getCosto();
    public abstract ArrayList<Elemento> busqueda(Criterio c);

    public String getMarca(){
        return this.marca;
    }

    @Override
    public int compareTo(Elemento o) {
       int result = this.getMarca().compareTo(o.getMarca());
       if (result==0) {
            result=  (int) (this.getCosto()-o.getCosto());
            if (result==0) {
                result=  this.getCantidadEncastres()-o.getCantidadEncastres();
                if (result==0) {
                    return this.getColor().compareTo(o.getColor());
                }
                return result;
            }
            return result;
       }
       return result;
    }

}
