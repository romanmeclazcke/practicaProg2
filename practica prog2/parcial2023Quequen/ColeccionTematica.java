import java.util.ArrayList;

public class ColeccionTematica extends Elemento {
    protected ArrayList<Elemento> elementos;
    protected int extraVolumen;

    public ColeccionTematica(String n, int extraVolumen) {
        super(n);
        this.extraVolumen = extraVolumen;
        this.elementos= new ArrayList<>();
    }

    @Override
    public int getPeso() {
        int peso = 0;
        for (Elemento e : this.elementos) {
            peso+=e.getPeso();
        }
        return peso;
    }

    @Override
    public int getVolumen() {
        int volumen = 0;
        for (Elemento e : this.elementos) {
            volumen+=e.getPeso();
        }
        return volumen*getCantidadColeccionables();
    }

    @Override
    public ArrayList<String> getCaracteristicas() {
        ArrayList<String> resultado = new ArrayList<>();
        for (Elemento e : this.elementos) {
            ArrayList<String> aux = e.getCaracteristicas();
            for (String caracteristica : aux) {
                if (!resultado.contains(caracteristica)) {
                    resultado.add(caracteristica);
                }
            }
        }
        return resultado;
    }

    @Override
    public ArrayList<ProductoColeccionable> buscar(Condicion c) {
       ArrayList<ProductoColeccionable> resultado= new ArrayList<>();
       for (Elemento e  : this.elementos) {
            resultado.addAll(e.buscar(c));
       }
       return resultado;
    }

    @Override
    public int getCantidadColeccionables() {
       int resultado =0;
       for (Elemento elemento : elementos) {
            resultado+=elemento.getCantidadColeccionables();
       }
       return resultado;
    }


    public void addElement(Elemento e){
        this.elementos.add(e);
    }
    
}
