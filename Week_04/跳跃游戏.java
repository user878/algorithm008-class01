package week4;

class Solution {
    public boolean canJump(int[] nums) {
        int minNum = 0;
        for (int i = nums.length - 1;i > 0;i--) {
            if (nums[i] < minNum) minNum++;
            else minNum = 1;
        }
        return nums[0] >= minNum;
    }
}