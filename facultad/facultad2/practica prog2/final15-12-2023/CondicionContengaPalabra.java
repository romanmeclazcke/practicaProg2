public class CondicionContengaPalabra extends Condiciones {
    private String palabra;

    public CondicionContengaPalabra(String p){
        this.palabra=p;
    }

    @Override
    public boolean Cumple(Tarjeta t) {
        return t.getComandos().contains(this.palabra);
    }
}
