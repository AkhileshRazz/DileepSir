package ArrayBased;

public class A005_FirstMinAndFirstMax {

	public static void main(String[] args) {
		int[] a= {10,30,25,60,87,45,6};
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}else if(a[i]<min) {
				min=a[i];
			}
		}
			 System.out.println(max);
			 System.out.println(min);
	}

}
