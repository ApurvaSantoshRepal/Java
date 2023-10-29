/*
18] Find Subarray with given sum | Set 1 (Non-negative
Numbers)
Given an array arr[] of non-negative integers and an integer sum, find a subarray
that adds to a given sum.
Note: There may be more than one subarray with sum as the given sum, print first
such subarray.
Examples:
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Output: Sum found between indexes 1 and 4
Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7
Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
Explanation: There is no subarray with 0 sum
*/


import java.io.*;
import java.util.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");
		int size = Integer.parseInt(br.readLine());
                System.out.println("Enter Elements in the array");
		int arr[]=new int[size];
		for(int i = 0;i<size;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter Sum");
		int sum = Integer.parseInt(br.readLine());
               sumOfSubArray(arr,sum);

	}
	static void sumOfSubArray(int arr[] ,int sum){
		for(int i=0;i<arr.length;i++){
			int tempSum=0;
			
			for(int j=i;j<arr.length;j++){
				tempSum = tempSum+arr[j];
				
				if(tempSum==sum){
					System.out.println(sum+" found between "+i+" and "+j);
					return;
				}
			}
		}
	}

}

