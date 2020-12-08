package Arrays;

//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
// Find all unique triplets in the array which gives the sum of zero.
//Notice that the solution set must not contain duplicate triplets.
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] num = {-1, 0, 1, 0};
        System.out.println(threeSum.findTriplets(num));
    }

    public Set<List<Integer>> findTriplets(int[] nums) {

        List<Integer> list;
        Set<List<Integer>> result = new HashSet<List<Integer>>();

        if (nums.length >= 0 && nums.length <= 3000) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            list = new LinkedList<Integer>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            if (!(result.containsAll(list))) {
                                result.add(list);
                            }
                            if ((nums[i] == 0 && nums[j] == 0 && nums[k] == 0)) {
                                return result;
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            return result;
        } else {
            return result;
        }
    }
}
