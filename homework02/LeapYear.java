package homework02;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = scanner.nextInt();
		
		if(year%400==0) {
			System.out.printf("%s는 윤년입니다.",year);
		}else if(year%400!=0) {
			if(year%4==0) {
				if(year%100==0) {
					System.out.printf("%s는 평년입니다.",year);
				}else {
					System.out.printf("%s는 윤년입니다.",year);
				}
				
			} else {
				System.out.printf("%s는 평년입니다.",year);
			}
			
		}
			
		
		
		

	}

}
