package study03;

import java.util.Scanner;

public class Student {
	//비엠아이 랭킹 하우머치 리포트카드
	public String getBmi(String name,double weight, double height ) {
		
		String dap="";
		double bmi = weight/(height*height);
        System.out.println(bmi);
		if(bmi>30.0) {
			dap="고도비만";
		}else if(bmi>25.0) {
			dap="비만";
		}else if(bmi>23.0) {
			dap="과체중";
		}else if(bmi>18.5) {
		   dap="정상";
		}else {
			dap="저체중";
		}
		return String.format("%s의 BMI는 %s",name,dap);
	}
	public String getRank(double[] records) {
	
		String [] players = {"A", "B","c"};
		if(records[0] > records[1] && records[1] > records[2]) {
			System.out.print("1등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n2등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n3등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n");
		}else if(records[0] > records[1] && records[1] < records[2]) {
			if(records[0] > records[2]) {
				System.out.print("1등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n2등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n3등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n");
			}else {
				System.out.print("1등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n2등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n3등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n");
			}
		}else if(records[0] < records[1] && records[1] < records[2]) {
			System.out.print("1등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n2등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n3등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n");
		}else if(records[0] < records[1] && records[1] > records[2]) {
			if(records[0] > records[2]) {
				System.out.print("1등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n2등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n3등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n");
			}else {
				System.out.print("1등 : " + players[0] + " 선수 기록 (" + records[0] + ")\n2등 : " + players[2] + " 선수 기록 (" + records[2] + ")\n3등 : " + players[1] + " 선수 기록 (" + records[1] + ")\n");
			}
		}
		return "등수를 계산중";
	}
	public void howMuch() {
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
		System.out.printf("그럼 %d원만 주세요\n",total);
	}
	public void getReportcard() {
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
		System.out.printf("%s %d %d %d %d %d %s \n",student, score[0], score[1], score[2],sum,averege, pass);
	
	}
	

}
