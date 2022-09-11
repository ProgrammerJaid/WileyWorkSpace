
public class Date {
	private int dd;
	private int mm;
	private int yy;

	public Date() {
		this.dd=1;
		this.mm=1;
		this.yy=2016;
	}

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void displayDate() {
		boolean flag = this.checkDate();
		if(flag)
			System.out.println("The date is: "+dd+","+mm+","+yy);
		else 
			System.out.println("\n"+"Date data provided is incorrect.");
	}

	private boolean checkDate() {
		if(dd<0 || dd>31 || mm<0 || mm>12 || yy<0 || yy>2999)
			return false;
		return true;	
	}
}
