package juegobminas;
public class espacio{

    //esta clase se encarga de hacer de cuadradito en el buscaminas(tu sabes donde
    //le das click y booooooooooooooooooooom jajaja)

    private int minasAlrededor;
    private boolean esMina;
    private boolean revelado;
    
    //Este es el constructor del espacio
    public espacio(){
        minasAlrededor=0;
        esMina=false;
    }
    public void colocarMina(){
        //se encarga de decir a un espacio si es mina o no...
        esMina=true;
    }
    public void aumentarMinas(){
        //se encarga de aumentar el munero deminas alrededor de este espacio
        if(esMina==false){
            minasAlrededor++;
        }
    }
    public boolean verMina(){
        //te dice si el espacio es una mina o no...
        return esMina;
    }
    public boolean verRevelado(){
        //te dice si ya visitaste este espacio mientras estas jugando(en si el programa
        //no te dice nada pero para saber si uno gano si sirve este proceso...
        return revelado;
    }
    public void cambiarEstado(){
        //una vez que visites un espacio este cambia su estado a revelado...
        revelado=true;
    }
    public String toString(){
        //ya saben cualquier toString imprime en pantalla cuando le dices System.out.println
        String res="*";
        if(revelado==true){
            res=""+minasAlrededor;
        }
        if(esMina==true&&revelado==true)
        res="X";
        return res;
    }
}
