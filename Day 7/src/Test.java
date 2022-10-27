import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			String k = in.nextLine();
			list.add(k);
		}
		
	}
}
