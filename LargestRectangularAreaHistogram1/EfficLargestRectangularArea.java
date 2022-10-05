package LargestRectangularAreaHistogram1;

import java.util.Stack;

public class EfficLargestRectangularArea {
    public static int getMaxArea(int numbers[]) {
        Stack<Integer> number = new Stack<>();
        int sum = 0;
        int top;
        int curr;
        for (int i = 0; i < numbers.length; i++) {
            while (number.isEmpty() == false && numbers[number.peek()] > numbers[i]) {
                top = number.peek();
                number.pop();
                curr = numbers[top] * (number.isEmpty() ? i : i - number.peek() - 1);
                sum = Math.max(sum, curr);
            }
            number.add(i);
        }
        while (number.isEmpty() == false) {
            top = number.peek();
            number.pop();
            curr = numbers[top] * (number.isEmpty() ? numbers.length : numbers.length - number.peek() - 1);
            sum = Math.max(sum, curr);
        }
        return sum;
    }

    public static void main(String[] args) {
        int number[] = new int[] { 6, 2, 5, 4, 1, 5, 6 };
        System.out.println("Maximum Area: " + getMaxArea(number));
    }
}
