import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);
        int row,temp,space,n;
        n=scan.nextInt();
        temp = n;
        for ( row = 1 ; row <= n ; row++ )
           {
              for ( space = 1 ; space < temp ; space++ )
                System.out.print(" ");

              temp--;

              for ( int i = 1 ; i <= 2*row - 1 ; i++ )
                  System.out.print("*");

              System.out.println("");
           }
	}
}


