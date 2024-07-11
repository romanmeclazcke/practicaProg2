import java.util.ArrayList;

public class TareaCompuestaRepetitiva extends TareaCompuesta{
    private int repeticiones;

    public TareaCompuestaRepetitiva(int extra, int repeticiones) {
        super(extra);
        this.repeticiones = repeticiones;
    }

    public double getTiempo() {
        double tiempo=0;
        for (Elemento elem : this.elementos) {
            tiempo+= elem.getTiempo();
        }
        return tiempo*this.repeticiones;
    }


    @Override
    public double getCoste() {
        double costo=0;
        for (Elemento elem : this.elementos) {
            costo+=elem.getCoste();
        }
        return costo*this.repeticiones;
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
            if (this.repeticiones-1!=0) {
                TareaCompuestaRepetitiva copia= new TareaCompuestaRepetitiva(0,this.repeticiones-1);
                for (Elemento elemcumplen : elemCumplen) {
                    copia.add(elemcumplen);
                }
                return copia;
            }
       }
       return null;
    }
    

    @Override
    public ArrayList<String> getAcciones() {
       ArrayList<String> aux = new ArrayList<>();
      for (int index = 0; index < this.repeticiones; index++) {
            aux.addAll(super.getAcciones());
      }
      return aux;
    }
}
