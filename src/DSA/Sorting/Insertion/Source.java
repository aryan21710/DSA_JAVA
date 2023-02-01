package DSA.Sorting.Insertion;


import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        Source obj = new Source();
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] myArr=new int[size];
        for (int i = 0; i < size; i++) {
            myArr[i]=input.nextInt();
        }
        int[] output = obj.search(myArr,size);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    public int[] search(int[] myArr,int size) {
        for (int i = 0; i < size; i++) {
             int temp =0, swap=0;
            for (int j = i+1; j > 0 && j < size ; j--) {
                if( myArr[j] > myArr[j-1] ) {
                    swap++;
                    temp = myArr[j];
                    myArr[j] = myArr[j-1];
                    myArr[j-1] = temp;
                }
                if (swap == 0) {
                    return myArr;
                }
            }
        }
        return myArr;
    }
}

