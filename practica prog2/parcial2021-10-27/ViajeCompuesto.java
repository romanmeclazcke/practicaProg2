import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class ViajeCompuesto extends Viaje {
    private ArrayList<Viaje> viajes;

    public ViajeCompuesto(int id, int cant) {
        super(id, cant);
        this.viajes= new ArrayList<>();
    }

    @Override
    public String getCiudadOrigen() {
       return this.viajes.get(0).getCiudadOrigen();
    }

    @Override
    public String getCiudadDestino() {
        return this.viajes.get(this.viajes.size()-1).getCiudadDestino();
    }

    public void addViaje(Viaje v){
        if (this.viajes.size()==0) {
            this.viajes.add(v);
        }else{
            if (this.viajes.get(this.viajes.size()-1).getCiudadDestino()==v.getCiudadOrigen() && v.getCantidadPersonas()==this.getCantidadPersonas()) {
                this.viajes.add(v);
            }
        }
    }

    @Override
    public LocalDate getFechaPago() {
        Iterator<Viaje> iterador = this.viajes.iterator();
        LocalDate fechaPago = LocalDate.now();
        while (iterador.hasNext()) {
            Viaje v = iterador.next();
            if (v.getFechaPago()==null) {
                return null;
            }else if (v.getFechaPago().isAfter(fechaPago)) {
                fechaPago= v.getFechaPago();
            }
        }
        return fechaPago;
    }

    @Override
    public int getCostoViaje() {
         int  monto =0;
         for (Viaje v :this.viajes) {
            monto += v.getCostoViaje();
         }
         return monto;
    }

    @Override
    public ArrayList<Viaje> busquedaViajes(CondicionViajes c) {
        ArrayList<Viaje> viajes = new ArrayList<>();
        if (c.Cumple(this)) {
            viajes.add(this);
        }else{
            for (Viaje v :this.viajes) {
                viajes.addAll(v.busquedaViajes(c));
            }
       }
       return viajes;
    }


    
    
}
