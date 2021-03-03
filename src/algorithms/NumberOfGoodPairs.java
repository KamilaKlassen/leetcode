package algorithms;

/*
Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.
 */

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        int[] count = new int[101];

        for (int n : nums) {
            count[n]++;
        }

        for (int n : count) {
            pairs += (n * (n - 1)) / 2;
        }
        return pairs;
    }
}
