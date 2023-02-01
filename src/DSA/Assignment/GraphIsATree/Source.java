package DSA.Assignment.GraphIsATree;

// https://learn.upgrad.com/course/3008/segment/28400/177645/545430/2796405

import java.util.*;

public class Source {

    private int vertexCount;
    private int noOfEdges;
    private static LinkedList<Integer> adj[];

    Source(int vertexCount, int noOfEdges) {
        this.vertexCount = vertexCount;
        this.noOfEdges = noOfEdges;
        this.adj = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; ++i) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        if (!isValidIndex(v) || !isValidIndex(w)) {
            return;
        }
        adj[v].add(w);
        adj[w].add(v);
    }

    private boolean isValidIndex(int i) {
        // Write code here
        return i>=0 && i<vertexCount;
    }

    private boolean isCyclic(int v, boolean visited[]) {
        // Write code here
        boolean isCycle = false;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < vertexCount; i++) {
            if (!visited[i] && adj[i].size() > 0) {
                q.add(i);
                visited[i]=true;
                while(!q.isEmpty()) {
                    Integer node = q.poll();
                    for(Integer adjNode : adj[node]) {
                        if (!visited[adjNode]) {
                            q.add(adjNode);
                            visited[adjNode]=true;
                        }  else {
                            isCycle=true;
                        }
                    }
                }
            }
        }
        return isCycle;
    }

    private boolean checkIfGraphIsConnected() {
        return noOfEdges==vertexCount-1;
    }

    public boolean isTree() {
        // Write Code here
        boolean[] isVisted = new boolean[vertexCount];
        return (checkIfGraphIsConnected() && isCyclic(vertexCount,isVisted));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Get the number of nodes from the input.
        int noOfNodes =  sc.nextInt();
        // Get the number of edges from the input.
        int noOfEdges = sc.nextInt();

        Source graph = new Source(noOfNodes, noOfEdges);
        // Adding edges to the graph
        for (int i = 0; i <noOfEdges; ++i) {
            graph.addEdge(sc.nextInt(),sc.nextInt());
        }
        if (graph.isTree()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}