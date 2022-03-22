package lista01questao3;


import java.util.ArrayList;
import java.util.List;

public class Grafo {
  private final List<Vertice> vertices;
  private final List<Aresta> arestas;

  public Grafo(){
    this.vertices = new ArrayList<>();
    this.arestas = new ArrayList<>();
  }

  public boolean addNewVertice(Vertice vertice) {
    if (isVerticeOnGrafo(vertice)){
      return false;
    }else{
      return this.vertices.add(vertice);
    }
  }

  private boolean isVerticeOnGrafo(Vertice vertice){
    return this.vertices.contains(vertice);
  }

  public boolean addNewAresta(Vertice vertice1, Vertice vertice2) {
    if (isVerticeOnGrafo(vertice1) && isVerticeOnGrafo(vertice2)
        && vertice1.getId() != vertice2.getId() &&
        !isEdgeAlreadyOnGraph(vertice1, vertice2)){
      return this.arestas.add(new Aresta(vertice1, vertice2));
    }
    return false;
  }

  private boolean isEdgeAlreadyOnGraph(Vertice vertice1, Vertice vertice2){
    for(Aresta aresta: this.arestas){
      if (aresta.getVertice1().getId() == vertice1.getId() &&
          aresta.getVertice2().getId() == vertice2.getId()){
        return true;
      }
    }
    return false;
  }

  public int getSize() {
    return this.vertices.size();
  }

  public int getEdgesLenght() {
    return this.arestas.size();
  }

  public int getNumberOfEdgesByNodeId(String nodeId) {
    int count = 0;
    for(Aresta aresta: arestas){
      if(aresta.getVertice1().getId() == nodeId ||
          aresta.getVertice2().getId() == nodeId){
        count++;
      }
    }
    return count;
  }
  
  public void teste(String nodeId) {
      System.out.print("Vizinhos de " + nodeId + ": ");
    for(Aresta aresta: arestas){
          if(aresta.getVertice1().getId() == nodeId){
           System.out.print(aresta.getVertice2().getId() + " ");   
          }else if(aresta.getVertice2().getId() == nodeId){
           System.out.print(aresta.getVertice1().getId() + " ");   
          }
    }
  }
  
  public void teste2(){
      for(Vertice vertice : vertices){
          if(getNumberOfEdgesByNodeId(vertice.getId()) == 0){
              System.out.println("Vertice isolado " + vertice.getId());
          }
      }
  }
  
  public void teste3(){
      for(Vertice vertice : vertices){
          if(getNumberOfEdgesByNodeId(vertice.getId()) == 1){
              System.out.println("Vertice de extremidade " + vertice.getId());
          }
      }
  }  
  
}
