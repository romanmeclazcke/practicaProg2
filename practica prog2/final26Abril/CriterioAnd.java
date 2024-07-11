public class CriterioAnd  extends Criterios{
  private Criterios c1;
  private Criterios c2;
  
  
  public CriterioAnd(Criterios c1, Criterios c2){
    this.c1=c1;
    this.c2=c2;
  }


@Override
public boolean cumple(Pasajero p) {
   return c1.cumple(p) && c2.cumple(p);
}
}
