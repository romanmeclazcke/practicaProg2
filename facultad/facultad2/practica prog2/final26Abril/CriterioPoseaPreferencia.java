public class CriterioPoseaPreferencia extends Criterios{
    private String preferencia;


    public CriterioPoseaPreferencia(String p){
        this.preferencia=p;
    }


    @Override
    public boolean cumple(Pasajero p) {
        return p.getPreferencias().contains(this.preferencia);
    }


}
