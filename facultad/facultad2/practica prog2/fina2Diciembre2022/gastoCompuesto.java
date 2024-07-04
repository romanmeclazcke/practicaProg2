package fina2Diciembre2022;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;

public class gastoCompuesto extends gasto {
    private ArrayList<gasto> gastos;


    public gastoCompuesto(){
        this.gastos= new ArrayList<>();
    }


    @Override
    public int getDineroFecha(Condicion c) {
        int dinero=0;
        for (gasto gasto :this.gastos) {
            dinero=gasto.getDineroFecha(c);
        }
        return dinero;
    }


    @Override
    public int montoTotal() {
       int montoTotal=0;
       for (gasto g : this.gastos) {
            montoTotal+=g.montoTotal();
       }
       return montoTotal;
    }


    @Override
    public ArrayList<String> getPalabrasClaves() {
       ArrayList<String> aux= new ArrayList<>();
       for (gasto g :this.gastos) {
            ArrayList<String> palabrasGasto = g.getPalabrasClaves();
            for (String pal : palabrasGasto) {
                if (!aux.contains(pal)) {
                    aux.add(pal);
                }
            }
       }
        Collections.sort(aux);
        return aux;
    }


    @Override
    public Date getFecha() {
        Date fecha =null;
        for (gasto gasto : this.gastos) {
            if (gasto.getFecha().after(fecha)) {
                fecha= gasto.getFecha();
            }
        }
        return fecha;
    }


    @Override
    public ArrayList<gasto> getGasto(Condicion c) {
       ArrayList<gasto> aux = new ArrayList<>();
        if (c.Cumple(this)) {
            aux.add(this);
        }else{
            for (gasto g : this.gastos) {
                if (!g.getGasto(c).isEmpty()) {
                    aux.addAll(g.getGasto(c));
                }
            }
        }
        return aux;
    }

}
