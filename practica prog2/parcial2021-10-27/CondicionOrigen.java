public class CondicionOrigen extends CondicionViajes {
        private String origen;


        public CondicionOrigen(String o){
            this.origen=o;
        }


        @Override
        public boolean Cumple(Viaje v) {
            return v.getCiudadOrigen()== this.origen;
        }
}
