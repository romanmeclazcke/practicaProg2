public class CriteriosEscritosPor extends Criterio {
    private Personas autor;

    public CriteriosEscritosPor(Personas p){
        this.autor= p;
    }
    @Override
    public boolean cumple(Capitulo cap) {
        return cap.getAutores().contains(this.autor);
    }
    
}
