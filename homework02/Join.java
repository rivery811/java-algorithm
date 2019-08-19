package homework02;
import java.util.Scanner;
public class Join {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===회원가입===");
		String[] info = {"아이디","비밀번호","이름","생년월일(예)1980-01-01",
				            "성인여부 (성인 true,미성년 false)","키 (소수점 첫째자리까지)",
				            "몸무게(소수점 첫째자리까지)", "혈액형(A)"};  
		String[] answer = new String[8];
		for(int i= 0;i<info.length;i++) {
			System.out.printf(" %s: ",info[i]);
			answer[i]=scanner.next();
		}
		System.out.println("===회원정보===");
		for(int i=0; i<answer.length;i++) {
			if(i==3) {
			//모르겠음...
			}else {
			System.out.printf("%s:%s\n",info[i],answer[i]);
		}
		
		
		}
	}

}
