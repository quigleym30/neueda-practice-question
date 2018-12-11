import java.util.Scanner;

public class ConvertToCelsius {

	public static void main(String[] args) {
 Scanner scan = new Scanner(System.in); 
		 
		 double  fahrenheit = scan.nextDouble(); 
		 double  celsius =(fahrenheit-32)*((double) 5/9);
		 System.out.println(celsius);
	}

}
