import java.util.Scanner;

public class Quest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���� �������� ����ϱ�
		int input;
		int output;
		String len = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���: ");
		input = sc.nextInt();
		
		while(input != 0) {
			output = input % 10;
			len += output;
			input = input / 10;
		}
		System.out.print(len);

	}

}
