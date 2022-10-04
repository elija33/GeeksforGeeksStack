package TwoStackArray;

public class TwoStack {
    int number[];
    int cap;
    int top1;
    int top2;

    public TwoStack(int numbers) {
        cap = numbers;
        top1 = -1;
        top2 = numbers;
        number = new int[numbers];
    }

    public boolean push1(int sum) {
        if (top1 < top2 - 1) {
            top1++;
            number[top1] = sum;
            return true;
        }
        return false;
    }

    public boolean push2(int sum) {
        if (top1 < top2 - 1) {
            top2--;
            return true;
        }
        return false;
    }

    public Integer pop1() {
        if (top1 >= 0) {
            int toatal = number[top1];
            top1--;
            return toatal;
        }
        return null;
    }

    public Integer pop2() {
        if (top2 < cap) {
            int toatal = number[top2];
            top2++;
            return toatal;
        }
        return null;
    }

    public int size1() {
        return (top1 + 1);
    }

    public int size() {
        return (cap - top2);
    }
}
