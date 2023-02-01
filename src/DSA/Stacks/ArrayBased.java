package DSA.Stacks;

public class ArrayBased {
    int[] arr=new int[5];
    int top=-1;
    public static void main(String[] args) throws Exception {
        ArrayBased myStack = new ArrayBased();
        myStack.push(10);
        myStack.push(11);
        myStack.push(12);
        myStack.push(13);
        myStack.push(14);
//        myStack.push(15);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
//        myStack.pop();
        myStack.push(10);
        myStack.push(11);
        myStack.push(12);
        myStack.push(13);
        myStack.push(14);
        System.out.println("top element:-"+myStack.peek());
        myStack.showDetails();
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length;
    }

    public void push(int elem) throws Exception {
        if (isFull())
            throw new Exception("STACK OVERFLOW");
        top++;
        arr[top] = elem;
    }

    public int pop() throws Exception {
        if (isEmpty())
            throw new Exception("STACK UNDERFLOW");
        int currentElem = arr[top];
        top--;
        return currentElem;
    }

    public int peek() {
        return arr[top];
    }

    public int size() {
        return top+1;
    }

    public void showDetails() {
        System.out.println("STACK CONTENTS:-");
        for (int i = 0; i < top+1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
