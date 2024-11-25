package ArrayBased;

import java.util.Arrays;

public class A012_AddTwoArrayThanFindMax {

	public static void main(String[] args) {
		int[] a1= {1,2,5};
		int[]a2= {7,8,18,12};
	
		int[] a3=new int[a1.length+a2.length];
		for (int i = 0; i < a3.length; i++) {
			if(i<a1.length) {
				a3[i]=a1[i];
			}else {
				a3[i]=a2[i-a1.length];
			}
			
		}
		Arrays.sort(a3);
		System.out.println("max value is "+a3[a3.length-1]);
		
	}

}
