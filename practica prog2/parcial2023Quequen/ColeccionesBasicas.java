public class ColeccionesBasicas extends ColeccionTematica {
        private Condicion c;

        public ColeccionesBasicas(String n, int extraVolumen, Condicion c) {
            super(n, extraVolumen);
            this.c = c;
        }

        public void addElement(Elemento e){
            if (this.c.Cumple(e)) {
                this.elementos.add(e);
            }
        }
}
