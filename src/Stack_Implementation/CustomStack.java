package Stack_Implementation;

public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int top = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return top == data.length - 1;  // ptr is at last index
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Cannot push Stack is full !!");
        }
        top++;
        data[top] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Connot pop from an empty stack!!");
        }
        return data[top--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[top];
    }

}
