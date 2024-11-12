package HashmapPractice;

import java.util.HashMap;

public class Hashmapsimplepractice {
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", "Sudhakar");
		hm.put("age", "25");
		
		String val = hm.get("name");
		System.out.println(val);
		
		//check if key exists
		if(hm.containsKey("class")==true) {
			System.out.println("Key Exist");
		}
		else {
			System.out.println("Missing Keys");
		}
		
		////check if value exists
		if(hm.containsValue("Sudhakar")==true) {
			System.out.println("Value Exist");
		}
		else {
			System.out.println("Missing Values");
		}
		
		//remove key and value pair
		if(hm.containsKey("name")==true) {
			hm.remove("name");
		}
		System.out.println(hm);
		
		//update value of existing key
		hm.computeIfPresent("age", (k,v)-> v+2);
		System.out.println(hm);
		
	}

}
