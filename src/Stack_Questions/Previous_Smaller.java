package Stack_Questions;

import java.util.Arrays;
import java.util.Stack;

//contains four sub-questions
public class Previous_Smaller {
    public static void main(String[] args) {
        int[] arr = {4, 10, 5, 8, 20, 15, 3, 12};
        previousSmaller(arr);
        System.out.println();
        previousGreater(arr);
        System.out.println();
        int[] arr2 = {3, 10, 5, 1, 15, 10, 7, 6};
        System.out.println(Arrays.toString(nextGreater(arr2)));
        System.out.println(Arrays.toString(nextSmaller(arr2)));
    }

    //Q1. code for previous smaller element in an array
    static void previousSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) System.out.print("-1 ");
            else System.out.print(stack.peek() + " ");
            stack.push(arr[i]);
        }
    }

    //Q2. code for previous greater element in an array
    static void previousGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) System.out.print("-1 ");
            else System.out.print(stack.peek() + " ");
            stack.push(arr[i]);
        }
    }

    //Q3. code for next smaller element in an array
    static int[] nextSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] temp = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) temp[i] = -1;
            else temp[i] = stack.peek();
            stack.push(arr[i]);
        }
        return temp;
    }

    //Q4. code for next greater element in an array
    static int[] nextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] temp = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) temp[i] = -1;
            else temp[i] = stack.peek();
            stack.push(arr[i]);
        }
        return temp;
    }
}
