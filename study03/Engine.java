package study03;
import java.util.Scanner;
import study03.Student;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		int flag =0;
		String result = "";
		while (true) {
			System.out.println("메뉴 0 : 종료  1 : BMI 2.Rnaking 3.HowMuch 4.Reportcard");
			flag =scanner.nextInt();
			switch(flag){
			case 0 : System.out.println("종료"); return;
			
			case 1 : System.out.println("BMI");
	
			System.out.println("이름을 입력하세요");
			String name = scanner.next();
			System.out.println("몸무게를 입력하세요");
			double weight =scanner.nextDouble();
			System.out.println("키를 입력하세요");
			double height = scanner.nextDouble()/100;
			

			result = student.getBmi(name,weight,height);
			System.out.println(result);
			
			break;
			case 2 : System.out.println("Rnaking");
	     	double[] records = new double[3];
			for(int i=0;i<3;i++) {
				System.out.printf("%s 선수기록입력 : ");
				records[i] = scanner.nextDouble();
			}
			 result = student.getRank(records);
			break;
			case 3 : System.out.println("HowMuch");
			student.howMuch();
			break;
			case 4 : System.out.println("Reportcard");
			student.getReportcard();
			break;
			}
		}

	}

}
