package StackCollections;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
