package exception;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = null, s2 = null;
		
		//next();와 nextLine();의 차이점 알아보기
		//next();는 값을 aaa bbb를 입력하면 aaa bbb가 출력되고 두번째 입력을 할수없음
		//	-구분자가 스페이스바, 엔터 둘다됨
		//nextLine();은 값을 aaa bbb를 입력하면 aaa bbb가 출력되고 두번째 입력을 할수있다.
		// 	-구분자는 엔터만 사용
		
		System.out.println("1.입력");
		s1 = input.nextLine();		
		System.out.println("2.입력");
		s2 = input.next();
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		/*
		System.out.println("1.입력");
		s1 = input.next();
		System.out.println("2.입력");
		s2 = input.next();
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		*/
	}
}
