package DSA.Queue.ArrayBasedQ;

public class Source {
    int front, rear;
    int capacity;
    int[] a;

    public Source(int capacity) {
        this.capacity=capacity;
        this.front=-1;
        this.rear=-1;
        a= new int[capacity];
    }

    public static void main(String[] args) throws Exception {
        Source Q = new Source(4);
        Q.nQ(10);
        Q.nQ(20);
        Q.nQ(30);
        Q.nQ(40);
        Q.dQ();
        Q.dQ();
        Q.dQ();
        Q.dQ();
        Q.nQ(10);
        Q.nQ(20);
        Q.dQ();
        Q.dQ();
        Q.dQ();


    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return front+rear==this.capacity-1;
    }

    public void nQ(int elem) throws Exception {
        if (isFull())
            throw new Exception("Queue is FULL");


        if (rear==-1) {
            rear++;
        }
        front=(front+1)%this.capacity;
        a[front]=elem;
    }

    public int dQ() throws Exception {
        if (isEmpty()) throw new Exception("QUEUE IS EMPTY.");
        if (front==rear) {
            a[rear] = 0;
            front=-1;
            rear=-1;
            return -1;
        }
        int elem = a[rear];
        a[rear] = 0;
        rear=(rear+1)%this.capacity;
        return elem;

    }


}
