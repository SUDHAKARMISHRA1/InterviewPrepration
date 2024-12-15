package StringPractice;

import java.util.ArrayList;

public class AllPalindromeinGivenstring {
	
	
	public static String checkAnagram(String str) {
		String cleanData = str.replace(" ", "");
		String temp = cleanData;
		String rev = "";
		
		
		
		for(int i=cleanData.length()-1;i>=0;i--) {
			rev = rev + cleanData.charAt(i);
		}
		
		if(rev.equals(temp)) {
			return "String " +cleanData+ " is anagram";
		}
			return "String " +cleanData+ " is not anagram";
	}
	
	
	
	public static void main(String[] args) {
		String data = "mom is the lol of the dad";
		
		String ar[] = data.split(" ");
		ArrayList<String> al = new ArrayList<>();
		
		for(int i=0;i<ar.length;i++) {
			String result = checkAnagram(ar[i]);
			al.add(result);
		}
		
		System.out.println(al);
	}

}
