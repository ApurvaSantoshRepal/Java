/*
32] Maximize sum(arr[i]*i) of an Array
Given an array A of N integers. Your task is to write a program to find the
maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n 1.
You are allowed to rearrange the elements of the array.
Note: Since output could be large, hence module 109+7 and then print answer.
Example 1:
Input : Arr[] = {5, 3, 2, 4, 1}
Output : 40
Explanation:
If we arrange the array as 1 2 3 4 5 then we can see that the minimum index
will multiply with minimum number and maximum index will multiply with
maximum number.
So 1*0+2*1+3*2+4*3+5*4=0+2+6+12+20 = 40 mod(109+7) = 40
Example 2:
Input : Arr[] = {1, 2, 3}
Output : 8
Expected Time Complexity: O(nlog(n)).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ N ≤ 10^7
1 ≤ Ai ≤ N
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