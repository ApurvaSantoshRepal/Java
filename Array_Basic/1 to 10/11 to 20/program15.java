/*
15] Sum of distinct elements

You are given an array Arr of size N. Find the sum of distinct elements in an array.
Example 1:
Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 15
Explanation: Distinct elements are 1, 2, 3
4, 5. So the sum is 15.
Example 2:
Input:
N = 5
Arr[] = {5, 5, 5, 5, 5}
Output: 5
Explanation: Only Distinct element is 5.
So the sum is 5.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N*logN)
Constraints:
1 ≤ N ≤ 10^7
0 ≤ A[i] ≤ 10^4
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
		System.out.println("Sum : "+sumOfDistictElements(arr));
		

	}
	static int sumOfDistictElements(int arr[]){
		int sum=arr[0];
		Arrays.sort(arr);
		for(int i =1;i<arr.length;i++){
			if(arr[i]!=arr[i-1]){
				sum=sum+arr[i];
			}
		}
		return sum;
	}
}

