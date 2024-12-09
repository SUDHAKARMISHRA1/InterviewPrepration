package StringPractice;

public class StringisValidInteger {

	public static void main(String[] args) {
		String data =  "123";
		int len =data.length();
		boolean status = true;
		for(int i=0;i<len;i++) {
			if(data.charAt(i)>=48 && data.charAt(i)<=57) {
				status = true;
			}else {
				status = false;
				break;
			}
		}
		if(status == true) {
			System.out.println("Valid integer");
		}else {
			System.out.println("Invalid integer");
		}

	}

}
