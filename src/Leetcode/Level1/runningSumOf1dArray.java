package Leetcode.Level1;

// https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1

public class runningSumOf1dArray {
    public static void main(String[] args) {
       int[] nums={1,1,1,1,1};
        runningSum(nums);
    }

    private static int[] runningSum(int[] nums) {
        int[] answer=new int[nums.length];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
                 sum+=nums[i];
                 answer[i]=sum;
        }
        return answer;
    }
}
