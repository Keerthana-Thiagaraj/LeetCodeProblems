package Arrays;

//Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2]

//2-pointer approach. In place algorithm. Space complexity- O(1) and time complexity-O(n)

public class RemoveDuplicatesInPlaceAlgo {

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2});
    }

    public static int removeDuplicates(int[] nums) {

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i])
                nums[++j] = nums[i];
        }
        return j + 1;
    }
}

