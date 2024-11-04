package StringPractice;

public class MaximumoccuringChar {

	public static void main(String[] args) {
		String data = "thisissudhakarttttXj";
		int len = data.length();
		int count =0;
		String p ="";
		for(int i=0;i<len;i++) {
			int c =0;
			for(int j=0;j<len;j++) {
				if(data.charAt(i)==data.charAt(j)) {		
					c++;
				}
			}
			if(count<c) {
				count =c;
				c=0;
				p = Character.toString(data.charAt(i));  
			}

		}
		System.out.println(count +p);
	}

}
