
public class Fibonacci {

	private int lowR;
	private int highR;

	public Fibonacci() {
		this.lowR=0;
		this.highR=100;
	}

	public Fibonacci(int f, int s) {
		if (f < s) {
			this.lowR = f;
			this.highR = s;
		} else {
			this.lowR = s;
			this.highR = f;
		}
	}

	public void calculateFibonacci() {
		int prev = 0;
		int current = 1;
		System.out.println();
		System.out.print("The fibonacci series is : ");
		if(lowR==0)		System.out.print(prev+" ");
		while (current <= highR) {
			if (lowR <= current)
				break;
			int newV = prev + current;
			prev = current;
			current = newV;
		}

		while (current <= highR) {
			System.out.print(current+" ");
			int newV = prev + current;
			prev = current;
			current = newV;
		}
		
		System.out.println("\n");
	}

}
