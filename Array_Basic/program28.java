/*
28] Remove Duplicates from unsorted array

Given an array of integers which may or may not contain duplicate elements. Your
task is to remove duplicate elements, if present.
Example 1:
Input:
N = 6
A[] = {1, 2, 3, 1, 4, 2}
Output:
1 2 3 4
Example 2:
Input:
N = 4
A[] = {1, 2, 3, 4}
Output:
1 2 3 4
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1<=N<=10^5
1<=A[i]<=10^5
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

