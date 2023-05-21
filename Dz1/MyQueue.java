public class MyQueue<T> {

    private Stack<T> inbox;
    private Stack<T> outbox;

    public MyQueue(int capacity) {
        inbox = new Stack<>(capacity);
        outbox = new Stack<>(capacity);
    }

    public void enqueue(T data) {
        inbox.push(data);
    }

    public T dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        if (outbox.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return outbox.pop();
    }

    public T peek() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        if (outbox.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return outbox.peek();
    }

    public boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }

    public int size() {
        return inbox.getTop() + outbox.getTop();
    }
}
