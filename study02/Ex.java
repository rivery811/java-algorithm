package study02;
import java.util.Scanner;
public class Ex {
//짝수
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력한수부터 끝수까지 짝수의 합");
		System.out.println("시작값");
		int start = scan.nextInt();
		System.out.println("끝값");
		int end = scan.nextInt();
		String seq = "";
		int ser =0;
		
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				int end2= 0;
				if(end%2==1) {
					end2 = end-1;
				}else {
					end2 =end;
				}
				if(i==end2) {
					seq+= i+"=";
				}else {
					seq+=i+"+";
				}
			}
				
				
	
			ser += i;
			
		}
		System.out.println(seq+ser);

	}

}
