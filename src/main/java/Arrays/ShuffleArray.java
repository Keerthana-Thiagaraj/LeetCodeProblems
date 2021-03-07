package Arrays;

import java.util.LinkedList;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
// Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
public class ShuffleArray {

    public static void main(String[] args) {
        shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 3);
    }


    public static int[] shuffle(int[] nums, int n) {

        LinkedList<Integer> list = new LinkedList();
        int j = nums.length / 2;
        for (int i = 0; i < nums.length / 2; i++) {
            System.out.println(nums[j]);
            list.add(nums[i]);
            list.add(nums[j]);
            j++;
        }
        System.out.println(list);
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}


//Alternate Sol:
//public int[] shuffle(int[] nums, int n) {
//        int sample[] = new int[nums.length];
//
//        for(int i = 0; i < n; i++) {
//            sample[2*i] = nums[i];
//            sample[2*i + 1] = nums[i+n];
//        }
//        return sample;
//    }
