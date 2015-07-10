package condition;
/*
 * @ Date : 2015.07.10
 * @ Author : Jin
 * @ Story :  if-else 예제
 */
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		/*
		 문제 )학생 3명의 점수를 입력받아서 1등 출력 하여라 (0~100점) 	 
		 결과 ) 1등은 98점 입니다.
		 힌트 ) a 와 b 비교, b 와 c 를 비교, a와 c를 비교
		 */
		int a=0,b=0,c=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("a의 점수:");
		a = scanner.nextInt();
		System.out.println("b의 점수:");
		b = scanner.nextInt();
		System.out.println("c의 점수:");
		c = scanner.nextInt();
		/*
		 조건식을 따져서 결과를 가정하지 말고, 결과를
		 상정한 다음 거기에 맞는 조건식을 설정하세요.
		 * */
		if ((a > b) && (a>c)) {
			System.out.println("1등은"+a+"입니다.");
		}else if ((b>a) && (b>c)) {
			System.out.println("1등은"+b+"입니다.");
		}else if ((c>a) && (c>b)) {
			System.out.println("1등은"+c+"입니다.");
		}else {
			System.out.println("동점자 존재합니다.");
		}
		
	
		
	}
}
