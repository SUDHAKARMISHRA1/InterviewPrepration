package HashsetPractice;

import java.util.HashSet;

public class RemoveElementfromhashset {
	
	public static void main(String[] args) {
		
		HashSet<Integer> ss = new HashSet<Integer>();
		ss.add(5);
		ss.add(2);
		ss.add(4);	
		//remove element from hashset
		ss.remove(4);
		
		//Check if element exist
		int val =4;
		
		if(ss.contains(val)==true) {
			System.out.println("Exist");
		}else {
			System.out.println("Don't Exist");
		}
		
		System.out.println(ss);
	}

}
