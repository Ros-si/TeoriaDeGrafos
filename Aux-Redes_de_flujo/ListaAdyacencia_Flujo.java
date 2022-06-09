import java.util.ArrayList;
import java .util.Stack;
import java.util.LinkedList;

public class ListaAdyacencia_Flujo 
{
    int n;
    int nAristas;
    ArrayList<Arista_Flujo> [] grafo;
    ArrayList<Arista_Flujo> [] red_residual;
    public ListaAdyacencia_Flujo (int n){
        this.n = n;
        this.grafo= new ArrayList[n];
        this.red_residual= new ArrayList[n];

        for(int i=0; i<n; i++){
            this.grafo[i]= new ArrayList<Arista_Flujo>();
            this.red_residual[i]= new ArrayList<Arista_Flujo>();
        }
    }
    
    public  int getNumVertices(){
        return this.n;
    }
          
    public void insertarArista(int origen, int destino, int capacidad){
        this.grafo[origen].add(new Arista_Flujo(destino, capacidad));
        this.nAristas++;
        
        this.red_residual[origen].add(new Arista_Flujo(destino, capacidad, capacidad));
    }
    
    public void dibujarGrafo(){
        for(int i=0;i<this.grafo.length;i++){
            System.out.print(i+" ->");
            for(Arista_Flujo ad: this.grafo[i]){
                System.out.print(ad.toString());
            }
            System.out.println();
        }
    
    }
    public ArrayList<Arista_Flujo> getAdyacentes(int vertice){
        ArrayList<Arista_Flujo> listaAdyacentes = new ArrayList<>();
        for(Arista_Flujo ad: this.grafo[vertice]){
            listaAdyacentes.add(ad);
        }
        return listaAdyacentes;
    }
    
    public Arista_Flujo getArista(int vertice, int v_adyacente){
        for(int i=0; i< this.grafo[vertice].size(); i++){
            if(this.grafo[vertice].get(i).getNodo() == v_adyacente){
                return this.grafo[vertice].get(i);
            }
        }
        return null;
    }
 
       public Arista_Flujo getArista_residual(int vertice, int v_adyacente){
        for(int i=0; i< this.red_residual[vertice].size(); i++){
            if(this.red_residual[vertice].get(i).getNodo() == v_adyacente){
                return this.red_residual[vertice].get(i);
            }
        }
        return null;
    }
    
    public ArrayList<Arista_Flujo> []  getGrafo(){
        return this.grafo;
    }
}
