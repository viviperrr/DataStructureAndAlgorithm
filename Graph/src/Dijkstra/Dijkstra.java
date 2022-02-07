package Dijkstra;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Dijkstra {
    private Dijkstra(){
    }

    public static HashMap<String, Integer> run(
            final HashMap<String, Integer> nodes,
            final String from,
            final HashMap<String, String> prevs)
    {
        HashMap<String, Integer> minDists = new HashMap<>();

        final int INF = Integer.MAX_VALUE;

        for(var entry : nodes.entrySet()){
            String name = entry.getKey();
            minDists.put(name, INF);
        }

        minDists.put(from, 0);
        prevs.put(from, null);

        PriorityQueue<Candidate> open = new PriorityQueue<Candidate>();

        Node s = nodes.get(from);
        Candidate candidate = new Candidate(s, 0);

        open.add(candidate);

        return minDists;
    }
}
