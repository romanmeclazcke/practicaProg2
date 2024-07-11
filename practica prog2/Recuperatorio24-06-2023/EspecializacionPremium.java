public class EspecializacionPremium extends Especializacion{

    public EspecializacionPremium(String nombre, int porcentajeDescuentoPorCurso, Condicion c) {
        super(nombre, porcentajeDescuentoPorCurso, c);
    }
    

    public double getPrecio(){
        int precio=0;
        for (Elemento e :this.elementos) {
            precio+=e.getPrecio();
        }
        return precio;
    }
}
