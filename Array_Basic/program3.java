/*
3] Largest Element in Array

Given an array A[] of size n. The task is to find the largest element in it.
Example 1:
Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output: 90
Explanation:
The largest element of a given array is 90.
Example 2:
Input:
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}
Output: 5
Explanation:
The largest element of a given array is 5.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= n<= 10^3
0 <= A[i] <= 10^3
Arrays may contain duplicate elements.
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
		System.out.println("Largest Number "+largestNumber(arr));
		

	}
	static int largestNumber(int arr[] ){
		int maxNum = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>maxNum){
				maxNum= arr[i];
			}
		}
		return maxNum;
	}
}

