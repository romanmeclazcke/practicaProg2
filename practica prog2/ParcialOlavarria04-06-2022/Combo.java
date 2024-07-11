import java.util.ArrayList;

public class Combo extends Elemento  {
    protected ArrayList<Elemento> elementos;
    private int descuento;

    public Combo(String marca,int descuento) {
        super(marca);
        this.descuento = descuento;
        this.elementos= new ArrayList<>();
    }

    @Override
    public String getColor() {
        return this.elementos.get(this.elementos.size()-1).getColor();
    }

    @Override
    public double getPeso() {
        double peso=0;
        for (Elemento elemento : this.elementos) {
            peso += elemento.getPeso();
        }
        return peso;
    }

    @Override
    public int getCantidadEncastres() {
        int cantidad=0;
        for (Elemento elemento : this.elementos) {
            cantidad+=elemento.getCantidadEncastres();
        }
        return cantidad/this.elementos.size();
    }

    @Override
    public double getCosto() {
      double costo=0;
      for (Elemento elemento : this.elementos) {
        costo+= elemento.getCosto();
      }
      return costo- (costo * (this.descuento/100));
    }

    @Override
    public ArrayList<Elemento> busqueda(Criterio c) {
        ArrayList<Elemento> aux = new ArrayList<>();
        for (Elemento elemento : this.elementos) {
            aux.addAll(elemento.busqueda(c));
        }
        return aux; //ordenar
    }

    public void addElemento(Elemento e){
        this.elementos.add(e);
    }

   
    
}
