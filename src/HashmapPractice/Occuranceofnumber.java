package HashmapPractice;

import java.util.HashMap;

public class Occuranceofnumber {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,1,2,5};
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(Integer val : arr) {
			if(hm.containsKey(val)) {
				hm.put(val, hm.get(val)+1);
			}else {
				hm.put(val, 1);
			}
		}
		
		System.out.println(hm);
	}
	

}
