package lista01questao3;


public class Operaçoes {
    
    Grafo grafo;
    
    public Operaçoes(Grafo grafo){
        this.grafo = grafo;
    }
    
    public void ordem(){
        System.out.println("Ordem do grafo " + grafo.getSize());
    }
    
    public void tamanho(){
        System.out.println("Tamanho do grafo " + grafo.getEdgesLenght());
    }
    
    public void vizinhos(String nodeId){
        grafo.teste(nodeId);
        System.out.println();
    }
    
    public void grau(String nodeId){
        System.out.println("Grau de " + nodeId +  ": " + grafo.getNumberOfEdgesByNodeId(nodeId));
    }
    
    public void isolados(){
        grafo.teste2();
    }
    
    public void extremidade(){
        grafo.teste3();
    }
}
