package lista01questao3;

import java.util.Scanner;


public class Lista01Questao3 {

    
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        Vertice vertice1 = new Vertice("1");
        Vertice vertice2 = new Vertice("2");
        Vertice vertice3 = new Vertice("3");
        Vertice vertice4 = new Vertice("4");
        
        grafo.addNewVertice(vertice1);
        grafo.addNewVertice(vertice2);
        grafo.addNewVertice(vertice3);
        grafo.addNewVertice(vertice4);
           
        grafo.addNewAresta(vertice1, vertice3);
        grafo.addNewAresta(vertice1, vertice2);
        grafo.addNewAresta(vertice1, vertice4);
        grafo.addNewAresta(vertice2, vertice4);
        
        Operaçoes op = new Operaçoes(grafo);
        op.ordem();
        op.tamanho();
        op.vizinhos("1");
        op.vizinhos("2");
        op.vizinhos("3");
        op.vizinhos("4");
        op.grau("1");
        op.grau("2");
        op.grau("3");
        op.grau("4");
        op.isolados();
        op.extremidade();
        
    }
    
}
