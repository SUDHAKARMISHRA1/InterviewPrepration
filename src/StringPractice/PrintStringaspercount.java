package StringPractice;

public class PrintStringaspercount {
	
	public static void main(String[] args) {
		String value = "a2b1c8";
		String data = value.toUpperCase();
		int len = data.length();
		for(int i=0;i<len;i++) {
			if(data.charAt(i)>=65 && data.charAt(i)<=90) {
				char cc = data.charAt(i+1);
				int c =Character.getNumericValue(cc);
				while(c!=0) {
					System.out.println(data.charAt(i));
					c--;
				}
				
			}
		}
	}

}
