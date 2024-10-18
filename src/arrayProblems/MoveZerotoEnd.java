package arrayProblems;

import java.util.Arrays;

public class MoveZerotoEnd {
	
	
	public static int[] shiftRight(int[] arrayset) {

		  if(arrayset.length==1){
	            return arrayset;
	        }
	        int newarray[] = new int[arrayset.length];
	        int count = 0;
	        for(int num : arrayset){
	            if(num!=0){
	                newarray[count] = num;
	                count++;
	            }
	        }
	        return newarray;
	    }
	
	
	public static void main(String[] args) {
		
		//1st Way
//		int arr[] = {1,2,0,0,5,6,0,3,0};
//		int len = arr.length;
//		int temp =0;
//		for(int i=0;i<len;i++) {
//			if(arr[i]==0) {
//				for(int j=i+1;j<len;j++) {
//					if(arr[j]!=0) {
//						temp = arr[i];
//						arr[i]= arr[j];
//						arr[j]= temp;
//						i=0;
//						break;
//					}
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//2nd Way
		int arrayset[] = {0,1,2,0,0,5,0};
		System.out.println(Arrays.toString(shiftRight(arrayset)));
		

		
	}

}
