/*
26] Positive and negative elements

Given an array arr[ ] containing equal number of positive and negative elements,
arrange the array such that every positive element is followed by a negative
element.
Note- The relative order of positive and negative numbers should be maintained.
Example 1:
Input:
N = 6
arr[] = {-1, 2, -3, 4, -5, 6}
Output:
2 -1 4 -3 6 -5
Explanation: Positive numbers in order are 2, 4 and 6. Negative numbers in
order are -1, -3 and -5. So the arrangement we get is 2, -1, 4, -3, 6 and -5.
Example 2:
Input:
N = 4
arr[] = {-3, 2, -4, 1}
Output:
2 -3 1 -4
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 ≤ N ≤ 10^6
1 ≤ arr[i] ≤ 10^9
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

