
public class Adyacente
{
    private int nodo;    
    private int peso;

    public Adyacente(int nodo,int peso){
        this.nodo= nodo;
        this.peso= peso;
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