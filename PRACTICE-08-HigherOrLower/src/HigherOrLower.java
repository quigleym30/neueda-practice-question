import java.util.Random;
import java.util.Scanner;

public class HigherOrLower {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in); 
		 
		
		 Random rand = new Random();

		 int secret = rand.nextInt(100) + 1;
		 int count=0;
		 boolean progress=true;
		 while(progress) {
			 System.out.println("enter guess");
			 int input = scan.nextInt(); 
			 if (input==secret)
				 progress=false;
			 else if(input>secret)
				 System.out.println("To High");
			 else
				 System.out.println("To Low");
			 
			 count++;
		 }
		 
		 System.out.println("you guessed in "+count+" tries");
		 
	}

}
