package Dijkstra;

import java.util.HashMap;
import java.util.Map;

public final class Node {
    private final String name;
    private final HashMap<Node, Integer> roads = new HashMap<>(); // neighbors and distance

    public Node(final String name) {
        this.name = name;
    }

    public Map<Node, Integer> getRoads(){
        return this.roads;
    }

    public void addRoad(final Node to, final int dist){
        this.roads.put(to, dist);
    }

    public int getDistance(final Node to){
        return this.roads.get(to);
    }
}
