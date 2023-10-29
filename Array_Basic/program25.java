/*
25] Maximum product of two numbers

Given an array Arr of size N with all elements greater than or equal to zero. Return
the maximum product of two numbers possible.
Example 1:
Input:
N = 6
Arr[] = {1, 4, 3, 6, 7, 0}
Output: 42
Example 2:
Input:
N = 5
Arr = {1, 100, 42, 4, 23}
Output: 4200
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
2 ≤ N ≤ 10^7
0 ≤ Arr[i] ≤ 10^4
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

