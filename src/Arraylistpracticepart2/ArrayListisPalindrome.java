package Arraylistpracticepart2;

import java.util.ArrayList;

public class ArrayListisPalindrome {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(2);
		ar.add(1);
		int len = ar.size();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=len-1;i>=0;i--) {
			arr.add(ar.get(i));
		}int j=0;
		for(int i=0;i<len;i++) {
			
			if(ar.get(i)==arr.get(i)) {
				j =0;
			}else {
				j=1;
				break;
			}
		}
		if(j==0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
