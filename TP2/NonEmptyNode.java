package stack;

public class NonEmptyNode<T> extends StackNode<T>{
	private final StackNode<T> next; 
	private final T data;
	
	public NonEmptyNode(T data, StackNode<T> next) {
        this.data = data;
        this.next = next;
    }
	
	@Override
	public T data() {
		return data;
	}

	@Override
	public StackNode<T> next() {
		return next;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int getSize() {
		return next.getSize();
	}

}
