package Leetcode.Level1;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        System.out.println(pivotIndex(nums));
    }

    private static int pivotIndex(int[] nums) {
        int lsum=0;
        for (int i = 0; i < nums.length; i++) {
            int rsum=0;
            if (i>0)
                lsum+=nums[i-1];
            for (int j = i+1; j < nums.length; j++)
                rsum+=nums[j];
            if (lsum==rsum)
                return i;
        }
        return -1;
    }
}
