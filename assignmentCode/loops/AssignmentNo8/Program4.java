//wap  to take a number and print whether that is prime or not
//
import java.io.*;
class PrimeNo{
       static void primeNo(int N){
	       int count =0;
	       for (int i=1;i<N;i++){
		       if (N%i==0){
			       count++;
		       }
	       }
	       if (count>2){
		       System.out.println(N+" is not prime Number");
	       }
	       else{
		       System.out.println(N+" is prime Number");
	       }




       }
       public static void main(String[] args)throws IOException {
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       System.out.println("Enter the number");
	       int num = Integer.parseInt(br.readLine());
	       primeNo(num);





       }







}
