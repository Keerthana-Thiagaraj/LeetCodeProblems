package Hashing;

import java.util.HashSet;

/**
 * // This program will check if its possible to rearrange
 * // an even numbered array in such a way that the left half of the array is equal to the right half
 **/

public class HashSetImpl {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3, 1};
        HashSetImpl hashSet = new HashSetImpl();
        System.out.println("rearranged " + hashSet.checkRearrangedArray(arr));
    }

    private String checkRearrangedArray(int[] array) {
        int[] arr = {2, 3, 1, 2, 3, 1};
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            Integer val = arr[i];
            if (hashSet.contains(val))
                hashSet.remove(val);
            else
                hashSet.add(val);
        }
        return hashSet.isEmpty() ? "Yes" : "No";
    }
}
