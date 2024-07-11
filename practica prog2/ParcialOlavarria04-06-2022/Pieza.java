import java.util.ArrayList;

public class Pieza extends Elemento{
    private double peso;
    private String color;
    private int cantidadEncastres;
    private double costo;


    public Pieza(String marca, double peso, String color, int cantidadEncastres,double costo) {
        super(marca);
        this.peso = peso;
        this.color = color;
        this.cantidadEncastres = cantidadEncastres;
        this.costo=costo;
    }


    @Override
    public String getColor() {
        return this.color;
    }


    @Override
    public double getPeso() {
        return this.peso;
    }


    @Override
    public int getCantidadEncastres() {
        return this.cantidadEncastres;
    }


    @Override
    public double getCosto() {
       return this.costo;
    }


    @Override
    public ArrayList<Elemento> busqueda(Criterio c) {
       ArrayList<Elemento> lista = new ArrayList<Elemento>();
       if (c.CumpleCriterio(this)) {
            lista.add(this);
       }
       return lista;
    }
}

    
