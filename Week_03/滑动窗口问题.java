package week3;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int n = nums.length;
       if (n * k == 0) {
            return new int[0];
       }
       int[] output = new int[n - k + 1];
       for (int i = 0;i < output.length;i++) {
             int max = Integer.MIN_VALUE;//int能到的最小数
           for (int j = i;j < i + k;j++) {
                max = Math.max(max,nums[i]);
                output[i] = max;
           }
       }
       return  output;
    }

}

