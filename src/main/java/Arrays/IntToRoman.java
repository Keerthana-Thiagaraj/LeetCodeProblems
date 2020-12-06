package Arrays;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//Eg-The number 27 is written as XXVII, which is XX + V + II.
// There are six instances where subtraction is used:
// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.

import java.util.HashMap;
import java.util.LinkedHashMap;

public class IntToRoman {

    HashMap<Integer, String> map = new LinkedHashMap<Integer, String>(); // maintains order which is useful for appending from left to right

    public static void main(String[] args) {
        IntToRoman intToRoman = new IntToRoman();
        System.out.println(intToRoman.convertIntToRoman(101));
    }

    private String convertIntToRoman(int no) {
        storeMap();
        StringBuilder sb = new StringBuilder();
        for (Integer entry : map.keySet()) {
            while (no >= entry) {
                no -= entry;
                sb.append(map.get(entry));
            }
        }
        return sb.toString();
    }

    private void storeMap() {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }
}
