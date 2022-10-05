package NextGreaterElement;

public class NavieNextGreaterEle {
    public static int NextGreaterElement(int number[]) {
        int i, next;
        int j;
        for (i = 0; i < number.length; i++) {
            next = -1;
            for (j = i + 1; j < number.length; j++) {
                if (number[i] < number[j]) {
                    next = number[j];
                    break;
                }
            }
            System.out.println(number[i] + " -- " + next);
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 11, 13, 21, 3 };
        NextGreaterElement(numbers);
    }
}
