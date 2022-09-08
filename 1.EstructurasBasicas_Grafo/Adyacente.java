
/**
 * Write a description of class Adyacente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adyacente
{
  
    private int vecino;
    private int peso;
    
    public Adyacente(int vecino, int peso)
    {
        this.peso=peso;
        this.vecino=vecino;
    }
    
    public String toString(){
        return "(" + vecino +"," + peso +")";
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public int getVecino(){
        return this.vecino;
    }    
}
