package BalancedParenthesis;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceParenthe {
    public boolean isBalanced(String chech){
        Deque<Character> checking = new ArrayDeque<>();
        for(int i = 0; i<chech.length(); i++){
            char words = chech.charAt(i);
            if(words == "(" || words == "{" || words == "["){
                checking.push(words);
            }
            else if(checking.isEmpty() == false){
                return false;
            }
            else if(matching(checking.peek(), checking) == false)
        }
    }

    private boolean matching(Character peek, Deque<Character> checking) {
        return false;
    }

    public static void main(String[] args) {

    }
}
