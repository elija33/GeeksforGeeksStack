package LinkedListImplementStack;

import java.net.PortUnreachableException;
import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class MyStack {
    Node head;
    int size;

    MyStack() {
        head = null;
        size = 0;
    }

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        Node temp = head;
        head = head.next;
        size--;
        return res;
    }

    int peek() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return head == null;
    }
}

class GFG {

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}