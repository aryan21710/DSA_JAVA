package DSA.Sorting.Bubble;

public class Source {
    public static void main(String[] args) {
        Source obj = new Source();
        int[] inputArr={13,3242,23,2351,352,3915,123,32,1,5,0};
        System.out.print("Input Array:-");
        for (int i = 0; i < inputArr.length; i++)
            System.out.print(inputArr[i]+" ");
        System.out.println("");
        int[] outputArr = obj.bubbleSort(inputArr);
        System.out.print("Sorted Array:-");
        for (int i = 0; i < outputArr.length; i++)
            System.out.print(outputArr[i]+" ");
    }

    public int[] bubbleSort(int[] myArr) {
        int temp=0,iteration=0;
        for (int i = 0; i < myArr.length; i++) {
            int swap=0;
            iteration++;
            for (int j = 1; j < myArr.length-i;j++) {
                iteration++;
                if(myArr[j-1] > myArr[j]) {
                swap++;
                    temp=myArr[j-1];
                    myArr[j-1]=myArr[j];
                    myArr[j]=temp;
                }
            }
            if (swap == 0) {
                System.out.println("total iteration 1:- "+iteration);
                return myArr;
            }
        }
        System.out.println("total iteration 2:- "+iteration);
     return myArr;
    }
}
