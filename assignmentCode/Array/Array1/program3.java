
import java.io.*;
class OddIndex{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		int mul = 1;
		for(int i =0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2!=0){
			mul = mul * arr[i];
			}
		}
	System.out.println(mul);
	}
}


