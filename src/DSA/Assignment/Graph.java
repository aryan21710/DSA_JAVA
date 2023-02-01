package DSA.Assignment;



import DSA.Assignment.GraphIsATree.Source;

import java.util.ArrayList;
        import java.util.LinkedList;
        import java.util.Queue;
import java.util.Scanner;

public class Graph {
    // Number of nodes in the graph
    private int numNodes;
    // Adjacency list representation of the graph
    private ArrayList<Integer>[] adjList;

    public Graph(int numNodes) {
        this.numNodes = numNodes;
        this.adjList = new ArrayList[numNodes];
        for (int i = 0; i < numNodes; i++) {
            this.adjList[i] = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the number of nodes from the input.
        int noOfNodes =  sc.nextInt();
        // Get the number of edges from the input.
        int noOfEdges = sc.nextInt();

        Graph graph = new Graph(noOfNodes);
        // Adding edges to the graph
        for (int i = 0; i <noOfEdges; ++i) {
            graph.addEdge(sc.nextInt(),sc.nextInt());
        }
        if (graph.hasCycle()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Add an edge from node u to node v
    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    // Check if there is a cycle in the graph using BFS
    public boolean hasCycle() {
        // Array to keep track of visited nodes
        boolean[] visited = new boolean[numNodes];
        // Queue to store the nodes visited in the BFS
        Queue<Integer> queue = new LinkedList<>();

        // Perform BFS starting from each node
        for (int i = 0; i < numNodes; i++) {
            if (!visited[i]) {
                queue.offer(i);
                visited[i] = true;
                while (!queue.isEmpty()) {
                    int current = queue.poll();
                    for (int neighbor : adjList[current]) {
                        if (!visited[neighbor]) {
                            queue.offer(neighbor);
                            visited[neighbor] = true;
                        } else {
                            // If a neighbor has already been visited and is in the queue, then there is a cycle
                            return true;
                        }
                    }
                }
            }
        }

        // If the BFS completes without finding a cycle, then the graph is acyclic
        return false;
    }
}
