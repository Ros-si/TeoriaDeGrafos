public class main
{
    public static void main(String args[]){
        int nVertices = 7;
        boolean dirigido = true;
        ListaAdyacencia listaAd = new ListaAdyacencia(nVertices, dirigido);
        //añadimos aristas del grafo
        listaAd.insertarArista(0,1);
        listaAd.insertarArista(0,2);
        listaAd.insertarArista(1,3);
        listaAd.insertarArista(1,2);
        listaAd.insertarArista(2,5);
        listaAd.insertarArista(2,4);
        listaAd.insertarArista(3,4);
        listaAd.insertarArista(4,6);
        listaAd.insertarArista(5,3);
        
        listaAd.dibujarGrafo();
        DAG dag = new DAG(listaAd);
        dag.getTopoSort();
    }
}
