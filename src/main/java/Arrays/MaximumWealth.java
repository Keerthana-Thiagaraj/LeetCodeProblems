package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer
// has in the j​​​​​​​​​​​th​​​​ bank.
// Return the wealth that the richest customer has.
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
public class MaximumWealth {

    public static void main(String[] args) {

        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println("" + maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        PriorityQueue priorityQueue = new PriorityQueue();
        int count;
        for (int i = 0; i < accounts.length; i++) {
            count = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                count += accounts[i][j];
            }
            priorityQueue.add(count);
        }
        return (int) Collections.max(priorityQueue);
    }
}
