//wap to find sum of nummer that are not divisibal by 3upto given no
import java.io.*;
class Sum{
	static int sumOfNumbers(int arr[] , int N){
		int sum =0;
		for (int i=0;i<N;i++){
			if (arr[i]%3!=0){
				sum=sum+arr[i];
			}
		}
		return sum;
	}

	


	public static void main(String[] args)throws IOException{
       		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the size of Array:=");
		 int size = Integer.parseInt(br.readLine());
	 	 int arr[]=new int[size];
		 for(int i=0;i<arr.length;i++){
			arr[i]=i+1;
		 }
		 int Sum = sumOfNumbers(arr , size);
	 	 System.out.println(Sum);

	
	}
}
