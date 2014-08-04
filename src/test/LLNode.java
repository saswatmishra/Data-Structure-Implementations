package test;

public class LLNode {
	private Object data;
	private LLNode next;
	
	public LLNode(Object data2)
	{
		this.data = data2;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data2) {
		this.data = data2;
	}

	public LLNode getNext() {
		return next;
	}

	public void setNext(LLNode next) {
		this.next = next;
	}
	
	

}
