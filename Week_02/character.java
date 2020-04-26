package week2;

import java.util.Stack;

class character {
    public boolean isValid(String s) {
        /判断输入的是否为空
        if (s.isEmpty) {
                  return ture;
        }
        //创建栈
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == "(") {
               stack.push(")");
            }
            else if (c == "{"){
                stack.push("}");
            }
            else if (c == "[") {
                 stack.push("]");
            }
            else if (c != stack.pop()) {
                return false;
            }

        }
        if (stack.empty()) {
            return ture;
        }
        return false;
    }
}