package homework02;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		String dap ="";
		switch (choice) {
		case 1 :
			System.out.println("더할값을 입력하세요 (a+b)");
			System.out.println("a");
			int a = scanner.nextInt();
			System.out.println("b");
			int b = scanner.nextInt();
			int c = a+b;
			System.out.printf("%d+%d=%d",a,b,c);
			
			break;
		case 2 :
			System.out.println("뺄값을 입력하세요 (d+e)");
			System.out.println("d");
			int d = scanner.nextInt();
			System.out.println("e");
			int e = scanner.nextInt();
			int f = d-e;
			System.out.printf("%d-%d=%d",d,e,f);
		case 3 :
			System.out.println("곱할값을 입력하세요 (g+h)");
			System.out.println("g");
			int g= scanner.nextInt();
			System.out.println("h");
			int h = scanner.nextInt();
			int i = g*h;
			System.out.printf("%dx%d=%d",g,h,i);
		case 4 :
			System.out.println("나눌값을 입력하세요 (j+k)");
			System.out.println("j");
			int j = scanner.nextInt();
			System.out.println("k");
			int k = scanner.nextInt();
			int l = j/k;
			int m = j%k;
			System.out.printf("%d/%d=%d[%d]",j,k,l,m);
		default : dap="오류";
		
		}

	}

}
