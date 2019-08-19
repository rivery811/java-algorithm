package homework02;

import java.util.Scanner;
public class ScoreCalc2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a="";
	    int acc= 0;
		int aver = 0;
		while(true) {
			
			System.out.println("더할숫자를 입력하세요(종료는 -1)");
			int ans = 0;
			ans = scanner.nextInt();
			if(ans== -1) {
				a= a.substring(0,a.length()-1);
				System.out.printf("현재까지의 누적값은 %s= %d점이고 평균은 %d입니다.",a,acc,acc/aver);
			}
			acc += ans;
			a+= ans+"+";
			aver+=1;
			
		}
	} 
}