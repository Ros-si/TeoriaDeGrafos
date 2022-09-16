import java.util.*;
public class BFS
{
    
    ListaAdyacencia grafo;
    boolean visitados[];
    LinkedList <Integer>cola ;
    int []padres;
    
    public BFS(ListaAdyacencia lista){    
       this.grafo = lista;
       this.cola= new LinkedList<>();
       this.visitados= new boolean[this.grafo.n];
       this.padres = new int[this.grafo.n];
    }
    
    public void recorrer(int nodoInicio){
      
        //verificar que la cola no este vacia
        //marcar como visitado
        //ver vecinos 
        //añadimos vecinos  A la cola
        cola.add(nodoInicio);
        padres[nodoInicio] = -1;
        while(cola.size()>0){
            int nodoActual = cola.poll();
            visitados[nodoActual]= true;
            System.out.println(nodoActual + "visitado");
            for(Adyacente vecino: this.grafo.getAdyacentes(nodoActual)){
                if(!visitados[vecino.getNodo()]){
                    cola.add(vecino.getNodo());
                    this.padres[vecino.getNodo()] = nodoActual;
                    System.out.println("vecino "+ vecino +" aniadido");
                }
            }
            
        }
        
    }
    
    public void getCamino(int nodo){
       ArrayList<Integer> camino = new ArrayList<>();
       int verticeAct = padres[nodo];
       camino.add(nodo);       
        while(verticeAct !=-1){
           camino.add(0,verticeAct);
           verticeAct = padres[verticeAct];
        }
        for(int n : camino){
            System.out.print(n + "->");
        }
        
    }
    
    
}
