import java.util.ArrayList;

public class Pasajero {
    private String nombre;
    private int edad;
    private ArrayList<String> preferencias;

    public Pasajero(String n, int e){
        this.nombre=n;
        this.edad=e;
        this.preferencias=  new ArrayList<>();
    }


    public void addPreferencia(String s){
        this.preferencias.add(s);
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public ArrayList<String> getPreferencias() {
        return preferencias;
    }


    public void setPreferencias(ArrayList<String> preferencias) {
        this.preferencias = preferencias;
    }

    
}
