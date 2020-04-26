package week2;

import java.lang.reflect.Array;
import java.util.Arrays;

class Anagram {
     public boolean isAnagram(String s, String t) {
         //排序
//         if (s.length() != t.length()) {
//             return false;
//         }
//         char[] ch1 = s.toCharArray();
//         char[] ch2 = t.toCharArray();
//         Arrays.sort(ch1);
//         Arrays.sort(ch2);
//         return Arrays.equals(ch1, ch2);
         if (s.length() != t.length()) {
               return false;
         }
         int[]  counter = new int[26];
         for (int i = 0;i < s.length();i++) {
              counter[s.charAt(i) - '0']++;
              counter[t.charAt(i) - '0']--;
         }1
         for (int count : counter) {
              if (count != 0) {
                  return  false;
              }
         }
         return true;
     }

}
