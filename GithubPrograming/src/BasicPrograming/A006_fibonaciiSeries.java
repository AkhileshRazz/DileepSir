package BasicPrograming;

public class A006_fibonaciiSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for (int i = 1; i <=10; i++) {
			int temp=a+b;
			System.out.println(a);
			a=b;
			
			b=temp;
		}
		
		
	}
}
