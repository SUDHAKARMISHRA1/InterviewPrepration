package StringPractice;

public class Extracting6digitaccountnumbfromstring {
	
	public static void main(String[] args) {
		String data = "sdfsjn123456sd sdfs sd12";
		String data1 = data.replaceAll("[^0-9]", " ").replaceAll(" +", " ");
		String[] ar = data1.split(" ");		
		for(int i=0;i<ar.length;i++) {
			if(ar[i].length()>=6) {
				System.out.println(ar[i]);
			}
		}			
	}

}
