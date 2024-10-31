package StringPractice;

import java.util.Arrays;

public class AnargamsString {
	
	public static void main(String[] args) {
		String one = "Listen";
		String two = "silent";
		String cleanone = one.replaceAll("\\s", "").toLowerCase();
		String cleantwo = two.replaceAll("\\s", "").toLowerCase();
		int len1 =  cleanone.length();
		int len2 = cleantwo.length();
		
		if(len1!=len2) {
			System.out.println("Given string are not anargams");
		}
		else {
			char[] c1 = cleanone.toCharArray();
			char[] c2 = cleantwo.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)== true){
				System.out.println("Given string are anargams");
			}else {
				System.out.println("Given string are not anargams");
			}
		}
	}

}
