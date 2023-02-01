package DSA.Searching.Linear;

import java.util.Scanner;
class ReverseSearch{
    public static void main(String args[]){
        System.out.println("Enter Number of elements in an array");
        Scanner input = new Scanner(System.in);
        //Declare the array here
        int count = input.nextInt();
        int[] array= new int[count];

        System.out.println("Enter the array elements");

        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Array entered");

        for (int i = 0; i < count; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println("Enter the element which needs to be searched");

        int key = input.nextInt();
        input.close();
        //write your code here

        int index=-1;

        for (int i = array.length - 1,j=0; i >=0 ; i--,j++) {
            if (array[i] == key ) {
                index = j;
                break;
            }
        }

        if (index >= 0) {
            System.out.println(index);
        }



    }
}