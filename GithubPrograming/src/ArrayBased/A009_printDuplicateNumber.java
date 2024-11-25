package ArrayBased;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class A009_printDuplicateNumber {
	public static void main(String[] args) {
		int[] a= {10,30,25,60,87,45,6,6,45,87};
		
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
		lhm.put(a[i], lhm.getOrDefault(a[i], 0)+1);
		}		
		for(Entry<Integer,Integer> e : lhm.entrySet()) {
			if(e.getValue()>1) {
			System.out.println(e.getKey());
			}
		}
	}

}
