package study02;

public class EvenSequence {
	public static void main(String[] args) {
		String seq = "";
		int ser = 0;
		
		for(int i=1;i<=10;i++) {
			if(i%2 !=1) {
				if(i==10) {
					seq += i+"=";
				}else {
					seq += i+"+";
				}
				ser += i;
			}
			
		}
		
		System.out.println(seq+ser);
	}

}
