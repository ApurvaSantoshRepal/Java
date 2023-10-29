/*
43] Count number of elements between two given elements in
array

Given an unsorted array and two elements num1 and num2. The task is to count the
number of elements occurring between the given elements (excluding num1 and
num2). If there are multiple occurrences of num1 and num2, we need to consider
the leftmost occurrence of num1 and rightmost occurrence of num2.
Example 1:
Input : Arr[] = {4, 2, 1, 10, 6}
num1 = 4 and num2 = 6
Output : 3
Explanation:
We have an array [4, 2, 1, 10, 6] and
num1 = 4 and num2 = 6.
So, the leftmost index of num1 is 0 and the rightmost index of num2 is 4.
So, the total number of elements between them is [2, 1, 10] So, the function
will return 3 as an answer.

Example 2:
Input : Arr[] = {3, 2, 1, 4}
num1 = 2 and num2 = 4
Output : 1
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
2 ≤ N ≤ 10^5
1 ≤ A[i], num1, num2 ≤ 10^5
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