package StringPractice;

public class Spacereplacewithgivenchar {

	
	public static void main(String[] args) {
		String data = "Hell H warey u";
		String c = "o";
		String replacedData = data.replaceAll(" ", c);
		System.out.println(replacedData);
	}
}
