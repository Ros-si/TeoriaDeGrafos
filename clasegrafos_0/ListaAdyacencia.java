import java.util.ArrayList;
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
    public ListaAdyacencia (int n,boolean dirido){
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
    public int getNumAristas(){
        return 0;
    }  
    public boolean existeArista(int origen, int destino){
        boolean existe=false;
        for (int i=0;i<n;i++){
            for(Adyacente ad : grafo[i]){
                
            }
        }
        return existe;
    }
    public double getPesoArista(int i, int j){}
    public void insertarArista(int i, int j){}
}
