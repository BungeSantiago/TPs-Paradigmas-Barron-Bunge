package stack;

public class PolymorphicStack<T> {
    private StackNode<T> top;
    
    public PolymorphicStack() {
        top = new EmptyNode<>();
    }

    public void push(T item) {
        top = new NonEmptyNode<>(item, top);
    }

    public T pop() {
        T item = top.data(); //Cuando 'top' es un EmptyNode, hace el throw.
        top = top.next();
        return item;
    }

    public T top() {
        return top.data(); //Cuando 'top' es un EmptyNode, hace el throw.
    }

    public boolean isEmpty() {
        return top.isEmpty();
    }
    
    public int size() {
    	return top.getSize()+1;
    }
}