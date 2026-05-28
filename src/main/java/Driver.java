public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		printCounter(counter);
		
		counter.increment();
		
		printCounter(counter);
		
		counter.decrement();
		
		printCounter(counter);
		
	}

	public static void printCounter(Counter counter) {
		System.out.println("Hasil Count:" + counter.getCount());
	}

}
