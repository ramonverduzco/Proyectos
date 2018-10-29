package ejercicios;
public class MiExcepcion extends Exception{
    private int codigoError;
     
    public MiExcepcion(int codigoError){
        super();
        this.codigoError=codigoError;
    }
     
    @Override
    public String getMessage(){
         
        String mensaje="";
         
        switch(codigoError){
            case 111:
                mensaje="Error, el numero número negativo";
                break;
        }        
        return mensaje;
         
    }
}
