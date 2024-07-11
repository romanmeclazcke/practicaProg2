import java.util.ArrayList;

public abstract class Elementos{
    private String nombre;

    public Elementos(String nombre){
        this.nombre=nombre;
    }


    public String getNombre(){
        return this.nombre;
    }

    public abstract ArrayList<String> getTemas();
    public abstract ArrayList<Personas> getAutores();
    public abstract ArrayList<Personas> getEditores();
    public abstract int sumaDePaginas();
    public abstract Elementos copiaElem(Criterio c);
    public  abstract double getPrecio();
}