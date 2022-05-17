

public class main_ListaAdyacencia
{
    public static void main(String args[]){
        ListaAdyacencia grafo = new ListaAdyacencia(4,false);
        
        grafo.insertarArista(0,1,3);
        grafo.insertarArista(2,0,6);
        grafo.insertarArista(2,1,9);
        grafo.insertarArista(3,2,10);
        grafo.insertarArista(3,0,3);
        grafo.insertarArista(3,1,2);
                       
        grafo.dibujarGrafo();
        
        grafo.dfsConStack();
    }
}
