package BasicPrograming;

public class A002_AllFactorOfNumber {

	public static void main(String[] args) {
		int number=34;
		int count=0;
		for (int i = 1; i <number; i++) {
			if(number%i==0) {
				count++;
				System.out.println(i);
			}
			
		}
		
		System.out.println("total"+count);

	}

}
