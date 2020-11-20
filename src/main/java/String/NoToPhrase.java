package String;

import java.util.HashMap;
import java.util.Map;

public class NoToPhrase {

    Map<Integer, String> wordMap = new HashMap<Integer, String>();

    public static void main(String[] args) {

        NoToPhrase noToPhrase = new NoToPhrase();
        System.out.println("" + noToPhrase.findPhrase(1234));

    }

    public String findPhrase(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        storeTheMap();
        if (number == 0) {
            return wordMap.get(0);
        }

        if (number >= 1000) {
            int digit = number / 1000;
            stringBuilder.append(convertNo(digit) + "Thousand");
            number = number % 1000;
        }

        if (number > 0) {
            stringBuilder.append(convertNo(number));
        }
        return stringBuilder.toString().trim();
    }

    public String convertNo(int no) {
        // 1234
        // 123 amd 4

        StringBuilder sb = new StringBuilder();
        if (no >= 100) {
            int remDigitHundred = no / 100;
            sb.append(wordMap.get(remDigitHundred) + "hundred");
            no = no % 100;
        }

        if (no > 0) {
            if (no > 0 && no <= 20) {
                sb.append("" + wordMap.get(no));
            } else {
                int remDigitTen = no / 10;
                sb.append("" + wordMap.get(remDigitTen * 10));

                int remDigit = no % 10;
                if (no > 0) {
                    sb.append("" + wordMap.get(remDigit));
                }
            }
        }
        return sb.toString();
    }

    public void storeTheMap() {

        wordMap.put(0, "Zero");
        wordMap.put(1, "One");
        wordMap.put(2, "Two");
        wordMap.put(3, "Three");
        wordMap.put(4, "Four");
        wordMap.put(5, "five");
        wordMap.put(6, "six");
        wordMap.put(7, "seven");
        wordMap.put(8, "eight");
        wordMap.put(9, "nine");
        wordMap.put(10, "ten");
        wordMap.put(11, "eleven");
        wordMap.put(12, "twelve");
        wordMap.put(13, "thirteen");
        wordMap.put(14, "fourteen");
        wordMap.put(15, "fifteen");
        wordMap.put(16, "sixteen");
        wordMap.put(17, "seventeen");
        wordMap.put(18, "eighteen");
        wordMap.put(19, "nineteen");
        wordMap.put(20, "twenty");
        wordMap.put(30, "thirty");
        wordMap.put(40, "forty");
        wordMap.put(50, "fifty");
        wordMap.put(60, "sixty");
        wordMap.put(70, "seventy");
        wordMap.put(80, "eighty");
        wordMap.put(90, "ninety");
    }
}