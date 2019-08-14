package homework02;
import java.util.Scanner;;
public class HowMuch {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("얼마에요?");
		int price = scanner.nextInt();
		System.out.println("몇개 드릴까요?");
		int count = scanner.nextInt();
		int total = price*count;
		System.out.printf("총 금액은 %d입니다",total);
		System.out.println("비싸요 10% 깍아주세요");
		int dc= total/10;
		total = total-dc;
		System.out.printf("그럼 %d원만 주세요",total);
		

	}

}
