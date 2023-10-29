/*
6] Elements in the Range

Given an array arr[] containing positive elements. A and B are two numbers
defining a range. The task is to check if the array contains all elements in the given
range.
Example 1:
Input: N = 7, A = 2, B = 5
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: Yes
Explanation: It has elements between range 2-5 i.e 2,3,4,5
Example 2:
Input: N = 7, A = 2, B = 6
arr[] = {1, 4, 5, 2, 7, 8, 3}
Output: No
Explanation: Array does not contain 6.
Note: If the array contains all elements in the given range then driver code outputs
Yes otherwise, it outputs No
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ N ≤ 10^7
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
		System.out.println("Enter Number1:");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter Number2: ");
		int num2 = Integer.parseInt(br.readLine());
		boolean output = elementRange(arr,num1,num2);
		if(output==true){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}


	}
	static boolean elementRange(int arr[] , int num1,int num2){
		int count= 0;
		for(int i =0;i<arr.length;i++){
		if(arr[i]>=num1||arr[i]<=num2){
			count++;
		}
		}
		if (count==num2-num1+1){
			return true;
		}
		return false;
	}

}

