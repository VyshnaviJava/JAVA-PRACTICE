package com.Infosys;

public class Infosys6 {

	public static void main(String[] args) {
		int[]arr= {2,3,1,5,6};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				//3<2-->not update
				//1<2-->update
				//
				min=arr[i];
				//min=2
				//min=1
			}
		}
		System.out.println(min);
	}

}
