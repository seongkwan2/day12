package exception;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		//강제 예외

		Scanner input = new Scanner(System.in);
		int age = 0;	//0으로 초기화 안하면 맨아래에서 오류발생
		System.out.println("나이 입력");
		try {
			age = input.nextInt();
			if(age < 1) {
				throw new Exception("잘 못 입 력");	//강제 예외 처리법
			}
			System.out.println(age);	//제대로 입력했을 경우 출력됨
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("다음 문장들 실행");	
	}
}
