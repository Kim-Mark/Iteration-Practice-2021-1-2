import java.util.Scanner;

public class Quest7 {

	public static void main(String[] args) {

		String name;
		int cost;
		int sum = 0;
		
		
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		name = sc.next();
		
		System.out.print("Fairs: ");
		cost = sc.nextInt();
		
		sum += cost;
		if(name.equals("¿öµå")) {
			break;
		}
		}
		
		System.out.print("Total income " + sum + "won");
		

	}


}
