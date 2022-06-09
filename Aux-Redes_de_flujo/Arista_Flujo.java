
public class Arista_Flujo{

    private int nodo;    
    private int capacidad;
    private int flujo;

    public  Arista_Flujo(int nodo,int capacidad){
        this.nodo = nodo;
        this.capacidad = capacidad;
        this.flujo = 0;
    }  
    
     public  Arista_Flujo(int nodo,int capacidad, int flujo){
        this.nodo = nodo;
        this.capacidad = capacidad;
        this.flujo = flujo;
    }  

    public String toString(){
        return "(" + nodo +", " + capacidad +", "+ flujo+")";
    }
    
    public int getCapacidad(){
        return this.capacidad;
    }
    
    public int getNodo(){
        return this.nodo;
    
    }
    
    public int getFlujo(){
        return this.flujo;
    }
    
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    
    public void setFlujo(int flujo){
        this.flujo = flujo;
    }
}
