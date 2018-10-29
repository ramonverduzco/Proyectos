package juegobminas;

public class Celda {
    private TipoCelda tipoCelda;
    private EstadoCelda estadoCelda;
    private int bombasColindantes;
    
    public Celda(){
        this.estadoCelda=EstadoCelda.CERRADA;
    }
    
    public Celda(TipoCelda tc,EstadoCelda ec){
        this.tipoCelda = tc;
        this.estadoCelda = ec;
        this.bombasColindantes=0;
    }
    
    public void setTipoCelda(TipoCelda tc){
        this.tipoCelda=tc;
    }
    
    public void setEstadoCelda(EstadoCelda ec){
        this.estadoCelda=ec;
    }
    
    public void setBombasColindantes(int bc){
        this.bombasColindantes=bc;
    }
    
    public TipoCelda getTipoCelda(){
        return this.tipoCelda;
    }
    
    public EstadoCelda getEstadoCelda(){
        return this.estadoCelda;
    }
    
    public int getBombasColindantes(){
        return this.bombasColindantes;
    }
    
    public enum TipoCelda {
        VACIA,COLINDANTECONBOMBA,CONBOMBA;
    }
    
    public enum EstadoCelda {
    CERRADA,ABIERTA;
}
}
