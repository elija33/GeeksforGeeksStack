package NextGreaterElement;

import java.util.Stack;

import javax.lang.model.element.Element;

public class EfficientsNextGreaterElement {
    int top;
    int number[] = new int[100];

    public void push(int num) {
        if (top == 99) {
            System.out.println("Stack is full");
        } else {
            number[++top] = num;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Underflow Error");
            return -1;
        } else {
            int element = number[top];
            top--;
            return element;
        }
    }

    public boolean isEmpty() {
        return (top == -1) ? true : false;
    }

    public static void printNGE(int number[]) {
        int i = 0;
        EfficientsNextGreaterElement name = new EfficientsNextGreaterElement();
        name.top = -1;
        int element, next;

        name.push(number[0]);

        for (i = 1; i < number.length; i++) {
            next = number[i];

            if (name.isEmpty() == false) {
                element = name.pop();
                while (element < next) {
                    System.out.println(element + " --> " + next);
                    if (name.isEmpty() == true) {
                        break;
                    }
                    element = name.pop();
                }
                if (element > next) {
                    name.push(element);
                }
                name.push(next);
            }
            while (name.isEmpty() == false) {
                element = name.pop();
                next = -1;
                System.out.println(element + " -- " + next);
            }
        }
    }

    public static void main(String[] args) {
        int number[] = { 11, 13, 21, 3 };
        printNGE(number);
    }
}
