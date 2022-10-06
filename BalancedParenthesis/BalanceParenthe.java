package BalancedParenthesis;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceParenthe {
    public static boolean matching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
    }

    public static boolean isBalanced(String name) {
        Deque<Character> checking = new ArrayDeque<>();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == '(' || name.charAt(i) == '[' || name.charAt(i) == '{') {
                checking.add(name.charAt(i));
            } else if (checking.isEmpty() == false) {
                return false;
            } else if (matching(checking.peek(), name.charAt(i)) == false) {
                return false;
            } else {
                checking.pop();
            }
        }
        return (name.isEmpty() == true);
    }

    public static void main(String[] args) {
        String name = "{()}[]";
        if (isBalanced(name)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
