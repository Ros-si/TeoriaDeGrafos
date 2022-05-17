
public class Adyacente
{
    private int nodo;    
    private double peso;

    public Adyacente(int nodo,double peso){
        this.nodo= nodo;
        this.peso= peso;
    }    

    public String toString(){
        return "(" + nodo +"," + peso +")";
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public int getNodo(){
        return this.nodo;
    }
    

}