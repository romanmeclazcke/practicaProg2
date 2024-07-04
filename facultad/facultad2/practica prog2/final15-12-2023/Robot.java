public class Robot {
    static Robot instancia;
    private int bateria;

    private Robot(){
        this.bateria=100;
    }


    public static Robot getInstancia(){
        if (instancia==null) {
            return new Robot();
        }else{
            return instancia;
        }
    }

    public int getBateria(){
        return this.bateria;
    }
    public void setBateria(int bateria){
        this.bateria= bateria;
    }
    
}
