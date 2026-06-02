package com.Infosys;
//print max element
public class Infosys3 {

	public static void main(String[] args) {
		int[]arr= {2,7,9,8,6};
		int max=arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]>max) {
				//7>2--->update
				//9>7-->update
				//8<9-->not update
				//6<9-->not update
				max=arr[i];
				//max=7
				//max=9
				//max=9
				//max=9
			}
		}
		System.out.println(max);

	}

}
