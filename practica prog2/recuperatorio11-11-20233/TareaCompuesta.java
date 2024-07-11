import java.util.ArrayList;

public class TareaCompuesta extends Elemento {
    protected ArrayList<Elemento> elementos;
    private int extra;


    public TareaCompuesta(int extra){
        this.extra= extra;
        this.elementos= new ArrayList<>();
    }


    @Override
    public double getTiempo() {
        double tiempo=0;
        for (Elemento elem : this.elementos) {
            tiempo+= elem.getTiempo();
        }
        return tiempo+ this.extra*this.cantidadTareasSimples();
    }


    @Override
    public double getCoste() {
        double costo=0;
        for (Elemento elem : this.elementos) {
            costo+=elem.getCoste();
        }
        return costo;
    }


    @Override
    public int cantidadTareasSimples() {
        int cantidad=0;
        for (Elemento  elem :this.elementos) {
            cantidad+=elem.cantidadTareasSimples();
        }
        return cantidad;
    }


    @Override
    public Elemento getCopia(Criterio c) {
       ArrayList<Elemento> elemCumplen= new ArrayList<>();
       for (Elemento elem : this.elementos) {
        if (c.Cumple(elem)) {
            elemCumplen.add(elem.getCopia(c));
        }
       }

       if (!elemCumplen.isEmpty()) {
            TareaCompuesta copia= new TareaCompuesta(this.extra);
            for (Elemento elemcumplen : elemCumplen) {
                copia.add(elemcumplen);
            }
            return copia;
       }
       return null;
    }


    protected void add(Elemento elemcumplen) {
        this.elementos.add(elemcumplen);
    }


    @Override
    public ArrayList<String> getAcciones() {
       ArrayList<String> aux = new ArrayList<>();
       for (Elemento elem : this.elementos) {
        aux.addAll(elem.getAcciones());
       }
       return aux;
    }
}
