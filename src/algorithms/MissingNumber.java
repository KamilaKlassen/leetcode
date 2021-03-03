package algorithms;

/*
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
 */

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int temp = 0;

        for (int num : nums) {
            temp = temp + num;
        }
        return sum - temp;
    }
}
