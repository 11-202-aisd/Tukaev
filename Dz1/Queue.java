public class Queue <T>{
    private int capacity;
    private T[] array;
    private int front, rear, count;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public boolean isFull() {
        return (getCount() == capacity);
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public void insert(T item) {
        if (isFull()) {
            throw new RuntimeException("Переполнен");
        }

        rear = (rear + 1) % capacity;
        array[rear] = item;
        count++;
    }

    public T del() {
        if (isEmpty()) {
            throw new RuntimeException("Пуст");
        }
        T x = array[front];
        System.out.println(x);
        front = (front + 1) % capacity;
        count--;
        return x;

    }

}
