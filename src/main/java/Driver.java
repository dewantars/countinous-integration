public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		printHasilCount(counter);
		
		counter.increment();
		
		printHasilCount(counter);
		
		counter.decrement();
		
		printHasilCount(counter);

	}

	public static void printHasilCount(Counter counter) {
		System.out.println("Hasil Count:" + counter.getCount());
	}

}
