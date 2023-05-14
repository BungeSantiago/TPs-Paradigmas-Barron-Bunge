package stack;


public class OOStack {
	
	private PolymorphicStack<String> stack;
	static public String stackEmptyErrorDescription = "Stack is empty";
	
	public OOStack() {
		stack = new PolymorphicStack<String>();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public Object pop() {
		return stack.pop();
	}

	public Object top() {
		return stack.top();
	}

	public Integer size() {
		return stack.size();
	}

	public OOStack push(String something) {
		stack.push(something);
		return this;
	}
}