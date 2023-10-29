/*
4] Product of array elements

This is a functional problem. Your task is to return the product of array elements
under a given modulo.
The modulo operation finds the remainder after the division of one number by
another. For example, K(mod(m))=K%m= remainder obtained when K is divided
by m
Example 1:
Input:
1
4
1 2 3 4
Output:
24
Input:
The first line of input contains T denoting the number of test cases. Then each of
the T lines contains a single positive integer N denotes the number of elements in
the array. The next line contains 'N' integer elements of the array.

Output:
Return the product of array elements under a given modulo.
That is, return (Array[0]*Array[1]*Array[2]...*Array[n])%modulo.
Constraints:
1<=T<=200
1<=N<=10^5
1<=ar[i]<=10^5
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
		System.out.println("Product: "+product(arr));
		

	}
	static int product(int arr[] ){
		int mul = 1;
		for(int i=0;i<arr.length;i++){
			mul=mul*arr[i];
		}
		return mul;
	}
}

