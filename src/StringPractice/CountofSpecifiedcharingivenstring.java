package StringPractice;

public class CountofSpecifiedcharingivenstring {
	
	
	public static void main(String[] args) {
		String name = "sudhakaaaar";
		char c = 'a';
		int len= name.length();
		int count =0;
		for(int i=0;i<len;i++) {
			if(name.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("The count of given char is " +count);
	}

}
