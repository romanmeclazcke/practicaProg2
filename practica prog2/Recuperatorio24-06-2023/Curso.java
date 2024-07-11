import java.util.ArrayList;

public class Curso extends Elemento{
    private double precio;
    private ArrayList<String> docentes;
    private int cantidadHoras;
    private ArrayList<String> palabrasClaves;

    public Curso(String nombre, double precio, int cantidadHoras) {
        super(nombre);
        this.precio = precio;
        this.docentes = new ArrayList<>();
        this.cantidadHoras = cantidadHoras;
        this.palabrasClaves = new ArrayList<>();
    }

    @Override
    public ArrayList<Curso> getCurso(Condicion c) {
       ArrayList<Curso> cursos = new ArrayList<>();
       if (c.Cumple(this)) {
            cursos.add(this);
       }
       return cursos;
    }

    @Override
    public int ContarCantidadCursos() {
        return 1;
    }

    @Override
    public Curso getCursoMasCaro() {
        return this;
    }


    public double getPrecio(){
        return this.precio;
    }

    @Override
    public int getHorasCatedra() {
        return this.cantidadHoras;
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        return this.palabrasClaves;
    }

    @Override
    public ArrayList<String> getDocentes() {
        return this.docentes;
    }
}