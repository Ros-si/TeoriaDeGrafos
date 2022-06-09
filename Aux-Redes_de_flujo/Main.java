public class Main
{      
    public static void main(String args[]){
        ListaAdyacencia_Flujo grafo = new ListaAdyacencia_Flujo(4);
                       
        grafo.insertarArista(0,1,5);
        grafo.insertarArista(0,2,7);
        grafo.insertarArista(1,3,8);
        grafo.insertarArista(2,1,7);
        grafo.insertarArista(2,3,5);
        grafo.dibujarGrafo();
        
        Ford_fulkerson ff = new Ford_fulkerson(0,3, grafo);
        ff.ford_fulkerson();
    }
}
