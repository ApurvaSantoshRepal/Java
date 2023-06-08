

import java.io.*;

class ArrayDemo{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size= Integre.parseInt(br.readLine());
		int arr[]=new int[size];
		for (int i=0;i<size;i++){
			arr[i]=Integer.pareInt(br.readLine());
		}
		for (int i =0;i<size;i++){
			System.out.println(arr[i]);
			}


	}

}
