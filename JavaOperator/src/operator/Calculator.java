package operator;

import java.util.Scanner;

/*
 * @ Date : 2015.07.08
 * @ Author : Jin
 * @ Story :  계산
 * */
public class Calculator {
	public static void main(String[] args) {
		/*
		 * order
		 * 스캐너로 두 값을 입력받아서
		 * 사칙연산 결과가 나오도록 하시오.
		 * 20 + 7 = 27
		 * 20 * 7 = 140
		 * */
		int a = 0, b = 0, sub =0, add=0, gob=0, mok=0, nmg=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("a의 값을 정하시오");
		a = scanner.nextInt();
		System.out.println("b의 값을 정하시요");
		b = scanner.nextInt();
		add=a+b;
		sub = a-b;
		gob=a*b;
		mok=a/b;
		nmg=a%b;
		System.out.println(a+" + "+b+" = "+add);
		System.out.println(a+" - "+b+" = "+sub);
		System.out.println(a+" * "+b+" = "+gob);
		System.out.println(a+" / "+b+" = "+mok);
		System.out.println(a+" % "+b+" = "+nmg);
		
		//연산에 쓸 재료들을 준비하는 선언부
		 //Scanner scanner = new Scanner (system.in); 
		 //int x =0, y=0; //지역변수는 디폴트값을 초기화
		 //연산부
		//System.out.println("x값 입력:");
		//x = scanner.nextInt(); next 커서다음 글자(숫자)를 변수 할당하라
		//System.out.println("y값 입력:");
		//y= scanner.nextInt();
		//출력영역
		//System.out.println(x+"+ "+y+ "=" +(x+y)); //변수로 들어갈 것을 치항한다.
		
		
		
		
	}

}
