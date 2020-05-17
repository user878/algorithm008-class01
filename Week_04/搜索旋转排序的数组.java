package week4;

class Solution {
    public int search(int[] nums, int target) {
        class Solution {
            public int search(int[] nums, int target) {
                int st = 0, ed = nums.length - 1, mid = 0;
                while (st <= ed) {
                    mid = st + (ed - st) / 2;
                    if (nums[mid] == target) {
                        return mid;
                    }
                    if (nums[mid] >= nums[st]) {
                        if (target >= nums[st] && target < nums[mid]) {
                            ed = mid - 1;
                        }
                        else {
                            st = mid + 1;
                        }
                    }else
                    {
                        if (target <= nums[ed] && target > nums[mid])  {
                            st = mid + 1;
                        }
                        else {
                            ed = mid - 1;
                        }
                    }

                }
                return -1;
            }
        }
    }

}
//class Solution {
//    public int search(int[] nums, int target) {
//        for (int i = 0;i < nums.length;i++) {
//            if (nums[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
