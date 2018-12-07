import java.util.ArrayList;
import java.util.Collections;

public class ListEnds {

	public static void main(String[] args) {
		ArrayList<Integer> intList= new ArrayList<Integer>();
		Collections.addAll(intList,11,11,14,10,9,2,11,9,1,14,0,19,18,13,11,17,1,3,16);
		ArrayList<Integer> listEnds= new ArrayList<Integer>();
		Collections.addAll(listEnds,intList.get(0),intList.get(intList.size()-1) );
		System.out.println(listEnds.get(0)+" "+listEnds.get(1));
	}

}
