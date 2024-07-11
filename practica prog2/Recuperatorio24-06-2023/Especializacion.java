import java.util.ArrayList;

public class Especializacion extends Elemento {
    private int porcentajeDescuentoPorCurso;
    private static int limiteDescuento=50;
    protected ArrayList<Elemento> elementos;
    private Condicion c;

    public Especializacion(String nombre, int porcentajeDescuentoPorCurso, Condicion c) {
        super(nombre);
        this.porcentajeDescuentoPorCurso = porcentajeDescuentoPorCurso;
        this.c= c;
    }

    public static void setLimiteDescuento(int limit){
        limiteDescuento = limit;
    }

    @Override
    public ArrayList<Curso> getCurso(Condicion c) {
       ArrayList<Curso> cursos = new ArrayList<Curso>();
       for (Elemento e :this.elementos) {
            cursos.addAll(e.getCurso(c));
       }
       return cursos;
    }

    @Override
    public int ContarCantidadCursos() {
       int cantidad=0;
       for (Elemento e : this.elementos) {
         cantidad+= e.ContarCantidadCursos();
       }
       return cantidad;
    }

    @Override
    public Curso getCursoMasCaro() {
       Curso aux = new Curso(null,0 ,0 );
       for (Elemento e : this.elementos) {
        if (e.getCursoMasCaro().getPrecio()>aux.getPrecio()) {
            aux =e.getCursoMasCaro();
        }
       }
       return aux;
    }

    @Override
    public double getPrecio() {
       int precio=0;
       for (Elemento e : this.elementos) {
        precio+=e.getPrecio();
       }
       int descuento= this.porcentajeDescuentoPorCurso* this.ContarCantidadCursos();

       if(descuento>limiteDescuento){
        return precio-(precio*porcentajeDescuentoPorCurso/100);
       }
       return precio-(precio*descuento/100);
    }

    @Override
    public int getHorasCatedra() {
       int horas=0;
       for (Elemento e : this.elementos) {
        horas+= e.getHorasCatedra();
       }
       return horas;
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
       ArrayList<String> result = new ArrayList<>();
       for (Elemento e: this.elementos) {
            ArrayList<String> aux =e .getPalabrasClaves();
            for (String s : aux) {
                if (!result.contains(s)) {
                    result.add(s);
                }
            }
       }
       return result;
    }

    @Override
    public ArrayList<String> getDocentes() {
    ArrayList<String> result = new ArrayList<>();
       for (Elemento e: this.elementos) {
            ArrayList<String> aux = e.getPalabrasClaves();
            for (String s : aux) {
                if (!result.contains(s)) {
                    result.add(s);
                }
            }
       }
       return result;
    }


    public void add(Elemento e){
        if (this.c.Cumple(e)) {
            this.elementos.add(e);
        }
    }
    
}
