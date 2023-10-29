/*
38] Immediate Smaller Element

Given an integer array Arr of size N. For each element in the array, check whether
the right adjacent element (on the next immediate position) of the array is smaller.
If the next element is smaller, update the current index to that element. If not, then
-1.
Example 1:
Input:
N = 5
Arr[] = {4, 2, 1, 5, 3}
Output:
2 1 -1 3 -1
Explanation: Array elements are 4, 2, 1, 5, 3. Next to 4 is 2 which is
smaller, so we print 2. Next of 2 is 1 which is smaller, so we print 1. Next of
1 is 5 which is greater, so we print -1. Next of 5 is 3 which is smaller, so we
print 3. Note that for the last element, output is always going to be -1
because there is no element on the right.
Example 2:
Input:
N = 6
Arr[] = {5, 6, 2, 3, 1, 7}
Output:
-1 2 -1 1 -1 -1
Explanation: Next to 5 is 6 which is greater, so we print -1.Next of 6 is 2
which is smaller, so we print 2. Next of 2 is 3 which is greater, so we print
-1. Next of 3 is 1 which is smaller, so we print 1. Next of 1 is 7 which is
greater, so we print -1.
Note that for the last element, output is always going to be -1 because there
is no element on the right.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^7
1 ≤ Arr[i] ≤ 10^5

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