package ArrayBased;

public class A013_printMissingNumberInArray {

	public static void main(String[] args) {
		int[] a= {11,12,15,20};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = a[i]+1; j < a[i+1]; j++) {
				System.out.println(j);
			}
		}
	}
}
