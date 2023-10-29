/*
29] Last index of One
Given a string S consisting only of '0's and '1's, find the last index of the '1' present
in it.

Example 1:
Input:
S = 00001
Output:
4
Explanation:
Last index of 1 in the given string is 4.
Example 2:
Input:
0
Output:
-1
Explanation:
Since, 1 is not present, so output is -1.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= |S| <= 10^6
S = {0,1}
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