package homework02;

import java.util.Scanner;
public class Ranking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] players = {"A", "B","c"};
		double[] records = new double[3];
		
		for(int i=0;i<players.length;i++) {
			System.out.printf("%s 선수기록입력 : ",players[i]);
			records[i] = scanner.nextDouble();
		}
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

	}

}
