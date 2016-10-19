
public interface QueueADT<T> {
	
	
	/**
	 * Checks to determine if the Queue is empty
	 * @return true if the queue has no elements, false otherwise
	 */
	boolean isEmpty();
	
	

	/**
	 *adds a given element to the rear of the queue
	 * @param obj element to be added to rear of queue
	 */
	void enqueue(T obj);
	
	/**
	 *adds a given element to the rear of the queue
	 * @param obj element to be added to rear of queue
	 */
	void enqueue(ListNode<T> obj);
	
	/**
	 * 
	 * remove and returns the item from the front of the queue
	 * @return removed item from front of queue
	 * @throws EmptyQueueException if queue is empty
	 */
	T dequeue() throws EmptyQueueException;
	
	/**
	 * returns the head node
	 * @return head node
	 */
	ListNode<T> getHead();
	
	/**
	 * returns the tail node
	 * @return tail node
	 */
	ListNode<T> getTail();
	
	/**
	 * returns the number of nodes in queue
	 * @return number of nodes in queue
	 */
	int getSize();

	
	
}
