public class Stack<T> {
    private int size;
    private T[] array;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.array =(T[]) new Object[size];
        this.top = -1;
    }

    public int getTop() {
        return top;
    }

    public void push(T elem){
        if(isFull()){
            throw new RuntimeException("stack is full");
        }
        top++;
        array[top] = elem;
    }

    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        int p = top;
        return array[p--];
    }

    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return array[top--];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public T readTop(){
        return array[top];
    }
    public boolean isFull(){
        return (top == size -1);
    }


}
