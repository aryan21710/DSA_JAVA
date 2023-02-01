package DSA.Sorting.Quick;


/*
1] Pick the leftmost element in the array as elem a;
2] loop from i=0 to n-1;
3] compare every element i with elem a
    if i > a :- alter array such that i will be placed behind a (size of array should remain the same).
    if i < a:- dont do anything
4] perform 1 to 3 again



 */


public class Source {
    public static void main(String[] args) {
           int[] a = {7,2,1,6,5,3,8,4};
           int start = a[0];
           int end = a[a.length-1];
//           Source.quickSort(a,start, end);
    }

//    static int Partition(int[] a,int start, int end) {
//
//    }

//    static void quickSort(int[] a,int start, int end) {
//            if (start < end) {
//                int p = Source.Partition(a, start,end);
//                quickSort(a, 0,p-1);
//                quickSort(a, p+1, end);
//
//            }
//    }
}
