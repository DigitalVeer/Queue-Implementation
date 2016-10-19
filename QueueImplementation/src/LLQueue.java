import java.util.Iterator;


public class LLQueue<T> implements QueueADT<T>, Iterable<T>{
	
	
	private ListNode<T> qFront;
	private ListNode<T> qRear;
	private int numItems;
	
	public LLQueue() {
		qFront = null;
		qRear = null;
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
	
	public int getSize() { 
		return numItems;
	}
	
	@Override
	public void enqueue(T obj) {
		ListNode<T> newNode = new ListNode<T>(obj);
		if (qRear == null)
			qFront = newNode;
		else 
			qRear.setNext(newNode);
		
		qRear = newNode;
		numItems++;
	}
	
	@Override
	public T dequeue() throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException("Attempt to dequeue from an Empty Queue!");
		else {
			T data = qFront.getData();
			qFront = qFront.getNext();
			if (qFront == null) qRear = null;
			numItems--;
			return data;
		}
	}
	
	@Override
	public void enqueue(ListNode<T> obj){
		if (qRear == null)
			qFront = obj;
		 else 
			qRear.setNext(obj);
		qRear = obj;
		numItems++;
	}
	
	public ListNode<T> getHead(){
		return this.qFront;
	}
	
	public ListNode<T> getTail(){
		return this.qRear;
	}
	
	public String toString(){
		String str; int counter; Iterator<T> i;
		str = ""; counter = 0; i = this.iterator();
		while(i.hasNext())
			str += String.format("%s (%s) [ %s ]\n",
					counter == 0 ? " < HEAD > "	: counter == numItems - 1 ? " < TAIL > " : "",		
					counter++, i.next().toString());
		return str;
	}
	
	public Iterator<T> iterator() {
        return new QueueIterator<T>(qFront);
	}

}
