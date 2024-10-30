package StringPractice;

public class FirstNonRepetatingCharacter {

	public static void main(String[] args) {
		String name ="quq";
		int len = name.length();
		for(int i=0;i<len;i++) {
			boolean tar = false;
			for(int j=0;j<len;j++) {
				if(i!=j && name.charAt(i)==name.charAt(j)) {
					tar = true;
					break;
				}
			}
			if(tar == false) {
				System.out.println(name.charAt(i));
				break;
			}
		}


	}

}
