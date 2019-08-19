package homework02;

import java.util.Scanner;
public class ScoreCalc3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int[] list = new int[100];
			int sum = 0;
			int average = 0;
			for(int i = 0; i < list.length; i++) {
				System.out.println("더하시려는 숫자를 입력하세요(종료는 -1)");
				list[i] = scan.nextInt();
				System.out.println("> "+ list[i]);
				sum += list[i];
				if(list[i] == -1) {
					sum = sum + 1;
					average = sum / i;
					System.out.print("현재까지의 누적값은 ");
					for(int j = 0; j < i; j++) {
						System.out.print(list[j]);
						if(j < i -1) {
							System.out.print(" + ");
						}else {
							System.out.print(" = " + sum + "이고, 평균은 " + average + "입니다. (소수점이하는 절삭");
						}
					}
						break;
					}
			}
		}
		}
	}
