// find out the number of even and odd integer from an array
// find out the number of even and odd integer from an array
import java.io.*;
class OddEven{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		int oddSum=0;
		int evenSum=0;
		for (int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if (arr[i]%2==0){
				evenSum = evenSum+arr[i];
			}
			else{
				oddSum=oddSum+arr[i];
			}
		}
		System.out.println("Odd Sum "+oddSum);
		System.out.println("Even sum "+evenSum);
	}
}

