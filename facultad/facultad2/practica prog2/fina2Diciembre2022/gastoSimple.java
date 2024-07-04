package fina2Diciembre2022;

import java.sql.Date;
import java.util.ArrayList;

public class gastoSimple extends gasto {
    private String nombre;
    private String descripcion;
    private Date fecha;
    private int monto;
    private ArrayList<String> palabrasClaves;


    public gastoSimple(String nombre,String descripcion, Date fecha, int m){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.monto = m;
        this.palabrasClaves= new ArrayList<>();
    }


    @Override
    public int getDineroFecha(Condicion c) {
        if (c.Cumple(this)) {
            return this.monto;
        }
        return 0;
    }


    @Override
    public int montoTotal() {
        return this.monto;
    }


    @Override
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(this.palabrasClaves);
    }


    @Override
    public Date getFecha() {
        return this.fecha;
    }


    @Override
    public ArrayList<gasto> getGasto(Condicion c) {
        ArrayList<gasto> g = new ArrayList<>();
       if(c.Cumple(this)){
        g.add(this);
       }
       return g;
    }

    
}
