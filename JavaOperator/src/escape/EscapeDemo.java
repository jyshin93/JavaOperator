package escape;

import java.util.Scanner;

/*
 * @ Date : 2015.07.07
 * @ Author : Jin
 * @ Story :  문법
 * */
public class EscapeDemo {
	public static void main(String[] args) {
		/*
		 * 문제, 홍길동씨는 30세이고
		 * 김유신씨는 25세입니다.
		 * 홍길동씨와 김유신씨의 나이차이를
		 * 출력하는데...
		 * "홍길동씨는 김유신씨보다 5세가 많습니다."
		 * */
		//지역변수 선언부 
		int hongAge =0, kimAge=0,age=0; // 나이 디폴트
		String hong = "", kim=""; // 리터럴 디폴트 값
		Scanner scanner = new Scanner(System.in);
		
		// 연산부 
		System.out.println("이름을 입력하세요");
		hong = scanner.next();
		System.out.println("이름을 입력하세요");
		kim = scanner.next();
		System.out.println("홍길동씨 나이를 입력하세요");
		hongAge = scanner.nextInt();
		System.out.println("김유신씨 나이를 입력하세요");
		kimAge = scanner.nextInt();
		age = hongAge - kimAge;
		System.out.println(hong+"씨는\t"+kim+"씨보다\t"+age+"세가\n많습니다.");
		
		/*
		 escape 문자 (\t, \n) 처럼 알파벳에 \를 첨부하여
		 특수한 기능을 나타내도록 한 문법
		 많이 있지만 \t, \n 만 아셔도 무방합니다.
		 * */
	}

	
}
