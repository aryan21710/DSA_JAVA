package DSA.Sorting.Selection;

public class Source {
    public static void main(String[] args) {
        int[] myArr = {7,5,4,2,1};
        int[] output = Source.search(myArr);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+ " ");
        }
    }

    private static int[] search(int[] myArr) {
        int iterations=0;
        for (int i = 0; i < myArr.length-1; i++) {
            iterations+=1;
            int temp=0, swaps = 0, min =1;
            for (int j = i+1; j < myArr.length; j++) {
                if (myArr[j] < myArr[min]) {
                    min = j;
                    swaps++;
                }
            }

            if (swaps == 0) {
                System.out.println(iterations);
                return myArr;
            }
            temp = myArr[i];
            myArr[i] = myArr[min];
            myArr[min] = temp;

        }
        System.out.println(iterations);
        return myArr;
    }
}
