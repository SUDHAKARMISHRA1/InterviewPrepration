package StringPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Mergetwosortedstring {
	
	public static void main(String[] args) {
		String d1 = "name";
		String d2 =  "sudhakar";
		int l1 = d1.length();
		int l2 = d2.length();
		
		ArrayList<Character> da3 = new ArrayList<Character>();
		for(int i=0;i<l1;i++) {
			da3.add(d1.charAt(i));	
		}
		for(int j=0;j<l2;j++) {
			da3.add(d2.charAt(j));
		}
		Collections.sort(da3);
		System.out.println(da3);	
	}

}
