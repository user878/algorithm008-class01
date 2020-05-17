package week4;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] grid, int[] size) {
        if (grid == null || size == null) {
            return 0;
        }
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0;
        int si = 0;
        while (gi < grid.length && si < size.length)  {
            if (size[si] >= grid[gi]) {
                gi++;
            }
            si++;
        }
        return gi;
    }
}
