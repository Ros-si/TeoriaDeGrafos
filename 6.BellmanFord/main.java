public class main
{
    public static void main(String args[]){
        int nVertices = 6;
        boolean dirigido = true;
        ListaAdyacencia listaAd = new ListaAdyacencia(nVertices, dirigido);
        //añadimos aristas del grafo
        listaAd.insertarArista(0,1,8);
        listaAd.insertarArista(0,2,-2);
        listaAd.insertarArista(1,4,4);
        listaAd.insertarArista(2,1,1);
        listaAd.insertarArista(2,3,5);
        listaAd.insertarArista(3,1,3);
        listaAd.insertarArista(3,4,-2);
        listaAd.insertarArista(3,5,1);
        listaAd.insertarArista(4,5,3);
        listaAd.dibujarGrafo();
        
        Bellman_Ford bellman =new Bellman_Ford(listaAd);
        bellman.bellman(0);
    
        
        
    }
}
