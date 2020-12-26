package Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

//Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
public class FirstAndLastPositionOfAnElement {

    public static void main(String[] args) {
        int[] numss = searchRange(new int[]{5, 7, 7, 8, 8, 10}, 9);
        for (int i = 0; i < numss.length; i++) {
            System.out.println(numss[i]);
        }
    }

    public static int[] searchRange(int[] nums, int target) {

        Deque<Integer> numStack = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                numStack.push(i);
            }
        }

        if (numStack.isEmpty() || target == 0) {
            return new int[]{-1, -1};
        }
        return new int[]{numStack.getLast(), numStack.getFirst()};
    }
}
