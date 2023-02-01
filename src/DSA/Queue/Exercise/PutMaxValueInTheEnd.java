package DSA.Queue.Exercise;


import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;

class PutMaxValueInTheEnd{
    static Queue<Integer> q = new LinkedList<Integer>();

    public static void func() {
        //write your code here
        int max=Integer.MIN_VALUE;
        int size=q.size();
        for (int i = 0; i < size; i++) {
            if (q.peek() > max)
                max= q.peek();
            q.add(q.remove());
        }

        for (int i = 0; i < size; i++) {
            if (q.peek()!=max) {
                q.add(q.remove());
            } else {
                q.remove();
            }
        }

        q.add(max);
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
