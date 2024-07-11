public class CondicionMonto  extends CondicionViajes{
    private int monto;

    public CondicionMonto(int m){
        this.monto= m;
    }


    public boolean Cumple(Viaje v){
        return v.getCostoViaje()<this.monto;
    }
}
