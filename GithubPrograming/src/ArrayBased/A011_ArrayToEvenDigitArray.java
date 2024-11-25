package ArrayBased;

public class A011_ArrayToEvenDigitArray {
  public static void main(String[] args) {
	  int[] a= {10,30,25,60,87,45,6};
	  int count=0;
	  
	  int size=0;
	  for(int e : a) {
		  if(e%2==0) {
			  count++;
		  }
	  }
	  int[] na= new int[count];
	  for (int i = 0; i <a.length; i++) {
		if(a[i]%2==0) {
			na[size++]=a[i];
		}
	}
	  
	  for(int e:na) {
		  System.out.println(e);
	  }
}
}
