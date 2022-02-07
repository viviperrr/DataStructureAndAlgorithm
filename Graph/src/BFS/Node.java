package BFS;

import java.util.ArrayList;
import java.util.List;

public class Node{
    public char val;
    public List<Integer> weight;
    public List<Node> neighbors;

    public Node(){
        this.neighbors = new ArrayList<>();
        this.weight = new ArrayList<>();
    }

    public Node(char val){
        this.val = val;
        this.neighbors = new ArrayList<>();
        this.weight = new ArrayList<>();
    }

    public void addNeighbor(Node neighbor, int weight){
        this.neighbors.add(neighbor);
        this.weight.add(weight);
    }
}
