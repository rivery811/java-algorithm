package homework02;//정석 483
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		System.out.println("몸무게를 입력하세요");
		double weight =scanner.nextDouble();
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble()/100;
		double bmi = weight/(height*height);
		System.out.println(bmi);

		String dap="";
		if(bmi>30.0) {
			dap="고도비만";
		}else if(bmi>25.0) {
			dap="비만";
		}else if(bmi>23.0) {
			dap="과체중";
		}else if(bmi>18.5) {
		   dap="정상";
		}else {
			dap="저체중";
		}
		System.out.println(dap);

	}

}
