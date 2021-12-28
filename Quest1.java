import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		String m;
		int n;
		int i = 0;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter one sentence: ");
		m = sc.next();
		
		n = m.length();
		
		while(i < n) {
			i += 1;
			cnt += 1;
			
		}

		System.out.print("Nums of words: " + cnt);
	}

}
