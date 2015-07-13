package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : Jin
 * @ Story : 배열에관한 예제 문법
 * */
public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0, avg= 0;
		System.out.println("3개의 점수를 입력하세요:");
		int[] arr = new int[3]; //3개 숫자 저장 공간
		//배열에 값을 입력하라고 하면 무조건 for CRTL + SPACE
		for (int i = 0; i < arr.length; i++) {
			arr [i] = scanner.nextInt();
			sum += arr[i];
		}
		//입력한 값을 합산 보세요
		for (int i = 0; i < arr.length; i++) {
		//	System.out.print(arr[i]+"\t");   =>출력공식
			// 누적 공식은
			
		}
		System.out.print("\n"+sum);
		//입력된 값의 평균을 내보세요
		avg = sum/ (arr.length);
		//arr.length는 입력한 갯수
	}
}
