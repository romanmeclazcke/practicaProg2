import java.util.ArrayList;

public class Capitulo extends Elementos{
    private int cantidadPaginas;
    private String tema;
    private ArrayList<Personas> autores;
    private Personas editor;
    private Calculadora calculadora;

    public Capitulo(String nombre, int cantidadPaginas, String tema, Personas editor, Calculadora c) {
        super(nombre);
        this.cantidadPaginas = cantidadPaginas;
        this.tema = tema;
        this.editor = editor;
        this.calculadora= c;
    }


    public void addAutor(Personas p){
        if(p.equals(this.editor)){
            System.out.println("El editor no puede ser autor del capitulo");
        }else{
            this.autores.add(p);
        }
    }


    @Override
    public ArrayList<String> getTemas() {
        ArrayList<String> aux = new ArrayList<>();
        aux.add(this.tema);
        return aux;
    }


    @Override
    public ArrayList<Personas> getAutores() {
        ArrayList<Personas> aux = new ArrayList<>();
        for(Personas p: this.autores){
            aux.add(p);
        }
        return aux;
    }


    @Override
    public ArrayList<Personas> getEditores() {
       ArrayList<Personas> aux = new ArrayList<>();
        aux.add(this.editor);
        return aux;
    }


    @Override
    public int sumaDePaginas() {
        return this.cantidadPaginas;
    }


    @Override
    public Elementos copiaElem(Criterio c) {
       if (c.cumple(this)) {
         return new Capitulo(tema, cantidadPaginas, tema, editor, this.calculadora);
       }
       return null;
    }


    @Override
    public double getPrecio() {
        return calculadora.calcularPrecio(this);
    }

    

    
}