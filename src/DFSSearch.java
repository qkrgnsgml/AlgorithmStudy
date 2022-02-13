import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DFSSearch {

    public static ArrayList<String> bfs(HashMap<String,ArrayList<String>> graph, String start){
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisit = new ArrayList<>();
        needVisit.add(start);

        while (needVisit.size()>0){
            String node = needVisit.remove(needVisit.size()-1);

            if(!visited.contains(node)){
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }

        return visited;

    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<>();
        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        System.out.println(bfs(graph,"A"));
    }

}
