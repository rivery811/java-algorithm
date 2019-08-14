package homework01;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("1.가위 2.바위 3.보!");
		int user = scanner.nextInt();
		int computer = random.nextInt(3)+1;
		System.out.println(computer);
		switch(computer) {
		case 1 : 
			if(user==computer)
			    System.out.print("비겼습니다");
			if(user==2&&computer==1)
		        System.out.print("이겼습니다");	
			if(user==3&&computer==1)
				System.out.print("졌습니다");
			break;
		case 2 : 
			if(user==computer)
			    System.out.print("비겼습니다");
			if(user==1&&computer==2)
		        System.out.print("이겼습니다");	
			if(user==3&&computer==2)
				System.out.print("졌습니다");
			break;
		case 3 : 
			if(user==computer)
			    System.out.print("비겼습니다");
			if(user==1&&computer==3)
		        System.out.print("이겼습니다");	
			if(user==2&&computer==3)
				System.out.print("졌습니다");
			break;
		
		}
		
		
		

	}

}
