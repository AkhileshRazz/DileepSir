package ArrayBased;

public class A004_sortingByUsingBubleSort {

	public static void main(String[] args) {
		int[] a= {10,30,25,60,87,45,6};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[j]<a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}
