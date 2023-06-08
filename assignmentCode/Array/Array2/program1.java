//sum of all elements from the array//sum of all elements from the array


import java.io.*;
class Sum{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		int sum =0;
		for (int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}

