public class main
{
    public static void main(String args[]){
        int nVertices = 6;
        boolean dirigido = false;
        ListaAdyacencia listaAd = new ListaAdyacencia(nVertices, dirigido);
        //añadimos aristas del grafo
        listaAd.insertarArista(0,1,3);
        listaAd.insertarArista(0,2,2);
        listaAd.insertarArista(0,4,2);
        listaAd.insertarArista(1,3,1);
        listaAd.insertarArista(1,4,1);
        listaAd.insertarArista(2,4,1);
        listaAd.insertarArista(3,4,1);
        listaAd.insertarArista(3,5,3);
        listaAd.insertarArista(4,5,2);
        
        listaAd.dibujarGrafo();
        
        Dijkstra dijkstra = new Dijkstra(listaAd);
        dijkstra.dijkstra();
                
        
    }
}
