

public class Par implements Comparable<Par>
{   
    int nodo;
    int distancia;
    public Par(int nodo, int dis)
    {
        this.nodo=nodo;
        this.distancia=dis;
    }
    
    public int compareTo(Par vecino){
        if(distancia == vecino.distancia){
            return Integer.compare(nodo, vecino.nodo);
        }
        return Integer.compare(distancia, vecino.distancia);
    }
}
