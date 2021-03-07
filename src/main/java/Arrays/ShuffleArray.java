package Arrays;

import java.util.LinkedList;

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

