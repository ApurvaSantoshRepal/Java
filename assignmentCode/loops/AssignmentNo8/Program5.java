//wap to print all even numper in reverse order and odd number in standard way . Both separately . Within a range 
//
import java.io.*;


class Order{

	static void orderOfNumber(int s , int e){
		for (int i=s;i<=e;i++){
			if (i%2!=0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		for(int j=e;j>=s;j--){
			if (j%2==0){
				System.out.print(j+" ");
			}
		}
		System.out.println();




	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start=Integer.parseInt(br.readLine());
		int end= Integer.parseInt(br.readLine());
		orderOfNumber(start , end);
	}




}
