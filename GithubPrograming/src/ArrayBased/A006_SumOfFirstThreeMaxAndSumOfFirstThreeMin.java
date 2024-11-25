package ArrayBased;

import java.util.Arrays;


public class A006_SumOfFirstThreeMaxAndSumOfFirstThreeMin {

	public static void main(String[] args) {
		int[] a= {10,30,25,60,87,45,6};
		
	Arrays.sort(a);
	  
		System.out.println("sum first three max= "+(a[a.length-1]+a[a.length-2]+a[a.length-3]));
		System.out.println("sum first three min "+(a[0]+a[1]+a[2]));
	
	
	}
}
