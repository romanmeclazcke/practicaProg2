public class CondicionDestino extends CondicionViajes {
    private String origen;


    public CondicionDestino(String o){
        this.origen=o;
    }


    @Override
    public boolean Cumple(Viaje v) {
        return v.getCiudadDestino()== this.origen;
    }
}
