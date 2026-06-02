package com.Infosys;
//print sum of array
public class Infosys2 {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			   // 0+1=1
			  //1+2=3
			 //3+3=6
			//6+4=10
			System.out.println(sum);
		}

	}

}
