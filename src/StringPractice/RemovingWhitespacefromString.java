package StringPractice;

public class RemovingWhitespacefromString {

	public static void main(String[] args) {
		String data = " as m d ";
		String cleandata= data.replaceAll(" ", "");
		System.out.println(cleandata);
	}
}
