package BasicPrograming;

public class A008_NthPrimeNumberBeetwenRange {

	public static void main(String[] args) 
	{
		int nth=0;
		for (int i = 1; i <=100; i++) {
			int count=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				nth++;
				if(nth==25) {
					System.out.println(i);
				}
			}
		}

	}

}
