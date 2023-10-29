/*
20] Check if pair with given Sum exists in Array (Two Sum)

Given an array A[] of n numbers and another number x, the task is to check
whether or not there exist two elements in A[] whose sum is exactly x.
Examples:
Input: arr[] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation: If we calculate the sum of the output,1 + (-3) = -2
Input: arr[] = {1, -2, 1, 0, 5}, x = 0
Output: No
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
		if(checkSum(arr,sum)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}



	}
	static boolean checkSum(int arr[],int sum){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==sum){
					return true;
				}
			}
		}
		return false;

	}

}

