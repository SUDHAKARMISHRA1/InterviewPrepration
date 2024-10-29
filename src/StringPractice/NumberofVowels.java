package StringPractice;

public class NumberofVowels {

	public static void main(String[] args) {
		String name ="sUdhakar";
		String lowercase = name.toLowerCase();
		int count =0;
		int len = lowercase.length();
		for(int i=0;i<len;i++) {
			if(lowercase.charAt(i)=='a' ||lowercase.charAt(i)=='e' || lowercase.charAt(i)=='i' ||lowercase.charAt(i)=='o'||
					lowercase.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
