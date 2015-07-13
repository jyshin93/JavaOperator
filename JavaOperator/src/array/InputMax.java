package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : Jin
 * @ Story : int형 배열에서 입력값 중 최대값 구하기
 * */
public class InputMax {
	public static void main(String[] args) {
		System.out.println("3개의 점수를 입력하세요");
		int top = 0; // 최대값을 담을 임의의 변수
		Scanner scanner = new Scanner(System.in);
		// 배열선언 및 초기화
		// for-loop 으로 입력받고
		// 비교로직은 if문을 사용
		int arr[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		if ((arr[0]>arr[1]) && (arr[0]>arr[2])) {
			top = arr[0];
		}else if ((arr[1]>arr[0]) && (arr[1]>arr[2])) {
			top = arr[1];
		}else if ((arr[2]>arr[0]) && (arr[2]>arr[1])) {
			top = arr[2];
		}else {
			System.out.println("동점이 존재합니다");
		}
		System.out.println("배열중 최대값:\t"+top);
	}
}
