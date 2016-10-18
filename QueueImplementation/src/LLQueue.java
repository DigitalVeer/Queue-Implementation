
public class LLQueue<T> implements QueueADT<T> {
	
	
	private ListNode<T> qFront;
	private ListNode<T> qRear;
	private int numItems;
	
	public LLQueue() {
	}
	
	public LLQueue(ListNode<T> head){
		this.qFront = head;
		this.qRear = head;
	}
	
	public LLQueue(T elem){
		this.qFront = new ListNode<T>(elem);
		this.qRear = this.qFront;
	}
	
	public LLQueue(ListNode<T> head, ListNode<T> rear){
		this(head);
		this.qRear = rear;
	}

	@Override
	public boolean isEmpty() {
		return numItems == 0;
	}

	@Override
	public void enqueue(T obj) {
		if (qRear == null){
			qFront = new ListNode<T>(obj);
			qRear = qFront;
		} else {
			qRear.setNext(new ListNode<T>(obj));
			qRear = qRear.getNext(); 
		}
	}
	
	@Override
	public T dequeue() throws EmptyQueueException {
		if (qFront == null) throw new EmptyQueueException("Attempt to dequeue from an Empty Queue!");
		T data = qFront.getData();
		ListNode<T> newHead = qFront.getNext();
		qFront.setNext(null);
		qFront = newHead;
		return data;
	}
	
	@Override
	public void enqueue(ListNode<T> obj){
		if (qRear == null){
			qFront = obj;
			qRear = obj;
		} else {
			qRear.setNext(obj);
			qRear = obj;
		}
	}
	
	public ListNode<T> getHead(){
		return this.qFront;
	}
	
	public ListNode<T> getTail(){
		return this.qRear;
	}


}
