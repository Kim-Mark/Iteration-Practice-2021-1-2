import java.util.Scanner;

public class Quest5 {

	public static void main(String[] args) {
		
		String str;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		str = sc.next();
		
		int len = str.length();
		int ca = 0;
		int ce = 0;
		int ci = 0;
		int co = 0;
		int cu = 0;
		int j = 0;
		
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) == 'a') {
				ca += 1;
			}
			else if(str.charAt(i) == 'e') {
				ce += 1;
			}
			else if(str.charAt(i) == 'i') {
				ci += 1;
			}
			else if(str.charAt(i) == 'o') {
				co += 1;
			}
			else if(str.charAt(i) == 'u') {
				cu += 1;
			}
			else {
				j += 1;
			}
		}
		
		System.out.println("a: " + ca);
		System.out.println("e: " + ce);
		System.out.println("i: " + ci);
		System.out.println("o: " + co);
		System.out.println("u: " + cu);
		System.out.println("consonants: " + j);
		
	}

}
