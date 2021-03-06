package Arrays;

//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
// Find all unique triplets in the array which gives the sum of zero.
//Notice that the solution set must not contain duplicate triplets.
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] num = {-1, 0, 1, 0};
        System.out.println(threeSum.findTriplets(num));
    }

    public List<List<Integer>> findTriplets(int[] nums) {

        Set<List<Integer>> res = new HashSet<>();

        if (nums.length == 0)
            return new ArrayList<>(res);
        Arrays.sort(nums); //To-avoid duplicate triplets
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                } else if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                }
            }

        }
        return new ArrayList<>(res);
    }
}
