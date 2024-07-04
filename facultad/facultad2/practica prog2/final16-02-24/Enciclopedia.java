import java.util.ArrayList;

public class Enciclopedia extends Compuestos {
    private ArrayList<Elementos> elementos;

    public Enciclopedia(String nombre, int añoPublicacion, Personas editor) {
        super(nombre, añoPublicacion, editor);
        this.elementos= new ArrayList<>();
    }

    @Override
    public ArrayList<String> getTemas() {
        ArrayList<String> temas = new ArrayList<>();
        for (Elementos elemento : this.elementos) {
            ArrayList<String> temasElemento = elemento.getTemas();
            for (String tema:temasElemento) {
                if (!temas.contains(tema)) {
                    temas.add(tema);
                }
            }
        }
        return temas;
    }

    @Override
    public ArrayList<Personas> getAutores() {
        ArrayList<Personas> autores = new ArrayList<>();
        for (Elementos elem : this.elementos) {
            ArrayList<Personas> aux = elem.getAutores();
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
        ArrayList<Personas> editores = new ArrayList<>();
        for (Elementos elem : this.elementos) {
            ArrayList<Personas> aux = elem.getAutores();
            for (Personas p :aux) {
                if (!editores.contains(p)) {
                    editores.add(p);
                }
            }
        }
        return editores;
    }

    @Override
    public int sumaDePaginas() {
        int suma =0;
        for (Elementos e : this.elementos) {
             suma += e.sumaDePaginas();
        }
        return suma;
    }

    @Override
    public Elementos copiaElem(Criterio c) {
        ArrayList<Elementos> elemCumplen = new ArrayList<>();
        for (Elementos elemento :this.elementos) {
            if (elemento.copiaElem(c)!=null) {
                elemCumplen.add(elemento.copiaElem(c));
            }
        }
        if (!elemCumplen.isEmpty()) {
            Enciclopedia aux = new Enciclopedia(getNombre(), this.añoPublicacion, this.editor);
            for (Elementos elemento :elemCumplen) {
                aux.addElemento(elemento);
            }
            return aux;
        }
        return null;
    }

    public void addElemento(Elementos elem){
        this.elementos.add(elem);
    }

    @Override
    public double getPrecio() {
        double precio =0;
        for (Elementos elemento :this.elementos) {
            precio+=elemento.getPrecio();
        }
        return precio;
    }
}
