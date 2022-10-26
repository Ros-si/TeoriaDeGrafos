import java.util.*;
public class Dijkstra
{
    ListaAdyacencia grafo;
    int []distancias;
    int INF= Integer.MAX_VALUE -1;
    public Dijkstra(ListaAdyacencia grafo)
    {
        this.grafo=grafo;
        this.distancias =new int[this.grafo.n];
        for(int i =0;i<distancias.length; i++){
            this.distancias[i] =INF;
        }
    }
    
    public void dijkstra(){
        int ini =0;
        Queue<Par> bolsa = new PriorityQueue<>();
        this.distancias[ini] = 0;
        bolsa.add(new Par(ini,0 ));
        
        while(!bolsa.isEmpty()){
            Par actual= bolsa.poll();
            for(Adyacente vecino: this.grafo.getAdyacentes(actual.nodo)){
                if(actual.distancia +  vecino.getPeso() < distancias[vecino.getNodo()]){
                    distancias[vecino.getNodo()] =actual.distancia +  vecino.getPeso();
                    bolsa.add(new Par(vecino.getNodo(), actual.distancia +  vecino.getPeso()));
                }
            }
        }
        
        for(int i =0;i<distancias.length; i++){
          System.out.println("distancia a " + i + " es: " + distancias[i]);
        }
        
    }
}
