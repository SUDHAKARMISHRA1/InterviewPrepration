package StringPractice;

public class PalindromeString {
	
	public static void main(String[] args) {
		String name = "12321";
		int len = name.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("The Given String is Palindrome");
		}else {
			System.out.println("The Given String is not Palindrome");
		}
	}

}
