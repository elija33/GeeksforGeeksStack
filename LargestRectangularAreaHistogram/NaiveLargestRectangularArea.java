package LargestRectangularAreaHistogram;

public class NaiveLargestRectangularArea {
    public static int getMaxArea(int number[]) {
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i - 1; j >= 0; j--) {
                if (number[j] >= number[i]) {
                    curr += number[i];
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] >= number[i]) {
                    curr += number[i];
                } else {
                    break;
                }
            }
            total = Math.max(total, curr);
        }
        return total;
    }

    public static void main(String[] args) {
        int number[] = new int[] { 6, 2, 5, 4, 1, 5, 6 };
        System.out.println("Maximum Area: " + getMaxArea(number));
    }
}
