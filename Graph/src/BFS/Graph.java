package BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    public void searchDepthFirst(){
        // TODO...
    }

    public void searchDepthFirstRecursive(){
        // TODO...
    }

    // BFS: Queue
    public void searchBreathFirst(Node node){
        HashSet<Node> discovered = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(node);
        discovered.add(node);

        while(!queue.isEmpty()){
            Node next = queue.remove();

            System.out.print(next.val + " ");

            for (Node neighbor : next.neighbors) {
                if(!discovered.contains(neighbor)){
                    queue.add(neighbor);
                    discovered.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    // Shortest Path: Dijkstra's Algorithm
    /*
     두 노드 사이의 최단 경로를 찾음
     변의 가중치가 음수인 경우에는 작동하지 않음(음의 가중치일땐 벨만 포드 알고리듬으로!)
     */
    public int searchShortestPath(Node start, Node destination){


        return -1;
    }

    /*
            2 - 3
           / \
          0   4
             / \
            5 - 1
     */
    public Node getSampleGraph(){
        Node n2 = new Node('2');
        Node n0 = new Node('0');
        Node n4 = new Node('4');
        Node n3 = new Node('3');
        Node n5 = new Node('5');
        Node n1 = new Node('1');

        n2.neighbors.add(n0);
        n2.neighbors.add(n4);
        n2.neighbors.add(n3);

        n0.neighbors.add(n2);

        n4.neighbors.add(n2);
        n4.neighbors.add(n5);
        n4.neighbors.add(n1);

        n3.neighbors.add(n2);

        n5.neighbors.add(n4);
        n5.neighbors.add(n1);

        n1.neighbors.add(n4);
        n1.neighbors.add(n5);

        return n2;
    }

    /*    2   6
        A - B - C
       3|  1|  1|
        D - E - F
          2   2
     */
    public Node getSampleGraphWeight(){
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');

        a.addNeighbor(b, 2);
        a.addNeighbor(d, 3);

        b.addNeighbor(a, 2);
        b.addNeighbor(c, 6);
        b.addNeighbor(e, 1);

        c.addNeighbor(b, 6);
        c.addNeighbor(f, 1);

        d.addNeighbor(a, 3);
        d.addNeighbor(e, 2);

        e.addNeighbor(d, 2);
        e.addNeighbor(b, 1);
        e.addNeighbor(f, 2);

        f.addNeighbor(c, 1);
        f.addNeighbor(e, 2);

        return a;
    }
}