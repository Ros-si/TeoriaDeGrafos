import java.util.ArrayList;
import java.util.Stack;
public class DFS
{
    ListaAdyacencia grafo;
    Stack<Integer> pila;
    boolean visitados[];
    public DFS(ListaAdyacencia grafo)
    {
        this.grafo=grafo;
        pila=new Stack<Integer>();
        visitados=new boolean[this.grafo.n];
    }

    public void recorrer(int inicio){
        pila.push(inicio);        
        while(!pila.empty()){
            int nodoActual= pila.pop();
            visitados[nodoActual] = true;
            System.out.println("nodoActual: "+nodoActual);
            for(Adyacente vecino: this.grafo.getAdyacentes(nodoActual)){
                if(!visitados[vecino.getNodo()]){
                    pila.push(vecino.getNodo());
                    System.out.println("vecino de "+ nodoActual +": " + vecino.getNodo());
                }
            }
        }
        
    }
    
    public void dfsRecursivo(int origen){
            visitados[origen]=true;
            for(Adyacente vecino: this.grafo.getAdyacentes(origen)){
                if(!visitados[vecino.getNodo()]){
                    dfsRecursivo(vecino.getNodo());
                }
            }
    }

}










