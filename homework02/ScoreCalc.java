package homework02;

import java.util.Scanner;
public class ScoreCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	
		while(true) {
			int[] score = new int [100];
			int sum =0;
			int ave = 0;
			for (int i = 0; i < score.length; i++) {
				System.out.println("더하시려는 숫자를 입력하세요(종료는 -1)");
				score[i] = scanner.nextInt();
				System.out.println("> "+ score[i]);
				sum+= score[i];
			
				if (score[1]==-1) 	{
					sum= sum+1;
					ave = sum/i;
					System.out.print("현재까지의 누적값은 ");
					for(int j = 0; j < i; j++) {
						System.out.print(score[j]);
						if(j<i-1) {
							System.out.print(" + ");
						}else {
							System.out.print(" = " + sum + "이고, 평균은 " + ave + "입니다. (소수점이하는 절삭");
						}
						
					}
					break;
				}
				
			}
			
		}
	} 
}