package study02;
import java.util.Scanner;

public class OddSequence2 {

	public static void main(String[] args) {
		// 1+3+5+7+9
		//i % 2 = 0 짝수, 1이면 홀수
		Scanner scan = new Scanner(System.in);
		String sequence = "";
		int series = 0;
		System.out.println("입력된 입력1부터 입력2까지 홀수의 합");
		System.out.println("입력a");
		int start = scan.nextInt();
		System.out.println("입력b");
		int end = scan.nextInt();
		if(start>end){
			for(int i=end;i<=start;i++) {
				if(i%2 !=0) {
					int start2 = 0;
					if(start %2 ==0) {
						start2 = end -1;
						
					}else {
						start2 = end;
					}
					
					if(i!=start2) {
						sequence += i+"+";
					}else {
						sequence += i+"=";
					}
					
				}
				series += i;
			}
			
		}else if(start<end) {
			
			for(int i=start;i<=end;i++) {
				if(i%2 !=0) {
					int end2= 0;
					if(end %2 ==0) {
						end2 = end -1;
						
					}else {
						end2 = end;
					}
					
					if(i!=end2) {
						sequence += i+"+";
					}else {
						sequence += i+"=";
					}
					
				}
				series += i;
		}
		
	
	

	}System.out.println(sequence+series);
  }

}
