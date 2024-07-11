import java.time.LocalDate;

public class ViajePromocion  extends ViajeSimple{
    private int porcentaje;
    private LocalDate fechaInicioPromocion;
    private LocalDate fechaFinalPromocion;

    public ViajePromocion(int id, int cant, String origen, String destino, LocalDate fechaPago, int monto, int porcentaje,LocalDate fechaInicioPromocion, LocalDate fechaFinalPromocion) {
        super(id, cant, origen, destino, fechaPago, monto);
        this.porcentaje=porcentaje;
        this.fechaInicioPromocion=fechaInicioPromocion;
        this.fechaFinalPromocion= fechaFinalPromocion;
    }

    public int getCostoViaje(){
        if (this.fechaPago.isAfter(fechaInicioPromocion)&& this.fechaPago.isBefore(fechaFinalPromocion)) {
            return monto/porcentaje;
        }else{
            return monto;
        }
    }
    
}
