package array;

import java.util.Scanner;

public class InputMaxAnswer {
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
			if (arr[i]>top) {
				top = arr[i];
			}
		}
		System.out.println("배열중 최대값:\t"+top);
	}

}
