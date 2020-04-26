package week2;

import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String S) {
           StringBuilder ans = new StringBuilder();
           Stack<Character> stack = new Stack();

           int start = 0;//初始化原语起始位置
           int end = 0;//初始化原语结束位置
           boolean flag = false;
           for (int i = 0;i < S.length();i++) {
               char ch = S.charAt(i);
               if (ch == '(') {
                    stack.push(ch);
               }
               if (!flag) {
                  start = i;
                  flag = ture;
               }
               if (ch == ')') {
                   stack.pop();

               }
               if (stack.isEmpty()) {
                   end = i;
                   ans.append(S.substring(start + 1,end));
                   flag = false;
                   start = end;
               }
           }
           return ans.toString();

    }
}