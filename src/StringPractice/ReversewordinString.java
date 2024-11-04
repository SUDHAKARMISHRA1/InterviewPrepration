package StringPractice;

public class ReversewordinString {
	
	
	public static void main(String[] args) {
		String data = "This is new word";
		String[] sp = data.split(" ");
		int len =  sp.length;
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev = rev + sp[i] + " ";
		}
		System.out.println(rev);
	}

}
