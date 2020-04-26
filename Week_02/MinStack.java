import java.util.Stack;

class MinStack {
    private Stack<Integer> stack ;
    private Stack<Integer> minstack;
    /** initialize your data structure here. */
    public MinStack() {
            stack = new Stack<>();
            minstack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
         if (!minstack.isEmpty()){
             int top = minstack.peek()
              if (x <= top ) {
                   minstack.push(x);
              }
         }
         else {
             minstack.push(x);
        }
    }

    public void pop() {
           int pop = stack.pop();
           int top = minstack.peek();
           if (pop == top) {
               minstack.pop();
           }
    }

    public int top() {
            return stack.peek();
    }

    public int getMin() {
         return minstack.peek();
    }
}