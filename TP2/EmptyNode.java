package stack;

public class EmptyNode<T> extends StackNode<T> {
	
	static public String stackEmptyErrorDescription = "Stack is empty";
	
	
	@Override
	public T data() {
		throw new Error(stackEmptyErrorDescription);
	}

	@Override
	public StackNode<T> next() {
		throw new Error(stackEmptyErrorDescription);
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public int getSize() {
		return 0;
	}

}
