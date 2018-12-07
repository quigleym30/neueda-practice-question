import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		 
		 String input = scan.nextLine(); 

		 char[] charArray=input.toCharArray();
		 
		 int count=0;
		 
		 for (int i=0;i<charArray.length;i++)
		 {
			 if(charArray[i]=='a'||charArray[i]=='A')
				 count++;
		     if(charArray[i]=='e'||charArray[i]=='E')
		    	 count++;	 
			 if(charArray[i]=='i'||charArray[i]=='I')
				 count++;		 
			 if(charArray[i]=='o'||charArray[i]=='O')
				 count++;			 
			if(charArray[i]=='u'||charArray[i]=='u')
				count++;				 
		 }
		 System.out.println("number of vowels: "+count);
	}

}
