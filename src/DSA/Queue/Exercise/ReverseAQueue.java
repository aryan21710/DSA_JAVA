package DSA.Queue.Exercise;


import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;
import java.util.Stack;

class ReverseAQueue{
    static Queue<Integer> q = new LinkedList<Integer>();

    public static void func() {
        Stack<Integer> s= new Stack<>();
        while(!q.isEmpty())
            s.push(q.remove());

        while(!s.isEmpty())
            q.add(s.pop());
        //write your code here

    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            q.add(in.nextInt());
        }
        func();
        System.out.println(q);
    }
}


