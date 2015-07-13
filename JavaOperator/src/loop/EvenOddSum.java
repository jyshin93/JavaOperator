package loop;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : Jin
 * @ Story :  for-loop + if 결합예제
 */
public class EvenOddSum {
	/*
	 * 입력 받은 수(1)부터 입력받은 
	 * 수(10)까지의 수 중에서
	 * 가가 짝수의 합과 홀수의 합을
	 * 분리해서 출력하시오. 
	 * */
	
	public void calc() {
		int a=0, b=0,evenSum=0,oddSum=0, result=0;
		Scanner scanner = new Scanner(System.in);
		// 홀수 if(input%2 = 1)
		System.out.println("숫자 a를 입력하시오:");
		a = scanner.nextInt();
		System.out.println("숫자 b를 입력하시오:");
		b = scanner.nextInt();
		
		
		for (int i = a; i <=b; i++) {
			if ((i % 2) == 0) { // a 와 b는 입력된 순간 고정값이므로 상수 // i 인덱스값이므로 변수이다.
				evenSum += i;
			}else {
				oddSum += i;
			}
		}
		
		System.out.println(a+"부터"+b+"까지의 정수 중에서\n"
				+ "짝수의 합은"+evenSum+"이고\n"
				+ "홀수의 합은"+oddSum+"이다.");

		
	}
}
