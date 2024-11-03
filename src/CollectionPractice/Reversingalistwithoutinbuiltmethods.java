package CollectionPractice;

import java.util.ArrayList;

public class Reversingalistwithoutinbuiltmethods {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		int len = ar.size();
		int temp=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=len-1;i>=0;i--) {
			arr.add(temp, ar.get(i));
			temp++;
		}
		System.out.println(arr);
	}

}
