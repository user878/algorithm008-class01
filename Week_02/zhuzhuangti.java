package week2;

import java.util.Stack;

class zhuzhuangti {
     public int largestRectangleArea(int[] heights) {
         Stack<Integer> stack = new Stack<Integer>();
         stack.push(-1);
         int maxarea = 0;
         for (int i = 0;i <heights.length;i++) {
             while (stack.peek() != -1 && heights[stack.peek()] >= heights[i])
                 maxarea =Math.max(maxarea,heights[stack.pop()]*(i - stack.peek() - 1);
                 stack.push(i);
         }
         while (stack.peek() != 1)

             maxarea =Math.max(maxarea,heights[stack.pop()]*(i - stack.peek() - 1);
             return maxarea;
    }
}