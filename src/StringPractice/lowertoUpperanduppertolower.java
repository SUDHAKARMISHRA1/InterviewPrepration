package StringPractice;

public class lowertoUpperanduppertolower {

	public static void main(String[] args) {
		String name = "AHelloZ";
		int len = name.length();
		String conv = "";
		for(int i=0;i<len;i++) {
			if(name.charAt(i)>=65 && name.charAt(i)<=90) {
				String g = Character.toString(name.charAt(i));
				conv = conv + g.toLowerCase();
			}else {
				String g = Character.toString(name.charAt(i));
				conv = conv + g.toUpperCase();
			}
		}
		System.out.println(conv);
	}

}