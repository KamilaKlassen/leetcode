package algorithms;

/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        List<Integer> list = new ArrayList<>();

        for (int n : nums) {
            list.add(n);
        }

        Collections.sort(list);

        for (int i = 0; i < len; i++) {
            result[i] = list.indexOf(nums[i]);
        }
        return result;
    }
}
