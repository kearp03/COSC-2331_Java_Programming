package chap9.series;

public interface Series {
	int getNext(); // returns next number in series
	void reset(); // restart
	int getPrev(); //returns previous number in series
	void setStart(int x); //set starting value
}

class ByTwos implements Series{
	int start;
	int val;
	int prev;
	
	ByTwos() {
		start = 0;
		reset();
	}
	
	public int getNext() {
		prev = val;
		val += 2;
		return val;
	}
	
	public void reset() {
		val = start;
		prev = -2;
	}
	
	public void setStart(int x) {
		start = x;
		val = x;
		prev = x-2;
	}
	
	public int getPrev() {
		return prev;
	}

	@Override
	public String toString() {
		return "ByTwos [start=" + start + ", val=" + val + ", prev=" + prev + "]";
	}
}

class ByThrees implements Series {
	int start;
	int val;
	int prev;
	
	ByThrees() {
		start = 0;
		reset();
	}
	
	public int getNext() {
		prev = val;
		val += 3;
		return val;
	}
	
	public void reset() {
		val = start;
		prev = -3;
	}
	
	public void setStart(int x) {
		start = x;
		val = x;
		prev = x-3;
	}
	
	public int getPrev() {
		return prev;
	}

	@Override
	public String toString() {
		return "ByThrees [start=" + start + ", val=" + val + ", prev=" + prev + "]";
	}
}

class SeriesDemo {
	public static void main(String[] args) {
		System.out.println("Multiples of 2 series");
		ByTwos ob = new ByTwos();
		System.out.println(ob);
		
		printSeries(ob, 5);
		
		System.out.println("\nResetting");
		ob.reset();
		printSeries(ob, 5);
			
		System.out.println("\nStarting at 100");
		ob.setStart(100);
		printSeries(ob, 5);
		
		System.out.println("\nMultiples of 3 series");
		ByThrees ob2 = new ByThrees();
		System.out.println(ob2);
		
		printSeries(ob2, 5);
		
		System.out.println("\nResetting");
		ob2.reset();
		printSeries(ob2, 5);
		
		System.out.println("\nStarting at 100");
		ob2.setStart(100);
		printSeries(ob2, 5);
	}
	
	public static void printSeries(Series obj, int n) {
		for(int i = 0; i < n; i++)
			System.out.println("Next value is " + obj.getNext() + " previous number: " + obj.getPrev());
	}
}