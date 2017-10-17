package problem5;

public class Counter {
	int count;

	Counter() {

	}

	Counter(int start) {
		count = start;
	}

	public void resetCount() {
		count = 0;
	}

	public void increment() {
		count++;
	}

	public void displayCount() {
		System.out.println(count);
	}

	public void setEqual(Counter count2) {
		count = count2.count;
	}

}
