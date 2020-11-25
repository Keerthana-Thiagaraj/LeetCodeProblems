package Arrays;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//nums = [2,7,11,15], target = 9 o/p->[0,1]

public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] num = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.fetchIndices(num, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println("" + i);
        }
    }

    private int[] fetchIndices(int[] num, int target) {

        for (int i = 0; i < num.length; i++)
            for (int j = i + 1; j < num.length; j++)
                //if (num[i] != num[j]) -> removing this as the elements can be same
                if (num[i] + num[j] == target)
                    return new int[]{i, j};

        return null;
    }
}
