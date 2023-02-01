package DSA.Stacks;

public class StacksUsingArray {
    static int[] myArr;
    static int top=-1;
    static int size;

    public StacksUsingArray(int size) {
        this.size = size;
        this.myArr = new int[this.size];
    }

    private static boolean isEmpty() {
                return top == -1;
    }

    private static boolean isFull() {
        if (top==size-1) return true;
        return false;
    }

    public void push(int elem) {
        if (isFull()) {
            throw new RuntimeException("STACK OVERFLOW !!");
        }
        myArr[++top]= elem;
    }

    public int pop() {
           if (isEmpty()) {
               throw new RuntimeException("STACK UNDERFLOW !!");
           }
           int result = myArr[top];
           top-=1;
           return result;
    }

    public void showDetails() {
        System.out.print("Current Stack:-");

        for (int i = 0; i <= top; i++) {
            System.out.print(myArr[i]+ " ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        StacksUsingArray myCustomStack = new StacksUsingArray(3);
        myCustomStack.push(10);
        myCustomStack.push(20);
        myCustomStack.push(30);
//        myCustomStack.push(40);

//        myCustomStack.push(40);
        System.out.println(myCustomStack.pop());
        System.out.println(myCustomStack.pop());
        myCustomStack.showDetails();
    }
}