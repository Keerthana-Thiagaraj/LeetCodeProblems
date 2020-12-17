package Arrays;

//Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target?
// Find all unique quadruplets in the array which gives the sum of target.
//Notice that the solution set must not contain duplicate quadruplets.

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum.findFourSum(nums, target));
    }

    public List<List<Integer>> findFourSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet<>();

        if (nums.length == 0)
            return new ArrayList<>(res);
        Arrays.sort(nums); // to avoid duplicates
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int k = i + 2;
                int l = nums.length - 1;
                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        break;
                    } else if (sum > 0) {
                        l--;
                    } else if (sum < 0) {
                        k++;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
