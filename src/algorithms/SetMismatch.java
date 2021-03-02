package algorithms;

/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
due to some error, one of the numbers in s got duplicated to another number in the set,
which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.
 */

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int[] array = new int[2];
        boolean[] seen = new boolean[n + 1];

        for (int num : nums) {
            sum = sum - num;
            if (seen[num]) {
                array[0] = num;
            }
            seen[num] = true;
        }
        array[1] = sum + array[0];

        return array;
    }
}

