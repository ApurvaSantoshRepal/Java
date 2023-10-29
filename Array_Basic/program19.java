/*
19] Find common elements in three sorted arrays

Given three Sorted arrays in non-decreasing order, print all common elements in
these arrays.
Examples:
Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80
Input:
ar1[] = {1, 5, 5}
ar2[] = {3, 4, 5, 5, 10}
ar3[] = {5, 5, 10, 20}
*/


import java.io.*;
import java.util.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array1");
		int size1 = Integer.parseInt(br.readLine());
                System.out.println("Enter Elements in the array1");
		int arr1[]=new int[size1];
		for(int i = 0;i<size1;i++){

			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the size of array2");
		int size2 = Integer.parseInt(br.readLine());
                System.out.println("Enter Elements in the array2");
		int arr2[]=new int[size2];
		for(int i = 0;i<size2;i++){

			arr2[i]=Integer.parseInt(br.readLine());
		}
System.out.println("Enter the size of array3");
		int size3 = Integer.parseInt(br.readLine());
                System.out.println("Enter Elements in the array3");
		int arr3[]=new int[size3];
		for(int i = 0;i<size3;i++){

			arr3[i]=Integer.parseInt(br.readLine());
		}
		commonElement(arr1,arr2,arr3);


	}
	static void commonElement(int arr1[] , int arr2[],int arr3[]){
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				for(int k=0;k<arr3.length;k++){
					if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
						System.out.print("Common Element is : "+arr1[i]+" ");
					}
				}
			}
		}
		System.out.println();
	}
}

