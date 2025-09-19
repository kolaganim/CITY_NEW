package basics;

public class CietStack {
    int[] a;
    int top, n;

    // Constructor
    CietStack(int n) {
        a = new int[n];
        top = -1; // stack is empty initially
        this.n = n;
    }

    // Push -> O(1)
    public boolean push(int x) {
        if (top == n - 1) {
            System.out.println("Stack Overflow!");
            return false;
        }
        a[++top] = x;
        return true;
    }

    // Pop -> O(1)
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return a[top--];
    }

    // Peek -> O(1)
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return a[top];
    }

    // isEmpty -> O(1)
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull -> O(1)
    public boolean isFull() {
        return top == n - 1;
    }

    // Test
    public static void main(String[] args) {
        CietStack st = new CietStack(5);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Peek: " + st.peek()); // O(1)
        System.out.println("Pop: " + st.pop());   // O(1)
        System.out.println("Is Empty? " + st.isEmpty()); // O(1)
    }
}
