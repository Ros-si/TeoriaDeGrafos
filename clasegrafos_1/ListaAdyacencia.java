import java.util.ArrayList;
import java .util.Stack;
/**
 * Write a description of class ListaAdyacencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
    
    public void insertarArista(int origen, int destino, double peso){
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
    
    public void  dfsConStack(){
            Stack<Integer> pila = new Stack<>();
            boolean visitados[] = new boolean[n];
            int origen=0;
            pila.push(origen);
            while(!pila.empty()){
                origen = pila.pop();
                visitados[origen] = true;
                System.out.println("vertice: "+ origen + " visitado");
                for(Adyacente ad: this.grafo[origen]){
                    if(!visitados[ad.getNodo()]){
                        pila.push(ad.getNodo());
                        System.out.println("vecino "+ ad.getNodo()+" aniadido a la pila");
                    }                
                }
            }
        
    }
    
}
