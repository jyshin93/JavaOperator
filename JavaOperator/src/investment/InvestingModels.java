package investment;

import java.util.Scanner;

public class InvestingModels {
	public static void main(String[] args) {
		String name = "";
		int inc = 0, tv=0, bps=0;
		float roe=0, result =0, pro=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("회사이름");
		name = scanner.next();
		System.out.println("당기순이익:");
		inc = scanner.nextInt();
		System.out.println("시가총액:");
		tv = scanner.nextInt();
		pro = inc/tv;
		System.out.println("투자이윤율:"+pro);
		System.out.println("BPS입력:");
		bps = scanner.nextInt();
		System.out.println("return of equity:");
		roe = scanner.nextFloat();
		result = ((bps*roe)/pro);
		System.out.println(name+"의 적정주가는:"+result);
	}

}
