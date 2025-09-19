package basics;

import java.util.ArrayList;

public class CietArrayList {
    ArrayList<Integer> list;

    // Constructor
    CietArrayList() {
        list = new ArrayList<>();
    }

    // Push -> O(1) amortized
    public void push(int x) {
        list.add(x);
    }

    // Pop -> O(1)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return list.remove(list.size() - 1);
    }

    // Peek -> O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return list.get(list.size() - 1);
    }

    // isEmpty -> O(1)
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Size -> O(1)
    public int size() {
        return list.size();
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Test
    public static void main(String[] args) {
        CietArrayList st = new CietArrayList();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display(); // Stack elements: 10 20 30

        System.out.println("Peek: " + st.peek());   // 30
        System.out.println("Pop: " + st.pop());     // 30
        st.display(); // Stack elements: 10 20
        System.out.println("Size: " + st.size());   // 2
    }
}
