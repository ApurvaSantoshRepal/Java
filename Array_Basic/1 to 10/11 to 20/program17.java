/*
17] Product of maximum in first array and minimum in second
Given two arrays of A and B respectively of sizes N1 and N2, the task is to
calculate the product of the maximum element of the first array and minimum
element of the second array.
Example 1:
Input : A[] = {5, 7, 9, 3, 6, 2},
B[] = {1, 2, 6, -1, 0, 9}
Output : -9
Explanation:
The first array is 5 7 9 3 6 2.
The max element among these elements is 9.
The second array is 1 2 6 -1 0 9.
The min element among these elements is -1.
The product of 9 and -1 is 9*-1=-9.
Example 2:
Input : A[] = {0, 0, 0, 0},
B[] = {1, -1, 2}
Output : 0
Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(1).
Output:
For each test case, output the product of the max element of the first array and the
minimum element of the second array.
Constraints:
1 ≤ N, M ≤ 10^6

-10^8 ≤ Ai, Bi ≤ 10^8
*/



import java.io.*;
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
		System.out.println("Enter size of second array");
		int size2 = Integer.parseInt(br.readLine());
		int arr2[]=new int[size2];
		for(int i=0;i<size2;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Product: "+product(arr,arr2));
			

	}
	static int product(int arr[],int arr2[]){
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>maxNum){
				maxNum=arr[i];
			}
		}
		for(int i=0;i<arr2.length;i++){
			if(arr2[i]<minNum){
				minNum=arr2[i];
			}
		}
		return maxNum*minNum;
	}
}

