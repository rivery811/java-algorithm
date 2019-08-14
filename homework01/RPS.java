package homework01;
import java.util.Random;
import java.util.Scanner;
public class RPS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("1.가위 2.바위 3.보!");
		int user = scanner.nextInt();
		int computer = random.nextInt(3)+1;
		String score = "";
		System.out.println(computer);
		switch(computer) {
		case 1 : 
			switch(user) {
			case 1 : score ="비겼습니다"; break;
			case 2 : score ="이겼습니다"; break;
			case 3 : score ="졌습니다"; break;
			}
			System.out.println(score);break;
			
		case 2 : 
			switch(user) {
			case 1 : score ="졌습니다"; break;
			case 2 : score ="비겼습니다"; break;
			case 3 : score ="이겼습니다"; break;
			}
			System.out.println(score);break;
			
		case 3 : 
			switch(user) {
			case 1 : score ="이겼습니다"; break;
			case 2 : score ="졌습니다"; break;
			case 3 : score ="비겼습니다"; break;
			}
			System.out.println(score);break;
			
		}
		
	
		
  }
}
