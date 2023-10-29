/*
35] Minimum Product of k Integers
Given an array of N positive integers. You need to write a program to print the
minimum product of k integers of the given array.
Note: Since output could be large, hence module 10^9+7 and then print answer.
Example 1:
Input : Arr[] = {1, 2, 3, 4, 5}, K = 2
Output : 2
Explanation:
If we have an array [1, 2, 3, 4, 5]. We will get the minimum product after
multiplying 1 and 2 that is 2.
So, the answer is 2.
Example 2:
Input : Arr[] = {9, 10, 8}, K = 3
Output : 720
Expected Time Complexity: O(nlogn).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ K, N ≤ 10^5
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