package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : Jin
 * @ Story : 사칙연산 계산 프로그램
 **/
public class ArithmaticCalc {
	/*
	 오더
	  - 사칙연산 계산기
	  - 덧셈, 뺄셈, 곱셈, 나눗셈(몫: (), 나머지:())
	  - 사칙연산 기호도 입력 받습니다. +, *, -, /
	  - 출력결과
	  - ===심플 계산기===
	  - 5 X 5 = 25
	  - 5 + 5 = 10
	  - 6 ÷ 5 = 1 (1)
	  - 5 - 6 = - 1
	 * */ 
	
	public static void main(String[] args) {
		int a =0, b=0, sum=0, add=0, nmg=0;
		String opcode="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("초기값:");
		a = scanner.nextInt();
		System.out.println("사칙연산 기호:");
		opcode = scanner.next();
		System.out.println("연산할 값:");
		b = scanner.nextInt();
		
		if (opcode.equals("+")) {
			add = a+b;
			System.out.println("===심플 계산기===");
			System.out.println(a+opcode+b+"="+add );
		} else if (opcode.equals("-")) {
			add= a-b;
			System.out.println("===심플 계산기===");
			System.out.println(a+opcode+b+"="+add );
		} else if (opcode.equals("*")) {
			add = a*b;
			System.out.println("===심플 계산기===");
			System.out.println(a+opcode+b+"="+add );
		} else if (opcode.equals("/")) {
			add= a/b;
			nmg= a%b;
			System.out.println("===심플 계산기===");
			System.out.println(a+opcode+b+"="+add+(nmg) );
		} else {
			System.out.println("입력된 값이 올바르지 않습니다.");
		}
	
	}
	
}
