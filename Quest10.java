import java.util.Scanner;

public class Quest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int getvoted1;
		int getvoted2; 
		
		int totalvoted; 
		
		int totalget1 = 0; 
		int totalget2 = 0;
		
		double onepercent;
		double twopercent; 
		
		String user;
		Scanner sc = new Scanner(System.in);
		System.out.print("More cities to report?(Yes, No): ");
		user = sc.next();
		
		do{
			
			System.out.print("Enter the nums of the frist: ");
			getvoted1 = sc.nextInt();
			totalget1 += getvoted1;
			
			System.out.print("Enter the nums of the second: ");
			getvoted2 = sc.nextInt();
			totalget2 += getvoted2;
			
			totalvoted = totalget1 + totalget2;
			
			System.out.print("More cities to report?(Yes, No): ");
			user = sc.next();
			
		} while(user.equals("Yes"));
		
		onepercent = (double)totalget1 / totalvoted * 100;
		twopercent = (double)totalget2 / totalvoted * 100;
		
		System.out.println("total of the first " + totalget1 + " and the selected percent is " + onepercent + "%.");
		System.out.println("total of the second " + totalget2 + " and the selected percent is " + twopercent + "%.");
		
		if(totalget1 > totalget2) {
			System.out.print("\nFirst selecetd.");
		}
		
		else if(totalget1 < totalget2) {
			System.out.print("\nSecond selecetd.");
		}
		
	}

}
