
/**
 * Write a description of class Adyacente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adyacente
{
  
    private int nodo;
    private int peso;
    
    public Adyacente(int nodo, int peso)
    {
        this.peso=peso;
        this.nodo=nodo;
    }
    
    public String toString(){
        return "(" + nodo +"," + peso +")";
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public int getNodo(){
        return this.nodo;
    }    
}
