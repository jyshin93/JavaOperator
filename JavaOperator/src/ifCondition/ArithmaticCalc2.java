package ifCondition;

import java.util.Scanner;

public class ArithmaticCalc2 {
	public void calc(){
		int first=0, second=0, result=0, remain=0;
		String opcode="";
		Scanner scanner = new Scanner(System.in);
		//연산부
		System.out.println("첫번째 수:");
		first = scanner.nextInt();
		System.out.println("연산기호:");
		opcode= scanner.next();
		System.out.println("두번째 수:");
		second= scanner.nextInt();
		
		if (opcode.equals("+")) {
			result = first + second;
		} else if (opcode.equals("-")) {
			result = first - second;
		} else if (opcode.equals("*")) {
			result = first * second;
		} else if (opcode.equals("/")) {
			result = first / second;
			remain = first % second;

		} else {
			System.out.println("입력된 값이 올바르지 않습니다.");
		}
		System.out.println("===심플계산기===");
		System.out.println(first+"\t"+opcode+"\t"+second+"\t"+"="+"\t"+result+"("+remain+")");
	}

}
