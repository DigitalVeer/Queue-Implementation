import java.util.Iterator;
import java.util.NoSuchElementException;

public class QueueIterator<T> implements Iterator<T>{

	private ListNode<T> head;
	
	
	public QueueIterator(ListNode<T> head){
		this.head = head;
	}
	
	@Override
	public boolean hasNext() {
		return head != null;
	}

	@Override
	public T next() {
		T data = (hasNext() ? head.getData() : null);
		if (data != null)
			head = head.getNext();
		else throw new NoSuchElementException("Nothing next!");
		return data;
	}
	


	
}
