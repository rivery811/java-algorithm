package study04;
import java.util.Scanner;

import sun.print.resources.serviceui;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			int flag =0;
			System.out.println("0.종료 1. BMI 2. 이해못할 문제");
			
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 :System.out.println("BMI:이름 키 몸무게");
			String name = scanner.next();
			double height =scanner.nextDouble();
			double weight =scanner.nextDouble();
			
			String result=student.getBmi(name, height,  weight);
			System.out.println(result);
			
			break;
			case 2 : 
				//이름 주소 나이 은행잔고 신용도 
				//결과가 뭘 넣든 1억 대출 
				System.out.println("정보 입력 : 이름 주소 나이 은행잔고 신용도");
				name = scanner.next();
				String adress = scanner.next();
				int age = scanner.nextInt();
				int money = scanner.nextInt();
				String credit = scanner.next();
				
				
				result =student.dc(name, adress, age, money, credit);
				System.out.println(result);
				break;
			
			}
		}

	}

}
