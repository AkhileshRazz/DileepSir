package BasicPrograming;

public class A001_PrintOneToTenWithoutLoop {

	public static void display(int n) {
		if(n>10) {
			return;
		}else {
			System.out.println(n++);
			display(n);
		}		
	}
	
	public static void main(String[] args) {
		
        display(1);
	}

}
