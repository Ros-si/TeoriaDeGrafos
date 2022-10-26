import java.util.ArrayList;
public class DAG
{
    ListaAdyacencia grafo;
    boolean[] visitados;
    ArrayList<Integer> secuencia;
    public DAG(ListaAdyacencia grafo)
    {
        this.grafo = grafo;
        this.visitados = new boolean[this.grafo.n];
        this.secuencia = new ArrayList<>();
    }
    
    
    public void getTopoSort(){
        this.topoSort(0);
        for(int i: this.secuencia){
            System.out.print(i+ " ,");
        }
    }
    
    public void topoSort(int v){
        this.visitados[v] =true;
        for(Adyacente vecino: this.grafo.getAdyacentes(v)){
            if(!visitados[vecino.getNodo()]){
                this.topoSort(vecino.getNodo());
            }
        }
        this.secuencia.add(0,v);
    }
}
