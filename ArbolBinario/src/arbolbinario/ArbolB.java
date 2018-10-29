package arbolbinario;
public class ArbolB {
    Nodo raiz;
    String nodoResult = "";
    int total;
    int conteo = 0;

    public ArbolB() {
        raiz = null;
    }
    //Saber si el arbol esta vacía
    public boolean estaVacio(){
        return raiz==null;
    }
    //Método para inserter un nodo en el arbol
    public void agregarNodo(int dato){
        Nodo nuevo = new Nodo(dato);
        if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo aux = raiz;
            Nodo padre;
            while(true){
                padre = aux;
                if(dato<aux.dato){
                    aux = aux.hijoIzquierdo;
                    if(aux == null){
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                }else{
                    aux = aux.hijoDerecho;
                    if(aux == null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
    //Determinar el tamaño del arbol
    public int tamaño(){
        Nodo aux = raiz;
       return tamaño(aux);
    }

   //Determinar el tamaño del arbol
    private int tamaño(Nodo raiz){
       if (raiz == null) 
          return 0;
       else 
          return 1+ tamaño(raiz.hijoIzquierdo)+ tamaño(raiz.hijoDerecho);
    }
    // método para buscar
    public boolean busca(int d){
        Nodo aux = raiz;
        return buscar(aux,d);
    }
    // método para buscar
    private boolean buscar(Nodo nodo, int d){
        if (nodo==null)
            return false;
        if (d==nodo.dato)
            return true;
        else 
            if (d<nodo.dato)
                return buscar(nodo.hijoIzquierdo,d);
            else
                return buscar(nodo.hijoDerecho,d);
    } 
      
    //Determinar el promedio del arbol
    public double promedio(){
        Nodo aux = raiz;
       return (double) sumarNodos(aux)/tamaño(aux);
    }

    // Determinar el promedio del arbol
    private int sumarNodos(Nodo raiz){
        if (raiz!=null){
           return raiz.dato + sumarNodos(raiz.hijoIzquierdo) + sumarNodos(raiz.hijoDerecho);
        }
        return 0;
    }
    
    // Método para buscar hijos del nodo n
    public int buscarHijos(int d){
        Nodo aux = raiz;
        //return buscarHijos(aux,d);
        
        return buscarHijos(aux,d);
    }
    
    // método para buscar
    private int buscarHijos(Nodo nodo, int d){
        
        if (nodo==null)
            return 0;
        if (d==nodo.dato)
            // 2 si cuenta con dos hijos
            if (nodo.hijoIzquierdo !=null && nodo.hijoDerecho !=null){
                return 2;   
            }else{
                if (nodo.hijoIzquierdo !=null && nodo.hijoDerecho ==null )
                    return 1;
                else
                    if (nodo.hijoIzquierdo ==null && nodo.hijoDerecho !=null )
                            return 1;
                    else
                            return 0;
            }
                  
        else 
            //pregunta si es menor para saber si es nodo izq. o der.
            if (d<nodo.dato){
                return buscarHijos(nodo.hijoIzquierdo,d);
            }else
                return buscarHijos(nodo.hijoDerecho,d);    
    } 
    
    // método para buscar
        public int buscarHijosR(int d){
        Nodo aux = raiz;
        if(aux ==null)
            return -2;
        else
            return this.buscarHijosR(aux, d);
        //return buscarHijos(aux,d);
    }
    private int buscarHijosR(Nodo nodoAux, int nivel){
        Boolean t = buscar(nodoAux,nivel);
        int c=0;
        if (t==false)
            return 0;
        else{
            
            if(nodoAux.hijoIzquierdo!=null)
            c++;
        }
        return c;
    }  
    //Busca el nodo padre
    public int nodoPadre(int d) {
        Nodo aux = raiz;        
        if(aux == null){
            return 0;
        }else{
            return nodoPadre(aux, d);
        }        
    }
    private int nodoPadre(Nodo nodoAux, int d ){
        if(busca(d) != false)
            return nodoAux.dato;
        return 0;
        
    }
    
    public int generacion(int d) {
        Nodo aux = raiz;        
        return generacion(aux, d);
    }

    private int generacion(Nodo aux, int d) {
        int generacion = 0;
         
        return generacion;
    }
    
    //Recorridos de un AB
    //Método Inorden
    public String inorden(){
        nodoResult = "";
        Nodo aux = raiz;
        nodoResult = inorden(aux);
	//System.out.println();
        return nodoResult;
    }

    public String inorden(Nodo r){        
        if (r!=null) {
            inorden(r.hijoIzquierdo);
            //System.out.print (r.dato+" ");
            nodoResult = nodoResult+r.dato+" ";
            inorden(r.hijoDerecho);
	}
        return nodoResult;
    }
    //Método Preorden
    public String preorden(){
        nodoResult = "";
        Nodo aux = raiz;
        nodoResult = preorden(aux);
	//System.out.println();
        return nodoResult;
    }

    private String preorden(Nodo r){
        if (r!=null) {
            //System.out.print (r.dato+" ");
            nodoResult = nodoResult+r.dato+" ";
            preorden(r.hijoIzquierdo);            
            preorden(r.hijoDerecho);
	}
        return nodoResult;
    }
    //Método Posorden
    public String posorden(){
        nodoResult = "";
        Nodo aux = raiz;
        nodoResult = posorden(aux);
	//System.out.println();
        return nodoResult;
    }

    private String posorden(Nodo r){
        if (r!=null) {            
            posorden(r.hijoIzquierdo);            
            posorden(r.hijoDerecho);
            //System.out.print (r.dato+" ");
            nodoResult = nodoResult+r.dato+" ";
	}
        return nodoResult;
    } 
}
