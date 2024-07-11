import java.util.ArrayList;

public abstract class Elemento {
    private String nombre;

    public Elemento(String nombre){
        this.nombre = nombre;
    }

    public abstract ArrayList<Curso> getCurso(Condicion c);
    public abstract int ContarCantidadCursos();
    public abstract Curso  getCursoMasCaro();
    public abstract double getPrecio();
    public abstract int getHorasCatedra();
    public abstract ArrayList<String> getPalabrasClaves();
    public abstract ArrayList<String> getDocentes();
}