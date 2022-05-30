import java.util.ArrayList;
import java .util.Stack;
import java.util.LinkedList;
public class ListaAdyacencia 
{
    int n;
    int nAristas;
    boolean dirigido;
    ArrayList<Adyacente> [] grafo;
    public ListaAdyacencia (int n,boolean dirigido){
        this.n = n;
        this.dirigido = dirigido;
        this.grafo= new ArrayList[n];
        
        for(int i=0; i<n; i++){
            this.grafo[i]= new ArrayList<Adyacente>();
        }
    }
    
    public  int getNumVertices(){
        return this.n;
    }
    
    public int getNumAristas(){return this.nAristas; }  
    
    public boolean existeArista(int origen, int destino){
        boolean existe=false;
        for (int i=0;i<n;i++){
            for(Adyacente ad : grafo[i]){
                 if(ad.getNodo()==destino){
                    existe=true;
                }
            }
        }
        return existe;
    } 
    
    public void insertarArista(int origen, int destino){
        this.grafo[origen].add(new Adyacente(destino, 0));
        this.nAristas++;
        if(!this.dirigido){
            this.grafo[destino].add(new Adyacente(origen, 0));
        }
    }
    
    public void insertarArista(int origen, int destino, int peso){
        this.grafo[origen].add(new Adyacente(destino, peso));
        this.nAristas++;
        if(!this.dirigido){
            this.grafo[destino].add(new Adyacente(origen, peso));
        }
    }
    
    public void dibujarGrafo(){
        for(int i=0;i<this.grafo.length;i++){
            System.out.print(i+" ->");
            for(Adyacente ad: this.grafo[i]){
                System.out.print(ad.toString());
            }
            System.out.println();
        }
    
    }
    public ArrayList<Adyacente> getAdyacentes(int vertice){
        ArrayList<Adyacente> listaAdyacentes = new ArrayList<>();
        for(Adyacente ad: this.grafo[vertice]){
            listaAdyacentes.add(ad);
        }
        return listaAdyacentes;
    }
        
    public ArrayList<Adyacente> []  getGrafo(){
        return this.grafo;
    }
        
    public void bfs(){
        LinkedList<Integer> cola = new LinkedList<>();
        boolean visitados[] = new boolean[n];
        int vertice=0;
        cola.add(vertice);
        while(cola.size() > 0){
            vertice = cola.poll();
            System.out.println("vertice: "+ vertice + " visitado");
            for(Adyacente ad: this.grafo[vertice]){
                if(!visitados[ad.getNodo()]){
                    cola.add(ad.getNodo());
                    visitados[vertice] = true;
                    System.out.println("vecino "+ ad.getNodo()+" aniadido a la cola");
                }                
            }
        }
    }
    
    
}
