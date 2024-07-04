public class CalculadorAnd implements Calculadora{
    Calculadora c1 ;
    Calculadora c2;

    public CalculadorAnd(Calculadora c1, Calculadora c2){
        this.c1=c1;
        this.c2=c2;
    }
    @Override
    public double calcularPrecio(Capitulo cap) {
        return c1.calcularPrecio(cap) + c2.calcularPrecio(cap);
    }

}