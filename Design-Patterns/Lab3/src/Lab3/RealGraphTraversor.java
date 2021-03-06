package Lab3;

import java.util.LinkedList;
import java.util.List;

public class RealGraphTraversor implements GraphTraversor {
    LinkedList<Node> nodes;//initializing global List

    public List<Node> DFS_traversing(Node start, Graph g){
        nodes = new LinkedList<>();
        g.resetNodesVisited();
        DFS(start,g);
        return nodes;
    }


    private void DFS(Node present, Graph g){
        nodes.add(present);
        present.visit();
        System.out.println(present);
        LinkedList<Node> neighbours = g.getNeighbors(present);
        if(neighbours!=null){
            for(Node node : neighbours){
                if(!node.getvisited()){
                    DFS(node, g);
                }
            }
        }
    }

    public List<Node> WFS_traversing(Node start, Graph g){
        nodes = new LinkedList<>();
        System.out.println("WFS begins at"+ start +":");
        g.resetNodesVisited();
        nodes.add(start);
        WFS(start,g);
        return nodes;
    }

    private void WFS(Node present, Graph g){
        LinkedList<Node> neighbours = g.getNeighbors(present);
        List <Node> toVisit = new LinkedList<>();

        if(neighbours!=null){
            for(Node node : neighbours){
                if(!node.getvisited()){
                    node.visit();
                    nodes.add(node);
                    toVisit.add(node);
                }
            }
        }

        for (Node node : toVisit) {
            WFS(node, g);
        }
    }

}
