public class CapitulosRevisados  extends Criterio{
    private Personas p;

    public CapitulosRevisados(Personas p){
        this.p=p;
    }



    @Override
    public boolean cumple(Capitulo cap) {
        return cap.getEditores().contains(p);
    }
    
}
