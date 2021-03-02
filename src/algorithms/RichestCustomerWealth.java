package algorithms;

/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i customer has in
the j bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer
that has the maximum wealth.
 */

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int sum = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
            sum = 0;
        }
        return maxWealth;
    }
}
