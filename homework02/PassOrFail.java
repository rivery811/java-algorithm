package homework02;

import java.util.Scanner;
public class PassOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 이름을 입력하세요");
		String student = scanner.next();
		
		String [] subject = { "국어", "영어","수학"};
		int [] score = new int [3];
		for(int i = 0;i<subject.length;i++) {
			System.out.printf("%s점수를 입력하세요",subject[i]);
			score[i] = scanner.nextInt();
		}
		int sum = 0;
		for(int i = 0; i<score.length;i++) {
			sum += score[i];
		}
		System.out.print(sum);
		 int averege = sum/score.length;
		 System.out.println(averege);
		String pass =""; 
		if (averege>=90) {
			pass = "장학생";
		}else if(averege>=70) {
			pass = "합격";
		}else if(70>averege){
			pass = "불합격";
		}
		System.out.printf("학생  %s %s %s 총점 평균 합격여부\n",subject);
		System.out.println("=======================");
		System.out.printf("%s %d %d %d %d %d %s ",student, score[0], score[1], score[2],sum,averege, pass);
	
	}

}
