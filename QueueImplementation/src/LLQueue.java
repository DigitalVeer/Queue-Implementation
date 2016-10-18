import java.util.Iterator;


public class LLQueue<T> implements QueueADT<T>, Iterable<T>{
	
	
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
		numItems++;
	}
	
	@Override
	public T dequeue() throws EmptyQueueException {
		if (qFront == null) throw new EmptyQueueException("Attempt to dequeue from an Empty Queue!");
		T data = qFront.getData();
		ListNode<T> newHead = qFront.getNext();
		qFront.setNext(null);
		qFront = newHead;
		numItems--;
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
		numItems++;
	}
	
	public ListNode<T> getHead(){
		return this.qFront;
	}
	
	public ListNode<T> getTail(){
		return this.qRear;
	}
	
	public String toString(){
		String str = "";
		Iterator<T> i = this.iterator();
		int counter = 0;
		while(i.hasNext()){
			T data = i.next();
			str += String.format("%s (%s) [ %s ]\n",
					counter == 0 ? " < HEAD > "	: counter == numItems - 1 ? " < TAIL > " : "",		
					counter++, data.toString());
		}
		return str;
	}
	
	public Iterator<T> iterator() {
        return new QueueIterator<T>(qFront);
	}

}
