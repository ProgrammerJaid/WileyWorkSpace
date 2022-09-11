
public enum Coffee {
	Blackbeans(5),Arabica(8),Robusta(6);

	private int beans;
	Coffee(int n) {
		beans = n;
	}
	
	public void amount() {
		System.out.println("Your Coffee is being prepared...");
		System.out.println("Your amount is : "+(beans*5)+"\n");
	}
}
