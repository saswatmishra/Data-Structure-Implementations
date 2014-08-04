package test;

import java.util.EmptyStackException;

/*
 * Stack implementation using Linked List.
 */
public class LLStack {
	private LLNode headnode;

	public LLStack() {
		this.headnode = headnode;
	}

	public void push(Object data) {
		if (headnode == null) {
			headnode = new LLNode(data);
		} else if (headnode.getData() == null) {
			headnode.setData(data);
		} else {
			LLNode newNode = new LLNode(data);
			newNode.setNext(headnode);
			headnode = newNode;
		}
	}

	public Object top() {
		if (headnode == null)
			return 0;
		else
			return headnode.getData();
	}

	public Object pop() {
		if (headnode == null) {
			throw new EmptyStackException();
		} else {
			Object data = headnode.getData();
			headnode = headnode.getNext();
			return data;
		}
	}

	public boolean isEmpty() {
		if (headnode == null)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		LLStack stack = new LLStack();
		stack.push(10);
		stack.push(11);
		stack.push(14);
		stack.push(15);
		stack.push("Hello");
		System.out.println(stack.top());
		//System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}

}
