package com.Infosys;

//Linear search : searching the target value one by one
//Linear time complexity is o(n)--->bcoz time complexity tells how many times the loop runs according to input size
//now target is at last so it checks all the 5 elements
//so operation depends on number of elements(n)
//In worst case if target is 100 not present,still checks all elements so complexity remains o(n)
public class Infosys4 {

	public static void main(String[] args) {
		int[]arr= {2,5,6,9,8};
		int target = 8;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Element found");
			}else {
				System.out.println("Element not found");
			}
		}
		

	}

}
