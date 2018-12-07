import java.util.Scanner;

public class CountInThrees {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		 
		 int max = scan.nextInt(); 
		 
		 for (int i=3; i<=max;) {
			 System.out.println(i);
			 i=i+3;
		 }
	}
}
