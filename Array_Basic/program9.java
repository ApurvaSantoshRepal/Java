/*
9] Remove an Element at Specific Index from an Array
Given an array of a fixed length. The task is to remove an element at a specific
index from the array.
Examples 1:
Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
Output: arr[] = { 1, 2, 4, 5 }
Examples 2:
Input: arr[] = { 4, 5, 9, 8, 1 }, index = 3
Output: arr[] = { 4, 5, 9, 1 }

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
		System.out.println("Enter Index");
		int Index = Integer.parseInt(br.readLine());
		int outputArr[] = removeElement(arr,Index);
		for(int i =0;i<outputArr.length;i++){
			System.out.print(outputArr[i]+" ");
		}
		System.out.println();


	}
	static int[] removeElement(int arr[] , int index){
		int outputArr[] = new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(i==index){
				continue;
			}
			outputArr[j++]=arr[i];



		}
		return outputArr;
}
}


