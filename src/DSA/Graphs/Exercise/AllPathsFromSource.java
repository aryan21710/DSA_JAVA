package DSA.Graphs.Exercise;


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class AllPathsFromSource {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        LinkedHashMap<Integer,ArrayList<Integer>> graph=new LinkedHashMap<>();
        int nodes = 0;

        if (in.hasNextInt())
            nodes = in.nextInt();
        for (int i = 0; i < nodes+1; i++) {
            ArrayList<Integer> neighbors=new ArrayList<Integer>();
            String inp = in.nextLine();
            if (!inp.equals("")) {
                String[] input = inp.split(" ");
                for (int j = 0; j < input.length; j++) {
                     neighbors.add(Integer.parseInt(input[j]));
                }
                graph.put(i-1,neighbors);
            }
        }

        System.out.println(findMaxPaths(graph,nodes));

    }

    static int findMaxPaths(LinkedHashMap<Integer,ArrayList<Integer>> graph, int nodes) {
        ArrayList<Integer> neighbor = graph.get(0); // [1,2]
        int count=0;
        for (int i = 0; i < neighbor.size(); i++) {
            String path= "0 -> ";
            path+=neighbor.get(i);
            ArrayList<Integer> n1 = graph.get(neighbor.get(i)); //[3]
            for (int j = 0; j < n1.size(); j++) {
                if (n1.get(j) > -1) {
                    path+=" -> "+n1.get(j);
                    while(graph.containsKey(n1.get(j))) {
                        n1 = graph.get(n1.get(j));
                        if (n1.get(0) > -1) {
                            path+=" -> "+n1.get(0);
                            if (n1.get(0)==nodes-1) {
                                count++;
                                break;
                            }
                        } else {
                            count++;
                            break;
                        }

                    }
                }
            }

        }
        return count;
    }
}
