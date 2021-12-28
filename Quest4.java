import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
		int cost; 
		int repay; 
		int repayhunid = 0; 
		int repayten = 0; 
		int repayone = 0; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the buying price [0-500]: ");
		cost = sc.nextInt();
		
		repay = 500 - cost;
		
		System.out.println(repay + " is the repay value");
		
		while(repay > 0) {
			if(repay >= 100) {
				repayhunid = repay / 100;
				repay = repay % 100;
			}
			else if(repay >= 10 && repay < 100) {
				repayten = repay / 10;
				repay = repay % 10;
			}
			else if(repay >= 1 && repay < 10){
				repayone = repay / 1;
				repay = repay % 1;
			}
		}
		
		System.out.println("100won coins\t\t" + repayhunid);
		System.out.println("10won coins\t\t" + repayten);
		System.out.println("1won coins\t\t" + repayone); 
		

	}

}
