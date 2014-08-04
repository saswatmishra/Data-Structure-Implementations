package test;


/*
 * Queue implementation using Linked List.
 */

public class LLQueue {
	private LLNode frontNode;
	private LLNode rearNode;

	public LLQueue() {
		this.frontNode = frontNode;
		this.rearNode = rearNode;
	}

	public static LLQueue createQueue() {
		return new LLQueue();
	}

	public boolean isEmpty() {
		if (frontNode == null)
			return true;
		else
			return false;
	}

	public void enQueue(Object data) {
		LLNode newNode = new LLNode(data);
		if (rearNode != null) {
			rearNode.setNext(newNode);
		}
		rearNode = newNode;
		if (frontNode == null) {
			frontNode = rearNode;
		}
	}

	public Object deQueue() {
		Object data = null;
		if (isEmpty()) {
			System.out.println("Is empty");
		} else {
			data = frontNode.getData();
			frontNode = frontNode.getNext();
		}

		return data;
	}

	public static void main(String args[]) {
		LLQueue queue = new LLQueue();
		queue.enQueue("Hello");
		queue.enQueue("World");
		queue.enQueue("!");
		queue.enQueue(2014);

		System.out.println(queue.isEmpty());
		System.out.println(queue.deQueue());

	}

}
