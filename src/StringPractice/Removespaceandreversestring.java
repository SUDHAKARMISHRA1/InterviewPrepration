package StringPractice;

public class Removespaceandreversestring {

	public static void main(String[] args) {
		String data = "This is a java program";
		String data1 = data.replaceAll(" ", "");
		System.out.println(data1);
		int len = data1.length();
		String rev= "";
		for(int i=len-1;i>=0;i--) {
			rev = rev+data1.charAt(i);
		}
		System.out.println(rev);	
		//1st way
//		StringBuffer sb = new StringBuffer(data1);
//		sb.reverse();
//		System.out.println(sb);
	}
}
