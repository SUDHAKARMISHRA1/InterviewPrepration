package HashmapPractice;

import java.util.HashMap;

public class ClearHashmapandcheckifempty {
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", "Sudhakar");
		hm.put("age", "25");
		hm.put("nam", "Sudakar");
		hm.put("ag", "5");
		int len = hm.size();
		hm.clear();
		System.out.println(hm);
		if(hm.isEmpty()==true) {
			System.out.println("Yes it is");
		}else {
			System.out.println("No it's not");
		}
		
	}

}
