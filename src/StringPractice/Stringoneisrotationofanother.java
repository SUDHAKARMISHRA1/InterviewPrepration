package StringPractice;
import java.util.*;
public class Stringoneisrotationofanother {


	public static void checkRotation(char[] done, char[] dtwo) {
		int len1 = done.length;
		int len2 = dtwo.length;
		char  temp;
		int count = 0;
		while(count<len1) {
			for(int i=0;i<len2;i++) {
				temp = dtwo[i];
				dtwo[i] = dtwo[len2-1];
				dtwo[len2-1]= temp;
				if(Arrays.equals(done, dtwo)) {
					count = len1+1;
					System.out.println("Cyclic rotation is ok");
					break;
				}

			}
			count++;
		}

	}
	public static void main(String[] args) {
		String one = "abcde";
		String two ="deabc";
		char[] done = one.toCharArray();
		char[] dtwo = two.toCharArray();

		checkRotation(done, dtwo);
	}

}
