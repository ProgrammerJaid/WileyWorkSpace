public class Test {
	public static void main(String[] args) {
		
		Coffee arabica = Coffee.Arabica;
		arabica.amount();
		
		Circle c = new Circle(5.5);
		c.calculateArea();
		
		Fibonacci f = new Fibonacci(1,233);
		f.calculateFibonacci();
		
		Date d = new Date();
		d.displayDate();
	}
}
