package ArrayBased;
import java.util.HashSet;

public class A010_RemoveDuplicate {
public static void main(String[] args) {
	
	int[] a= {10,30,25,60,87,45,6};
	
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int e : a) {
		hs.add(e);
	}
	for (Integer e : hs) {
		System.out.println(e);
	}
}

}
