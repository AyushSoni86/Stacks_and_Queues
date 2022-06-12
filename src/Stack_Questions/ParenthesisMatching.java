package Stack_Questions;

import java.util.Stack;

public class ParenthesisMatching {

    public static void main(String[] args) {
        String str = "()[]{} " ;
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isOpening(ch)) {
                s.push(ch);
            } else {
                if (s.isEmpty()) return false;
                else if (!isMatch( s.peek(), ch)) return false;
                else s.pop();
            }
        }
        return s.isEmpty();
    }

    private static boolean isOpening(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

    private static boolean isMatch(char a, char b) {
        return  (a == '(' && b == ')') ||
                (a == '[' && b == ']') ||
                (a == '{' && b == '}');
    }
}
