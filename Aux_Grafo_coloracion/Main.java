
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String []args){
        ListaAdyacencia grafo =  new ListaAdyacencia(8, false);
        grafo.insertarArista(0, 1);
        grafo.insertarArista(1, 2);
        grafo.insertarArista(1, 7);
        grafo.insertarArista(1, 6);
        grafo.insertarArista(2, 5);
        grafo.insertarArista(2, 3);
        grafo.insertarArista(3, 4);
        grafo.insertarArista(4, 5);
        grafo.insertarArista(5, 7);
        grafo.insertarArista(5, 6);
        grafo.insertarArista(6, 7);
        System.out.println("Grafo: "); 
        grafo.dibujarGrafo();
        System.out.println(); 
        
        Coloracion c = new Coloracion(grafo);
        c.colorear();
        System.out.println();
        
        c.getConjuntosIndependencia();
    }
}
