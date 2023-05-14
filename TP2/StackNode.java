package stack;

public abstract class StackNode<T> {
	protected abstract T data();
	protected abstract StackNode<T> next();
    protected abstract boolean isEmpty();
    protected abstract int getSize();
}