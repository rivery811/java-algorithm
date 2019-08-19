package homework02;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] name = {"A","B","C"};
		double[] t=new double[3];
		
		for(int i=0;i<name.length ;i++) {
			System.out.printf("%s 선수 기록 :",name[i]);
			t[i]= scanner.nextDouble();
		}
		if(t[0]>t[1]&&t[1]>t[2]) {
			System.out.println("1 :" +name[2] +"선수기록 :" +t[2] \n"2 :name[1] 선수기록 t[1]\n "
					+ "3: name[0] 선수기록 t[0]");
		}//else if() {}else if() {}


	
}
}
