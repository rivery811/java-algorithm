package homework02;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기");
		int cho = scanner.nextInt();
		System.out.println("a값입력");
		int a = scanner.nextInt();
		System.out.println("b값입력");
		int b = scanner.nextInt();
		int c = 0;
		if(cho==1) {
			c = a+b;
			System.out.printf("%d+%d=%d",a,b,c);
		}else if(cho==2) {
			c = a-b;
			System.out.printf("%d-%d=%d",a,b,c);
		}else if(cho==3) {
			c = a*b;
			System.out.printf("%d*%d=%d",a,b,c);
		}else if(cho==4) {
			c= a/b;
			int d = a%b;
			System.out.printf("%d/%d=%d[%d]",a,b,c,d);
		}
		System.out.println();
		

	}

}
