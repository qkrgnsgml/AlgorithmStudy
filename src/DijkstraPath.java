import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DijkstraPath {

    public static HashMap<String, Integer> dijkstraFunc(HashMap<String, ArrayList<Edge>> graph, String start){
        Edge edgeNode;
        int currentDistance;
        String currentNode;
        ArrayList<Edge> nodeList;
        Edge adjcentNode;
        String adjcent;
        int distance;
        int weight;
        HashMap<String,Integer> distances = new HashMap<>();
        for (String s : graph.keySet()) {
            distances.put(s,Integer.MAX_VALUE);
        }
        distances.put(start,0);

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge(distances.get(start),start));

        //중간처리
        while (priorityQueue.size()>0){
            edgeNode = priorityQueue.poll();
            currentDistance = edgeNode.distance;
            currentNode = edgeNode.vertex;

            if(distances.get(currentNode)<currentDistance){
                continue;
            }

            nodeList = graph.get(currentNode);
            for (int index=0; index<nodeList.size();index++){
                adjcentNode = nodeList.get(index);
                adjcent = adjcentNode.vertex;
                weight = adjcentNode.distance;
                distance = currentDistance + weight;

                if(distance<distances.get(adjcent)){
                    distances.put(adjcent, distance);
                    priorityQueue.add(new Edge(distance,adjcent));
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<Edge>> graph = new HashMap<>();
        graph.put("A", new ArrayList<Edge>(Arrays.asList(new Edge(8, "B"), new Edge(1, "C"), new Edge(2, "D"))));
        graph.put("B", new ArrayList<Edge>());
        graph.put("C", new ArrayList<Edge>(Arrays.asList(new Edge(5, "B"), new Edge(2, "D"))));
        graph.put("D", new ArrayList<Edge>(Arrays.asList(new Edge(3, "E"), new Edge(5, "F"))));
        graph.put("E", new ArrayList<Edge>(Arrays.asList(new Edge(1, "F"))));
        graph.put("F", new ArrayList<Edge>(Arrays.asList(new Edge(5, "A"))));

        System.out.println(dijkstraFunc(graph,"A"));



    }
}
