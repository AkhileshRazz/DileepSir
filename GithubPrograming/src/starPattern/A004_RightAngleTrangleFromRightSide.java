package starPattern;

public class A004_RightAngleTrangleFromRightSide {

	public static void main(String[] args) {
		int size=4;
		for (int i = 1; i <=size; i++) {
			for (int j = 1; j <=size; j++) {
				if(j+i>=size+1) {
				System.out.print("* ");	
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
}
}