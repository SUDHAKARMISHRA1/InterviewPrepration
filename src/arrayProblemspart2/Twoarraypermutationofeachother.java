package arrayProblemspart2;

import java.util.ArrayList;
import java.util.Collections;

public class Twoarraypermutationofeachother {
	
	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,2};
		int arr[]= {5,4,1,2,3,2};
		
		int len = ar.length;
		int len1 = arr.length;
		
		if(len!=len1) {
			System.out.println("al1 and al2 are not permutation of each other");
		}
		
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		for(int i=0;i<ar.length;i++) {
			al1.add(ar[i]);
			al2.add(arr[i]);	
		}
		Collections.sort(al1);
		Collections.sort(al2);
		boolean status = true;
		for(int i=0;i<al1.size();i++) {
			if(al1.get(i)==al2.get(i)) {
				status = true;
			}else {
				status = false;
				break;
			}
			
		}
		if(status == true) {
			System.out.println("al1 and al2 are permutation of each other");
		}else {
			
			System.out.println("al1 and al2 are not permutation of each other");
			
		}
		
		
		
	}

}
