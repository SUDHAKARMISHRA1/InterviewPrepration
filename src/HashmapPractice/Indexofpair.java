package HashmapPractice;

import java.util.HashMap;

public class Indexofpair {
	
	public static int[] getPair(int[] ar, int tar,int len) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result[] = new int[2];
		for(int i=0;i<len;i++) {
			int comp = tar - ar[i];
			if(map.containsKey(comp)) {
				result[0]=i;
				result[1]=map.get(comp);
			}
			
				map.put(ar[i], i);
		
		}
		return result;
		
	}
	
	
	public static void main(String[] args) {
		int ar[] = {2,5,4,5,6,7,1};
		int len = ar.length;
		int tar =7;
	   int arr[]= getPair(ar,tar,len);
	   for(int i=0;i<arr.length;i++) {
		   System.out.println(arr[i]);
	   }
	    
	}

}
