import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		String City;
		int Fdegrees;
		double Cdegrees;
	
		String flag = "y";
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter the name of the city you will visit: ");
			City = sc.next();
			
			System.out.print("Enter the F.degrees: ");
			Fdegrees = sc.nextInt();
			Cdegrees = (Fdegrees - 32) * 5 / 9;
			System.out.println("Enter the C.degrees: " + Cdegrees);
			
			System.out.print("Continue(y,n): ");
			flag = sc.next();
		}while(flag.equals("y"));
		

	}

}
