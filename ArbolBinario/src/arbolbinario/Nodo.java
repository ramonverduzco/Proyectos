package arbolbinario;
public class Nodo {
    int dato;
    Nodo hijoIzquierdo;
    Nodo hijoDerecho;
    public Nodo(int d) {
        this.dato = d;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    @Override
    public String toString() {
        return dato+"";
    }
}
