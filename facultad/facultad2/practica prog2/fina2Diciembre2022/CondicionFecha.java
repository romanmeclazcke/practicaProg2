package fina2Diciembre2022;

import java.sql.Date;

public class CondicionFecha extends Condicion{
    private Date fecha;

    public CondicionFecha(Date fecha){
        this.fecha= fecha;
    }

    @Override
    public boolean Cumple(gasto g) {
       return g.getFecha().equals(this.fecha);
    }
    
}
