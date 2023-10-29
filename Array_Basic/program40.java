/*

40] Fibonacci in the array

Given an array arr of size N, the task is to count the number of elements of the
array which are Fibonacci numbers
Example 1:
Input: N = 9, arr[] = {4, 2, 8, 5, 20, 1,
40, 13, 23}

Output: 5
Explanation: Here, Fibonacci series will be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
Numbers that are present in array are 2, 8, 5, 1, 13
Example 2:
Input: N = 4, arr[] = {4, 7, 6, 25}
Output: 0
Explanation: No Fibonacci number in
this array.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ N ≤ 10^6
*/

import java.io.*
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
		System.out.println("Enter Key");
		int key = Integer.parseInt(br.readLine());

	}
}