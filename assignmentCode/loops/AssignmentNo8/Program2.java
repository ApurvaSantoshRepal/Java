//wap to print the addition of 1 to 10 with  10 to1
//output:
//1+10=11
//2+9=11.....
//10+1=11
//9+2=11........
import java.io.*;
class Sum{
	
	public static void main(String[] args )throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int [size];
		for (int i=0;i<arr.length;i++){
			arr[i]=i+1;
		}
		for (int i =0;i<arr.length;i++){
		       System.out.println(arr[i]+"+"+arr[size-1-i]+"="+(arr[i]+arr[size-1-i]));
		}
                for (int i=0;i<arr.length;i++){
			System.out.println(arr[arr.length-1-i]+"+"+arr[i]+"="+(arr[arr.length-1-i]+arr[i]));
		}		

	}
}

