import java.util.ArrayList;

public class ProductoColeccionable extends Elemento {
    private int peso;
    private int volumen;
    private ArrayList<String> caracteristicas;

    public ProductoColeccionable(String n, int peso, int volumen) {
        super(n);
        this.peso = peso;
        this.volumen = volumen;
        this.caracteristicas = new ArrayList<>();
    }

    @Override
    public int getPeso() {
        return this.peso;
    }

    @Override
    public int getVolumen() {
        return this.volumen;
    }

    @Override
    public ArrayList<String> getCaracteristicas() {
        return this.caracteristicas;
    }

    @Override
    public ArrayList<ProductoColeccionable> buscar(Condicion c) {
        ArrayList<ProductoColeccionable> aux = new ArrayList<>();
        if (c.Cumple(this)) {
            aux.add(this);
        }
        return aux;
    }

    @Override
    public int getCantidadColeccionables() {
        return 1;
    }

    
    
}
