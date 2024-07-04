public  class CriterioMenosXPaginas extends Criterio {
    private int cantidadPaginas;
    
    public CriterioMenosXPaginas(int x){
        this.cantidadPaginas=x ;
    }

    @Override
    public boolean cumple(Capitulo cap) {
       return cap.sumaDePaginas()<this.cantidadPaginas;
    }


}
