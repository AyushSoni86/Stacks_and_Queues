package Stack_Implementation;

public class Two_Stacks {
    // question from code studio -
    // https://www.codingninjas.com/codestudio/problems/two-stacks_983634?leftPanelTab=1
    // create two stacks using single array
    int[] data;
    int size;
    int top1;
    int top2;

    // Initialize TwoStack.
    public Two_Stacks(int s) {
        this.size = s;
        this.data = new int[s];
        top1 = -1;
        top2 = s;
    }

    // push from front of the array in stack 1
    public void push1(int item) {
        if (top2 - top1 > 1) {
            data[top1++] = item;
        } else {
            System.out.println("stack is full!!");
        }
    }

    // push from backside of the array in stack 2
    public void push2(int item) {
        if (top2 - top1 > 1) {
            data[top2--] = item;
        } else {
            System.out.println("stack is full!!");
        }
    }

    // pop from front of the array from stack 1
    public int pop1() {
        if (top1 > -1) return data[top1--];
        else return -1;
    }

    // pop from backside of the array from stack 2
    public int pop2() {
        if (top2 < size) return data[top2++];
        else return -1;
    }
}
