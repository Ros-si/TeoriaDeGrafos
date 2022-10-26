import java.util.ArrayList;

/**
 * Write a description of class ListaAdyacencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaAdyacencia
{
    ArrayList<Adyacente>[] lista;
    int n;
    boolean dirigido;
    
    public ListaAdyacencia(int nVertices,  boolean dirigido)
    {
        this.n = nVertices;
        this.dirigido = dirigido;        
        this.lista = new ArrayList[this.n];   
        
        for(int i=0; i<n; i++){
            this.lista[i]= new ArrayList<Adyacente>();
        }
    }
    
    public void insertarArista(int origen, int destino){
        this.lista[origen].add(new Adyacente(destino, 0));
        
        if(!this.dirigido){
            this.lista[destino].add(new Adyacente(origen, 0));
        }
    }
    public void insertarArista(int origen, int destino,int peso){
        this.lista[origen].add(new Adyacente(destino, peso));
        
        if(!this.dirigido){
            this.lista[destino].add(new Adyacente(origen, peso));
        }
    }
        
    public ArrayList<Adyacente> getAdyacentes(int vertice){
        ArrayList<Adyacente> listaAdyacentes = new ArrayList<>();
        for(Adyacente ad: this.lista[vertice]){
            listaAdyacentes.add(ad);
        }
        return listaAdyacentes;
    }
    
    public String toString(){
        String grafo = "";
        for(int i =0; i <this.lista.length; i++){
            grafo += i+" ->";
            for(Adyacente adyacente: this.lista[i]){
                grafo += adyacente.toString();
            }
            grafo += "\n";
        }
        return grafo;
    }
    
    public void dibujarGrafo(){
        System.out.println(this.toString());
    }
    
    

    
}
