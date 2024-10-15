package javaConccepts;

public class TypeCasting {

	public static void main(String[] args) {
		
		int a =10;
		String name = "1010";
		
		
//		int aa = Integer.parseInt(name);
//		System.out.println(aa);
		
		//Converted a String contain binary to decimal
		//Integer aa = Integer.parseInt(name, 2);
		
		//Converted a string contains number to 
		//Integer aa =Integer.valueOf(name);
		//System.out.println(aa);
		
		//Converting an integer to object
		Object ab = (Integer) a;
		System.out.println(ab);
		

	}

}
