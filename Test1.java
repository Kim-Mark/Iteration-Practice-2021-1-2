import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int grade;
		int numStudents = 0;
		int numPass = 0;
		int numFail = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first grade.(Enter the negative num if you want to finish it): ");
		grade = sc.nextInt();
		
		while(grade >= 0) {
			numStudents += 1;
			if(grade >= 60) {
				numPass += 1;
			}
			else {
				numFail += 1;
			}
			System.out.print("Enter the next grade.(Enter the negative num if you want to finish it): ");
			grade = sc.nextInt();
		}

		System.out.println("Number of students: " + numStudents);
		System.out.println("Number of student passed: " + numPass);
		System.out.println("Number of students failed: " + numFail);
	}

}
