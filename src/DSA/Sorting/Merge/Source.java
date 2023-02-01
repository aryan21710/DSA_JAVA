package DSA.Sorting.Merge;

public class Source {
    public static void main(String[] args) {
        int[] inputArr = {4,2,1,-1};
        Source myObj1 = new Source();
        Divide arraysOfObject = myObj1.divide(inputArr);
        int[] a = Source.mySort(arraysOfObject.a);
        int[] b = Source.mySort(arraysOfObject.b);
        Source.compareAndSwapElements(a,b, inputArr.length);
    }

    private Divide divide(int[] inputArr) {
        int size = inputArr.length;
        int[] a = new int[0 + size / 2];
        int[] b = new int[size - a.length];
        Divide obj = new Divide();
        int i=0,j=0;
        while(i < a.length) {
            a[i] = inputArr[i];
            i++;
        }
        while(j < b.length) {
            b[j] = inputArr[i];
            i++;
            j++;
        }
        obj.a = a;
        obj.b = b;
        return obj;
    }

    static int[] mySort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        return a;
    }


    static void compareAndSwapElements(int[] a, int[] b, int size) {
        int i = 0, j = 0, k = 0;
        int[] c = new int[size];
        while (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    c[k] = a[i];
                    i++;
                } else {
                    c[k] = b[j];
                    j++;
                }
                k++;
        }
        while(i < a.length) {
            c[k] = a[i];
            k++;
            i++;
        }

        while(j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        System.out.println("Sorted array");
        for (int m = 0; m < c.length; m++)
            System.out.print(c[m] + " ");

    }
}

class Divide {
    int[] a;
    int[] b;
}
