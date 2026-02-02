package lesson5;

import java.util.Arrays;

public class HW_String_StringBuilderMethods {

    public static void printInColumnReverse(String s) {
        if (s == null || s.isBlank()) {
            System.out.println("Wrong String");
            return;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));

        }
    }

    public static int maxCharIndex(String s) {
        //dcdccbcabbabbb
        if (s == null || s.isBlank()) {
            System.out.println("Wrong String");
            return -1;
        }
        int[] counts = new int[127];
        int count, maxCount = 0, maxIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (counts[s.charAt(i)] != 0)
                    break;
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }
            counts[s.charAt(i)] = count;
            if (maxCount < count) {
                maxCount = count;
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    public static int maxCharIndex2(String s) {
        //dcdccbcabbabbb
        if (s == null || s.isBlank()) {
            System.out.println("Wrong String");
            return -1;
        }
        int count, maxCount = 0, maxIndex = 0;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        //aabbbbbcccdddddd
        for (int i = 0; i < s.length(); i += count) {
            count = 0;
            for (int j = i; j < s.length(); j++) {
                if (chars[i] == chars[j])
                    count++;
            }
            if (maxCount < count) {
                maxCount = count;
                maxIndex = i;
            }
        }
            return s.indexOf(chars[maxIndex]);
        }
    }


