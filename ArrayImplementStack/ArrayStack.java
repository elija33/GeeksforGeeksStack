package ArrayImplementStack;

public class ArrayStack {
    int number[];
    int top;
    int cap;

    public ArrayStack(int c) {
        top = -1;
        cap = c;
        number = new int[cap];
    }

    public void push(int numbers) {
        top++;
        number[top] = numbers;
    }

    public int pop() {
        int res = number[top];
        top--;
        return res;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        ArrayStack num = new ArrayStack(5);
        num.push(10);
        num.push(20);
        num.push(30);
        num.push(40);
        // num.push(40);
        System.out.println(num.pop());
        System.out.println(num.size());
        System.out.println(num);
    }
}
