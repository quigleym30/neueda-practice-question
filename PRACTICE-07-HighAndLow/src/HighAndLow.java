import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HighAndLow {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		ArrayList<Integer> intList= new ArrayList<Integer>();
		int max=0;
		int min;
		for(int i=0;i<7;i++)
		{
			int num = scan.nextInt(); 
			intList.add(num);
		}
		
		for(int i=0;i<intList.size();i++)
		{
			
			if (intList.get(i)>max)
				max=intList.get(i);
		}
		min=max;
		
		for(int i=0;i<intList.size();i++)
		{

			if (intList.get(i)<min)
				min=intList.get(i);
		}
		
		System.out.println("the largest number is: "+max);
		System.out.println("the smallest number is: "+min);
	}

}
