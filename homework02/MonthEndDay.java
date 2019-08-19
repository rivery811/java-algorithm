package homework02;

import java.util.Scanner;

public class MonthEndDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = scanner.nextInt();
		String endDay = "";
		switch (month) {
		case 1: case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			endDay = "31";
			break;
		case 2 : case 4 : case 6 : case 9 : case 11 :
			endDay = "30";
			break;
		default: endDay ="오류";
			break;
		}
		System.out.printf("%d월은 %s일까지 입니다",month,endDay);
	}

}