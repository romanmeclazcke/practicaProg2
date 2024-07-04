public  abstract class Compuestos extends Elementos{
    protected int añoPublicacion;
    protected Personas editor;


    public Compuestos(String nombre, int añoPublicacion, Personas editor) {
        super(nombre);
        this.añoPublicacion = añoPublicacion;
        this.editor = editor;
    }   
}