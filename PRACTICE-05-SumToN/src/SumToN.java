import java.util.Scanner;

public class SumToN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		 
		 int max = scan.nextInt(); 
		 String outputString="";
		 int outputInt=0;
		 for (int i=1;i<=max;i++)
		 {
			 if (i==1)
			 outputString=outputString+Integer.toString(i);		 
			 else
			 outputString=outputString+"+"+Integer.toString(i);
			 outputInt+=i;
			 System.out.println(outputString);
		 }
		 System.out.println("the sum of all numbers between 1 and "+max+" is:"+outputInt);

	}

}
