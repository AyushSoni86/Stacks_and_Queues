package Stack_Questions;

import java.util.Stack;

public class ReverseString {
    // reverse a string using stack
    public static void main(String[] args) {
        String str = "Ayush";
        reverse(str);
    }

    static void reverse(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String temp = "";
        while (!stack.isEmpty()) {
            char ch = stack.peek();
            temp = temp + ch;
            stack.pop();
        }
        System.out.println(temp);
    }
}
