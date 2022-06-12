package Stack_Questions;

import java.util.Stack;

public class Delete_Middle_from_Stack {
    public void deleteMid(Stack<Integer> stack, int size) {
        solve(stack, 0, size);
    }

    private void solve(Stack<Integer> stack, int count, int size) {
        if (count == size / 2) {
            stack.pop();
            return;
        }
        int temp = stack.peek();
        stack.pop();
        solve(stack, count + 1, size);
        stack.push(temp);
    }
}
