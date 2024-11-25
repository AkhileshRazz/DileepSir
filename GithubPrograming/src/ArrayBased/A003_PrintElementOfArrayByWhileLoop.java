package ArrayBased;

public class A003_PrintElementOfArrayByWhileLoop {

	public static void main(String[] args) {
		int[] a= {10,30,25,60,87,45,6};
		int i=a.length -1;
		while(i>=0) {
			System.out.println(a[i]);
			i--;
		}
	}

}
