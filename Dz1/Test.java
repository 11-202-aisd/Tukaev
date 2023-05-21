public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.insert(5);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);
        queue.insert(5);
        queue.del();
        queue.del();
        queue.del();
        queue.del();
        queue.del();
        queue.del();
        queue.del();
        queue.del();

    }
}
