package Arrays;

import java.util.Arrays;

// Program to push all the zeroes in an unsorted array towards the end with Two-pointer approach
// Time complexity - O(n)

public class MoveZeroesAtEnd {

    public static void main(String[] args) {
        int[] inputArray = {10, 3, 4, 1, 0, 9};
        MoveZeroesAtEnd moveZeroesAtEnd = new MoveZeroesAtEnd();
        System.out.println("" + Arrays.toString(moveZeroesAtEnd.updatedArray(inputArray)));
    }

    private int[] updatedArray(int[] input) {

        int t;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] != 0) {
                    t = input[i];
                    input[i] = input[j];
                    input[j] = t;
                }
            }
        }
        return input;
    }
}
