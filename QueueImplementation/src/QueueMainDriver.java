
public class QueueMainDriver<T> {
	
	public static void main(String[] args) {
		QueueADT<String> pagesToPrint = new LLQueue<String>();
		pagesToPrint.enqueue("Bob");
		pagesToPrint.enqueue("Simon");
		
		for(ListNode<String> s = pagesToPrint.getHead(); s != null; s = s.getNext())
			System.out.println(s.getData());	
		
		pagesToPrint.dequeue();
		for(ListNode<String> s = pagesToPrint.getHead(); s != null; s = s.getNext())
			System.out.println(s.getData());	
		
	}

}
