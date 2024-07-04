import java.util.ArrayList;

public class Libro extends Compuestos {

    private ArrayList<Capitulo> capitulo;

    public Libro(String nombre, int añoPublicacion, Personas editor) {
        super(nombre, añoPublicacion, editor);
       this.capitulo= new ArrayList<>();
    }

    @Override
    public ArrayList<String> getTemas() {
        ArrayList<String> temas = new ArrayList<>();
        for (Capitulo cap :this.capitulo) {
            if (!temas.contains(cap.getTemas())) {
                temas.addAll(cap.getTemas());
            }
        }
        return temas;
    }

    @Override
    public ArrayList<Personas> getAutores() {
        ArrayList<Personas> autores = new ArrayList<>();
        for (Capitulo cap : this.capitulo) {
            ArrayList<Personas> aux = cap.getAutores();
            for (Personas p :aux) {
                if (!autores.contains(p)) {
                    autores.add(p);
                }
            }
        }
        return autores;
    }

    @Override
    public ArrayList<Personas> getEditores() {
        ArrayList<Personas> editories = new ArrayList<>();
        for (Capitulo cap : this.capitulo) {
            ArrayList<Personas> aux = cap.getAutores();
            for (Personas p :aux) {
                if (!editories.contains(p)) {
                    editories.add(p);
                }
            }
        }
        return editories;
    }

    @Override
    public int sumaDePaginas() {
        int suma=0;
        for (Capitulo capitulo :this.capitulo) {
         suma+=capitulo.sumaDePaginas();   
        }
        return suma;
    }

    @Override
    public Elementos copiaElem(Criterio c) {
        ArrayList<Capitulo> aux = new ArrayList<>();
        for (Capitulo cap :this.capitulo) {
            if (cap.copiaElem(c)!=null) {
                //aux.add(cap.copiaElem(c));
            }
        }
        if (!aux.isEmpty()) {
            Libro l = new Libro(getNombre(), añoPublicacion, editor);
            for (Capitulo elemeneto :aux ) {
               l.addElemento(elemeneto);
            }
            return l;
        }
        return null;
    }

    private void addElemento(Capitulo capitulos) {
       this.capitulo.add(capitulos);
    }

    @Override
    public double getPrecio() {
        double precio =0;
        for (Capitulo elemento :this.capitulo) {
            precio+=elemento.getPrecio();
        }
        return precio;
    }

    
}
