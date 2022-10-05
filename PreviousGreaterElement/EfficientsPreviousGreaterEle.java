package PreviousGreaterElement;

import java.util.Stack;

public class EfficientsPreviousGreaterEle {

    public static void previousGreater(int number[]) {
        Stack<Integer> numbers = new Stack<Integer>();
        numbers.push(number[0]);

        // Previous greater for
        // first element is always -1.
        System.out.print("-1, ");

        // Traverse remaining elements
        for (int i = 1; i < number.length; i++) {

            // Pop elements from stack
            // while stack is not empty
            // and top of stack is smaller
            // than number[i]. We always have
            // elements in decreasing order
            // in a stack.
            while (numbers.empty() == false && numbers.peek() < number[i])
                numbers.pop();

            // If stack becomes empty, then
            // no element is greater on left
            // side. Else top of stack is
            // previous greater.
            if (numbers.empty() == true)
                System.out.print("-1, ");
            else
                System.out.print(numbers.peek() + ", ");

            numbers.push(number[i]);
        }
    }

    public static void main(String[] args) {
        int number[] = { 10, 4, 2, 20, 40, 12, 30 };
        previousGreater(number);
    }
}
