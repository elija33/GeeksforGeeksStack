package StockSpanProblem;

import java.util.Arrays;

public class NaiveStockSpanProblem {

    public static void calculateSpan(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int span = 1;
            for (int j = i - 1; j >= 0 && number[j] <= number[i]; j--)
                span++;
            System.out.print(span + " ");
        }

    }

    // Driver program to test above functions
    public static void main(String[] args) {
        int number[] = new int[] { 18, 12, 13, 14, 11, 16 };
        calculateSpan(number);

    }
}
