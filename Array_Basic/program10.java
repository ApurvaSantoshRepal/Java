/*
10] Max Odd Sum

Given an array of integers, check whether there is a subsequence with odd sum and
if yes, then find the maximum odd sum. If no subsequence contains an odd sum,
print -1.
Example 1:
Input:
N=4
arr[] = {4, -3, 3, -5}
Output: 7
Explanation:
The subsequence with maximum odd
sum is 4 + 3 = 7
Example 2:
Input:
N=5
arr[] = {2, 5, -4, 3, -1}
Output: 9
Explanation:
The subsequence with maximum odd
sum is 2 + 5 + 3 + -1 = 9
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
2 ≤ N ≤ 10^7
-10^3 <= arr[i] <= 10^3
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

