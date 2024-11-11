package Arraylistpracticepart2;

import java.util.ArrayList;

public class FirstNonRepeatingElement {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(6);
		ar.add(1);
		int len1 = ar.size();
		for(int i=0;i<len1;i++) {
			int status =0;
		for(int j=i+1;j<len1;j++) {
			
			if(i!=j && ar.get(i)!=ar.get(j)) {
			
				status =1;
			}else {
				ar.remove(i);
				ar.remove(j);
				len1 = ar.size();
				status =0;
				break;
			}
		}
		if(status ==1) {
			System.out.println(ar.get(i));
			break;
		}else {
			
		}
		}
	}

}
