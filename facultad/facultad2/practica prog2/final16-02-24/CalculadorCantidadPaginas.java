public class CalculadorCantidadPaginas implements Calculadora {
    private int costeFijo;

    public CalculadorCantidadPaginas(int coste){
        this.costeFijo= coste;
    }
    @Override
    public double calcularPrecio(Capitulo cap) {
        return cap.sumaDePaginas()*this.costeFijo;
    }
}
