package exception;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			try {
				System.out.println("수 입력");
				num = input.nextInt();
				System.out.println(num);
			}catch(Exception e) {
				input.nextLine();	//nextLine은 모든값을 빼내어 온다고 생각
				System.out.println("문제 발생");
			}
		}
	}
}
