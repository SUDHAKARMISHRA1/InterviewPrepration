package HashsetPractice;

import java.util.Arrays;
import java.util.HashSet;

public class Hashsetgeneralpract {
	
	public static void main(String[] args) {
		HashSet<Integer> ss = new HashSet<Integer>();
		ss.add(5);
		ss.add(2);
		ss.add(4);	
		ss.add(6);
		
		//size
		System.out.println(ss.size());
		
		//remove all element
		//ss.clear();
		
		//check if HashSet is empty
//		if(ss.isEmpty()==true) {
//			System.out.println("Yes it is empty");
//		}
//		else {
//			System.out.println("No its not");
//		}
		
		//convert HashSet to array
		Object ar[] = ss.toArray();
		System.out.println(Arrays.toString(ar));
		
	}

}
