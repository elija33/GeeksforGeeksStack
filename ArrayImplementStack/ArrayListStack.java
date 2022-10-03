package ArrayImplementStack;

import java.util.ArrayList;

public class ArrayListStack {
    ArrayList<Integer> number = new ArrayList<>();

    // Adding an Element to the stack Using ArrayList
    public void push(int num) {
        number.add(num);
    }

    // Removing an Element from the stack Using ArrayList
    public int pop() {
        int result = number.get(number.size() - 1);
        number.remove(number.size() - 1);
        return result;
    }

    // Look at the first Element in the stack
    public int peek() {
        return number.get(number.size() - 1);
    }

    // Check to see if the stack is empty or not
    public boolean isEmpty() {
        return number.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return number.size();
    }

    public static void main(String[] args) {

    }
}
