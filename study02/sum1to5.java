package study02;

public class sum1to5 {

	public static void main(String[] args) {
		//1+2+3+4+5+
		String result = "";
		int sum = 0;
		for(int i=1;i<=5;i++) {
		
			/*
			if(i==5) {
				result += i+ "=";
			}else{
				result += i+ "+";
			}
			*/
			 result += (i==5) ? i+ "=" : i+ "+";//삼항연산자
			sum += i;
			
		}System.out.print(result);
	}
}
