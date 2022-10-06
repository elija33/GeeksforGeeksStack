package StackWithMinIn0;

import java.util.Stack;

public class StackWithMin {
    Stack<Integer> name;
    Stack<Integer> names;

    public StackWithMin() {
        name = new Stack<>();
        names = new Stack<>();
    }

    public void push(int number) {
        if (name.isEmpty()) {
            name.add(number);
            names.add(number);
            return;
        }
        name.add(number);

        if (names.peek() == name.peek()) {
            names.add(number);
        }
    }

    public void pop() {
        if (names.peek() == name.peek()) {
            names.pop();
            name.pop();
        }
    }

    public int top() {
        return name.peek();
    }

    public int getMin() {
        return names.peek();
    }
}

class Test {
    public static void main(String[] args) {
        StackWithMin name = new StackWithMin();
        name.push(4);
        name.push(5);
        name.push(8);
        name.push(1);
        name.pop();

        System.out.println("Minimum Element from Stack: " + name.getMin());
    }
}