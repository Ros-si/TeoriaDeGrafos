
/**
 * Write a description of class Matriz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matriz
{
    
    int[][] matrizAdyacencia;
    int[][] matrizIncidencia;
    boolean dirigido;
    int nVertices;
    
    public Matriz(int nVertices, boolean dirigido)
    {
        this.matrizAdyacencia = new int[nVertices][nVertices];
        this.matrizIncidencia = new int[nVertices][nVertices];
        this.dirigido = dirigido;        
        
    }
    

    public void insertarArista(int origen, int destino){
        this.matrizAdyacencia[origen][destino]++;
        this.matrizIncidencia[origen][destino] = 1;
        if(!this.dirigido){
            this.matrizAdyacencia[destino][origen]++;
            this.matrizIncidencia[destino][origen] = 1;
        }
    }
}
