package LargestRectangularAreaHistogram1;

public class BestLargestRectangularArea {
    public static int getMaxArea(int number[]) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i - 1; j >= 0; j--) {
                if (number[j] >= number[i]) {
                    curr += number[i];
                } else
                    break;
            }
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] >= number[i]) {
                    curr += number[i];
                }
            }
            sum = Math.max(i, curr);
        }
        return sum;
    }

    public static void main(String[] args) {
        int number[] = new int[] { 6, 2, 5, 4, 1, 5, 6 };
        System.out.println("Maximum Area: " + getMaxArea(number));
    }
}
