package Activities;

import java.util.Arrays;

public class Activity4 {
	public static void main(String args[]) {
		
		int arr[]= {10,34,2,4,1};
		int temp;
		
		for(int i =0; i<arr.length-1; i++) {
			
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp;
					 
					
					
				}
				
			}
			
		}
		System.out.print(Arrays.toString(arr));
		
	}

}

