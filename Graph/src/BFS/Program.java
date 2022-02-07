package BFS;

public class Program {
    public static void main(String[] args){
        Graph graph = new Graph();
        Node root = graph.getSampleGraph();

        graph.searchBreathFirst(root);
    }
}