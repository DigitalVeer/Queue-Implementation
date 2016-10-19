
public class QueueMainDriver<T> {
	
	public static void main(String[] args) {
		QueueADT<String> pagesToPrint = new LLQueue<String>();
		pagesToPrint.enqueue("Bob");
		pagesToPrint.enqueue("Simon");
		System.out.println(pagesToPrint);
		System.out.println("----------------");
		pagesToPrint.dequeue();
		System.out.println(pagesToPrint);
		System.out.println("----------------");
		String[] names = new String[]{"Jacob", "Veer", "Meg", "Justin", "Chelsea", "Frankie"};
		for (String s: names){ pagesToPrint.enqueue(s); }
		System.out.println(pagesToPrint);
		
		
		//Palindrome Checking
		QueueADT<Character> characters = new LLQueue<Character>();
		String strToCheck = "level";
		for(int i = 0; i < strToCheck.length(); i++)
			characters.enqueue(strToCheck.charAt(i));
		
		
	}

}
