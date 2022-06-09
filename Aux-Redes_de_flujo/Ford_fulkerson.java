import java.util.ArrayList;
import java.util.Stack;

public class Ford_fulkerson
{    
    int s;
    int t;
    int flujoMaximo = 0;
    ListaAdyacencia_Flujo grafo;
    boolean [] visitados;
    int [] padres;
    Stack<Integer> pila;
    public Ford_fulkerson(int s, int t, ListaAdyacencia_Flujo grafo)
    {
        this.s=s;
        this.t=t;
        this.grafo = grafo;
        this.pila = new Stack<>();
    }
    
    public void ford_fulkerson(){
        while(true){
            this.visitados = new boolean [this.grafo.getNumVertices()];
            this.padres = new int[this.grafo.getNumVertices()];    
            this.dfs(); //obtenemos un camino de aumento
            // verificamos si existe algun camino, es decir  si el sumidero t no fue visitado, salimos del while, si no enviar flujo y actualizar la red
            if(!this.visitados[this.t]){
                break;
            }
           
            int flujoActual = Integer.MAX_VALUE -1;
            
            //encontrar menor capacidad disponble
            int v = this.t;
            System.out.println();

            while(v!= this.s){ //Ciclo para encontrar un posible nuevo flujo   
                // arista u ->v
                int u = this.padres[v];
        
                int cap_uv = this.grafo.getArista(u,v).getCapacidad(); //capacidad actual de la arista u->v
                int flu_uv = this.grafo.getArista(u,v).getFlujo();     //flujo actual de la arista u->v
                System.out.println("arista  "+ u + "->"+v+ ": " +this.grafo.getArista(u,v).toString());

                int f = cap_uv - flu_uv;    // flujo residual
                flujoActual = Math.min(flujoActual , f);   
                System.out.println("flujo_actual: "+flujoActual);
                v = padres[v]; 
            }
            //aumentar flujoMaximo
            this.flujoMaximo +=  flujoActual;
            System.out.println("flujo Maximo actual: "+flujoMaximo);
            
            //actualizar red residual, red de flujo
            v = this.t;
            while(v!=s){
                //vemos arista u -> v
                int u = this.padres[v];
                
                int flu = this.grafo.getArista(u,v).getFlujo(); //obtenemos el flujo actual de la arista u->v de la red de flujo(grafo)
                int flu_res = this.grafo.getArista_residual(u,v).getFlujo();  //obtenemos la capacidad_residual actual de la arista u->v de la red residual
                
                //aumentar flujo en arista
                System.out.println("arista "+ u + "->"+v+ ": " +this.grafo.getArista(u,v).toString());
                this.grafo.getArista(u,v).setFlujo(flu + flujoActual);
                
                //actualizar capacidad residual
                System.out.println("arista RR  "+ u + "->"+v+ ": " +this.grafo.getArista_residual(u,v).toString());                
                this.grafo.getArista_residual(u,v).setFlujo(flu_res - flujoActual);
                
                System.out.println("arista actualizada "+ u + "->"+v+ ": " +this.grafo.getArista(u,v).toString());                
                System.out.println("arista RR actualizada "+ u + "->"+v+ ": " +this.grafo.getArista_residual(u,v).toString());                

                v = padres[v];
            }
            
        }
        System.out.println("FLUJO MAXIMO = "+ this.flujoMaximo);
    }
    
    
    public void dfs(){
        pila.push(this.s);        
        padres[s] = -1;
        while(!pila.empty()){
            int nodo_u = pila.pop();
            visitados[nodo_u] = true;
            for(Arista_Flujo ad: this.grafo.getAdyacentes(nodo_u)){
                int nodo_v = ad.getNodo();
                if(!visitados[nodo_v]){
                    if(ad.getFlujo() < ad.getCapacidad()){
                        pila.push(nodo_v);
                        padres[nodo_v] = nodo_u;
                    }
                }  
            }      
        }       
    }
    
    

}
