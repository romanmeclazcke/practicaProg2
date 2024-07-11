/*public class copias {
    
    Copia sin condicion
    simple
    public Element getCopia(){
        Simple aux = new Simple(paso los atributos que deba pasar);
        return aux;
    }

    compuesta
    public Element getCopia(){
        Compuesta aux = new Compuesta(Paso los atributos)
        for(Elemento e:this.elementos){
            aux.addAll(e.getCopia());
        }
    }

    Copia con condicion

    simple
    public Element getCopia(Condicion c){
        if(c.cumple(this)){
        return new Simple(paso atributos);
        }
        return null
    }

    compuesta =>si queda vacia no se agrega nada
    public Element getCopia(Criterio c){
        ArrayList<Elemento> aux = new ArrayList<>();
        for(Elemento e :this.elemento){
            if(e.getCopia(c)!=null){
                aux.add(e.getCopoa(c))
            }
        }
        if(!aux.isEmpty()){
            Compuesta aux = new Compuesta(paso atributos)
            for(Elemento e2: aux ){
                aux.add(e2)
            }
        }
    }
         

    
    compuesta =>si cumple ella se agrega ella sino sus hijos
    public Element getCopia(Criterio c){
        if(c.Cumple(this)){
            Compuesta uux = new Compuesta();
        }else{

        }
    }
    

}*/
