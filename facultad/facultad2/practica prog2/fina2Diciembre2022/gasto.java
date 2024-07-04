package fina2Diciembre2022;

import java.sql.Date;
import java.util.ArrayList;

public abstract class gasto {
    
    public gasto(){

    }
    public abstract int getDineroFecha(Condicion c);
    public abstract ArrayList<gasto> getGasto(Condicion c);

    public abstract int montoTotal();
    public abstract ArrayList<String> getPalabrasClaves();
    public abstract Date getFecha();
}
