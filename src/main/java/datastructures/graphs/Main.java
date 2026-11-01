package datastructures.graphs;

public class Main {

    public static void main (String[] args){
        Graphs myGraph = new Graphs(); // Vertex == vértices == perfil  Edge == arestas == vínculo de amizade
        myGraph.addVertex("Eduardo");
        myGraph.addVertex("Mylla");
        myGraph.addEdge("Mylla", "Eduardo");
        myGraph.printGraph();
        myGraph.removeEdge("Mylla", "Eduardo");
        myGraph.printGraph();
        myGraph.removeVertex("Eduardo");
        myGraph.printGraph();
    }
}
