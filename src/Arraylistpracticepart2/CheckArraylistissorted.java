package Arraylistpracticepart2;

import java.util.ArrayList;

public class CheckArraylistissorted {
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(4);
		ar.add(3);
		int len = ar.size();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ar.get(i)<=ar.get(j)) {
					
				}else {
					System.out.println("The given arraylist is not sorted");
					break;
				}
			}
		}
	}

}
