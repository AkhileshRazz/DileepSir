package starPattern;

public class A002_RightAngleTrangle {

	public static void main(String[] args) {
		int size=4;
		for (int i = 1; i <=size; i++) {
			for (int j = 1; j <=size; j++) {
				if(j<=i) {
				System.out.print("* ");	
				}
			}
			System.out.println();
		}
	}
}