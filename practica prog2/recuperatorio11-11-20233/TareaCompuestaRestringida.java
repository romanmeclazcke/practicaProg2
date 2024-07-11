import java.util.ArrayList;

public class TareaCompuestaRestringida extends TareaCompuesta {
    private Criterio c;

    public TareaCompuestaRestringida(int extra, Criterio c) {
        super(extra);
        this.c = c;
    }

    @Override
    public Elemento getCopia(Criterio c) {
       return null;
    }


    public void add(Elemento e){
        if (c.Cumple(e)) {
            this.elementos.add(e);
        }
    }

    

    
}
