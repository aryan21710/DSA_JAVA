package DSA.Graphs.Exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsTraversal {
    public static void main(String[] args) {
        int nodes = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,1,3);
        addEdge(adj,2,4);
        addEdge(adj,0,1);
        addEdge(adj,3,2);
        System.out.println(bfsTraversal(adj,nodes));
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
    }

    private static ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adj, int nodes) {
        ArrayList<Integer> output = new ArrayList<>();
        boolean[] visited = new boolean[nodes];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < nodes; i++) {
            if (!visited[i]) {
                q.add(i);
                visited[i]=true;
                while(!q.isEmpty()) {
                    Integer node = q.peek();
                    output.add(q.remove());
                    for(Integer adjNode : adj.get(node)) {
                        if (!visited[adjNode]) {
                            visited[adjNode]=true;
                            q.add(adjNode);
                        }
                    }
                }
            }
        }
        return output;
    }
}
