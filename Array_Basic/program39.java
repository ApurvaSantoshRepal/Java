/*
39] Leaders in an array
Write a program to print all the LEADERS in the array. An element is a leader if it
is greater than all the elements to its right side. And the rightmost element is
always a leader.
For example:
Input: arr[] = {16, 17, 4, 3, 5, 2},
Output : 17, 5, 2
Input: arr[] = {1, 2, 3, 4, 5, 2},
Output: 5, 2


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