package BasicPrograming;

public class A005_sumOfFirstAndLastDigitOfNumber {
 public static void main(String[] args) {
	int number=848203;
	int first=0;
	int last=number%10;
	while(number>0) {
		first=number%10;
		number=number/10;
		
	}
	System.out.println(first+last);
}
}
