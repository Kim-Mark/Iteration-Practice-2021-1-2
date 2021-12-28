import java.util.Scanner;

public class Quest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstinput; 
		double yearincome; 
		double returnoutput;
		int year = 0; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Root money: ");
		firstinput = sc.nextInt(); // 1000
		
		System.out.print("Benefits: ");
		yearincome = sc.nextDouble(); // 5
		
		System.out.println("Year \t Returnedcash");
		returnoutput = (double)firstinput;
		
		while(returnoutput < (double)(2 * firstinput)){
			year += 1;
			returnoutput += (returnoutput * (yearincome/100));
			System.out.println(year + "\t" + returnoutput);
			
		}
		
		System.out.print("\nNeeded years = " + year);
				
	}

}
