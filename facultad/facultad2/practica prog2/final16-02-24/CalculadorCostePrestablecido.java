public class CalculadorCostePrestablecido implements Calculadora {
    private int costeFijo;


    public CalculadorCostePrestablecido(int coste){
        this.costeFijo= coste;
    }


    @Override
    public double calcularPrecio(Capitulo cap) {
        return this.costeFijo;
    }

    
}
