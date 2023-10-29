/*
33] Multiply left and right array sum.

Pitsy needs help with the given task by her teacher. The task is to divide an array
into two sub-array (left and right) containing n/2 elements each and do the sum of
the subarrays and then multiply both the subarrays.
Note: If the length of the array is odd then the right half will contain one element
more than the left half.
Example 1:
Input : arr[ ] = {1, 2, 3, 4}
Output : 21
Explanation:
Sum up an array from index 0 to 1 = 3. Sum up an array from index 2 to 3 =
7. Their multiplication is 21.
Example 2:
Input : arr[ ] = {1, 2}
Output : 2
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
1 ≤ A[i] ≤ 100
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