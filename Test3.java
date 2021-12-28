import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		String coursename;
		int attendscore;
		int taskscore;
		int testscore;
		int midtermscore;
		int finaltermscore;
		double scoreavg;
		String gpa;
		String flag = "y";
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the coursename: ");
			coursename = sc.next();
			
			System.out.print("Enter the attend score: ");
			attendscore = sc.nextInt();
			
			System.out.print("Enter the task score: ");
			taskscore = sc.nextInt();
			
			System.out.print("Enter the small test score: ");
			testscore = sc.nextInt();
			
			System.out.print("Enter the midterm score: ");
			midtermscore = sc.nextInt();
			
			System.out.print("Enter the finalterm score: ");
			finaltermscore = sc.nextInt();
			
			scoreavg = (attendscore + taskscore + testscore + midtermscore + finaltermscore) / 5;
			
			System.out.println("Course:" + coursename + " Total score: " + scoreavg);
			
			if(scoreavg >= 90) {
				gpa = "A";
			}
			else if(scoreavg >= 80 && scoreavg < 89) {
				gpa = "B";
			}
			else if(scoreavg >= 70 && scoreavg < 79) {
				gpa = "C";
			}
			else if(scoreavg >= 60 && scoreavg < 69) {
				gpa = "D";
			}
			else {
				gpa = "F";
			}
			
			System.out.println("Course:" + coursename + "GPA: " + gpa);
			System.out.print("Continue(Y,N): ");
			flag = sc.next();
		}while(flag.equals("y"));

	}

}
