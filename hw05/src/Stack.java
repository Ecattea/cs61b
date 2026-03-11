public class Stack {
    private static class Node {
        private int item;
        private Node next;

        private Node(int i, Node j) {
            item = i;
            next = j;
        }
    }
    
    private final Node sentinel;
    private int sum;
    private int size;

    public Stack() {
        sentinel = new Node(0, null);
        sum = 0;
        size = 0;
    }

    public void push(int x) {
        sentinel.next = new Node(x, sentinel.next);
        sum += x;
        size += 1;
    }

    public int pop() {
        int m = sentinel.next.item;
        sum -= m;
        sentinel.next = sentinel.next.next;
        size -= 1;
        return m;
    }

    public int sum() {
        return sum;
    }

    public int size() {
        return size;
    }
}
