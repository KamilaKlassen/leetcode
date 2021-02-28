package algorithms;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int sum;
        int[] newNums = new int[nums.length];

        newNums[0] = nums[0];

        for (int i = 1; i < newNums.length; i++) {
            sum = newNums[i - 1] + nums[i];
            newNums[i] = sum;
        }
        return newNums;
    }
}
