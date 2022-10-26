import java.util.*;


public class Bellman_Ford
{
    int distancias[];
    int INF =Integer.MAX_VALUE-1;
    ListaAdyacencia grafo;
    
    public Bellman_Ford(ListaAdyacencia grafo)
    {
        this.grafo = grafo;
        this.distancias = new int[this.grafo.n];
        
        Arrays.fill(this.distancias,this.INF);
    }
    
    public void bellman(int nodoI){
        this.distancias[nodoI]=0;
        
        for(int it=0; it<this.grafo.n; it++){
            for(int i =0; i<this.grafo.n ; i++){
                for(Adyacente vecino: this.grafo.getAdyacentes(i)){
                    int nodoX = i;
                    int nodoY =vecino.getNodo();
                    int peso =vecino.getPeso();
                    if(this.distancias[nodoX] + peso < this.distancias[nodoY]){
                        this.distancias[nodoY] = this.distancias[nodoX] + peso ;
                    }
                }
            }
            System.out.println("iteracion "+ it);
            for(int dis: this.distancias){
                System.out.print(dis + " ");
            }
            System.out.println();
        }
        
        
        
    }
}
