package BasicPrograming;

import java.util.Arrays;

public class A009_AnagramString {

	public static boolean display(String s1,String s2) {
		
		char[] a1 = s1.toLowerCase().toCharArray();
		char[] a2 = s2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(a1.length !=a2.length) {
			System.out.println("not anagram");
			return false;
		}else {
			for (int i = 0; i < a2.length; i++) {
				if(a1[i] !=a2[i]) {
					System.out.println("not anagram--");
					return false;
				}
			}
			
		}System.out.println("anagram");
		return false;
	}
	public static void main(String[] args) {
		
		if(display("listen", "silent")) {
			System.out.println("anagram");
		}

	}

}
