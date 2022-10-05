package StockSpanProblem;

import java.util.Stack;

public class EfficientStockSpanProb {
    public static void printSpan(int number[]) {
        Stack<Integer> name = new Stack<>();
        name.add(0);
        System.out.print(1 + " ");
        for (int i = 1; i < number.length; i++) {
            while (name.isEmpty() == false && number[name.peek()] <= number[i]) {
                name.pop();
            }
            int span = name.isEmpty() ? i + 1 : i - name.peek();
            System.out.print(span + " ");
            name.push(i);
        }
    }

    public static void main(String[] args) {
        int number[] = new int[] { 18, 12, 13, 14, 11, 16 };
        printSpan(number);
    }
}
