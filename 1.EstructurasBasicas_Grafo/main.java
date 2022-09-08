
public class main
{
    public static void main(String args[]){
        int nVertices = 5;
        boolean dirigido = false;
        ListaAdyacencia listaAd = new ListaAdyacencia(nVertices, dirigido);
        //añadimos aristas del grafo
        listaAd.insertarArista(0,1);
        listaAd.insertarArista(0,2);
        listaAd.insertarArista(1,3);
        listaAd.insertarArista(1,4);
        listaAd.insertarArista(2,4);
        listaAd.insertarArista(2,4);
        listaAd.insertarArista(3,4);
        
        listaAd.dibujarGrafo();
    }
}
