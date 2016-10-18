
public class ListNode<T> {

	private T data;
	private ListNode<T> next;
	
	public ListNode(){
		this(null, null);
	}
	
	public ListNode(T data) {
		this.data = data;
	}
	
	public ListNode(T data, ListNode<T> next){
		this(data);
		this.next = next;
	}
	
	public ListNode<T> getNext(){
		return this.next;
	}
	
	public T getData(){
		return this.data;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public void setNext(ListNode<T> newNode){
		this.next = newNode;
	}
	
	
}
