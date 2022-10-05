package PreviousGreaterElement;

public class NaviePreviousGreaterEle {
    public static int GreaterElement(int number[]) {
        System.out.print("-1 ");
        for (int i = 1; i < number.length; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (number[i] < number[j]) {
                    System.out.print(number[j] + ", ");
                    break;
                }
            }
            if (j == -1)
                System.out.print("-1, ");
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 15, 10, 18, 12, 4, 6, 2, 8 };
        GreaterElement(number);

    }
}
