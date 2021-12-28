import java.util.Scanner;

public class Quest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//양의 정수 역순으로 출력하기
		int input;
		int output;
		String len = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		input = sc.nextInt();
		
		while(input != 0) {
			output = input % 10;
			len += output;
			input = input / 10;
		}
		System.out.print(len);

	}

}
