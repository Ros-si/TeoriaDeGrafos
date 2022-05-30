import java.util.*;

public class Coloracion
{
    ListaAdyacencia grafo;
    int numeroCromatico;
    int[] colores;
    
    public  Coloracion(ListaAdyacencia grafo){
        this.grafo = grafo;
        this.numeroCromatico=0;
        this.colores = new int[grafo.getNumVertices()];
        //inicialisamos los valores en -1 (no pintados)
        for(int i=0; i<colores.length; i++){
            this.colores[i]= -1;
        }
    }
    
    public void colorear(){
        //coloreamos bajo la logica del DFS
        Stack<Integer> pila = new Stack<>();
        int nodo = 0;
        pila.push(nodo);
        
        while(!pila.empty()){
            ArrayList<Integer> adPintados = new ArrayList<>();
            nodo = pila.pop();
            for(Adyacente ad: this.grafo.getAdyacentes(nodo)){
                int nodoAd = ad.getNodo();
                //si el  vertice adyacente no fue pintado, lo metemos a la pila para posteriormente pintarlo
                if(this.colores[nodoAd] == -1){ 
                    pila.push(nodoAd);
                }else{ // si fue pintado, lo metemos a otra lista para luego escoger color
                    adPintados.add(this.colores[nodoAd]);                    
                }
            }
            colores[nodo] = escogerColor(adPintados);
            
            if(numeroCromatico < escogerColor(adPintados)){
                numeroCromatico = escogerColor(adPintados);
            }
            
        }     
        
        // imprimir  coloracion y numero cromatico
        System.out.println("coloracion");
        for(int i=0; i<colores.length; i++){
            System.out.print(colores[i]+ " ");
        }
        System.out.println();
        numeroCromatico++;
        System.out.println("numero cromatico: "+ numeroCromatico);
    }
    
    //  retorna el minimo valor posible para colorear el vertice
    private int escogerColor(ArrayList<Integer> adPintados){
        int color =0;
        for(int i=0; i<adPintados.size(); i++){
            if(adPintados.contains(color)){
                color++;
            }
        }
        return color;
    }
    
    //obtener todos los conjuntos de independencia(conjunto de vértices que no tienen relación entre si)
    // y el numero de independencia(mayor número de vértices de un conjunto de independencia)
    public void getConjuntosIndependencia(){
        ArrayList<Integer>[] conjuntos = new ArrayList[numeroCromatico];
        int nroIndependencia = 0;
        for(int i=0; i< numeroCromatico; i++){
            conjuntos[i] = new ArrayList<>();
        }
        //agrupamos los vertices que tengan el mismo color 
        for(int i=0; i<numeroCromatico; i++){
            /*for(int c : this.colores){ 
                if(c == i){
                    conjuntos[i].add(c);
                }
            }*/
            for(int v=0 ; v<this.colores.length; v++){
                int c = this.colores[v];
                if(c == i ){
                    conjuntos[i].add(v); //añadimos el vertice del mismo color al conjunto
                }
            }
            
            //actualiza el numero de independencia si existe uno mayor.
            if(conjuntos[i].size() > nroIndependencia){
                nroIndependencia = conjuntos[i].size();
            }
        }
        
        
        //imprime los conjuntos de independencia y el numero de independencia
        System.out.println("conjuntos de independencia: "); 
        for(int i=0; i<conjuntos.length; i++){
            System.out.print("S(" + i + ")= ");
            for(int  s : conjuntos[i]){
                System.out.print(s + " ");
            }
            System.out.println();
        }
        
        System.out.println("numero de independencia:  "+ nroIndependencia);
                
        
    }
    
    
    
}
