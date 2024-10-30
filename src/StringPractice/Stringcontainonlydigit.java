package StringPractice;

public class Stringcontainonlydigit {

	public static void main(String[] args) {
		String data = "aa123";
		int len = data.length();
		boolean status = true;
		for(int i=0;i<len;i++) {
			if(data.charAt(i)>=48 && data.charAt(i)<=57) {
				
			}
			else {
				status = false;
			}
		}
		if(status == true) {
			
			System.out.println("Input is mix of digit Only");
		}else {
			
			System.out.println("Input is mix of other data then digit");
		}
	}
}
