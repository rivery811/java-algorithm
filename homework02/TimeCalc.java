package homework02;
import java.util.Scanner;;
public class TimeCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		int sec = scanner.nextInt();
		int hour = sec/3600;
		int lesthour = sec%3600;
		int min = lesthour/60;
		int seco = lesthour%60;
		System.out.printf("%d시간 %d분 %d초 입니다 ",hour, min,seco);
		
		

	}

}
