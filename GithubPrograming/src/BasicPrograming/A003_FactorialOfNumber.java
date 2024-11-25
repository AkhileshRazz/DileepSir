package BasicPrograming;

public class A003_FactorialOfNumber {

	public static void main(String[] args) {
		int number=6;
		int sum=1;
		for (int i = 1; i <number; i++) {
			sum=sum+sum*i;
		}
System.out.println(sum);
	}

}
