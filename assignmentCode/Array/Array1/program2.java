//product of even number
//
import java.io.*;
class EvenProduct{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");
		int size = Integer.parseInt(br.readLine());
		int arr[] =new  int[size];
		int mul = 1;
		System.out.println("Enter array elements");
		for (int i= 0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				mul = mul*arr[i];
			}
		}
		System.out.println(mul);
	}
}


