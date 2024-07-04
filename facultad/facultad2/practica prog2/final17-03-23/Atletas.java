import java.util.ArrayList;

public class Atletas {
    private String nombre;
    private ArrayList<Entrenamiento> entrenamientos;
    private int FCardiaca;
    private ArrayList<String> efectos;
    
    public Atletas(String nombre, ArrayList<Entrenamiento> entrenamientos, int fCardiaca, ArrayList<String> efectos) {
        this.nombre = nombre;
        this.entrenamientos = entrenamientos;
        FCardiaca = fCardiaca;
        this.efectos = efectos;
    }


    
}
