import java.util.*;
class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int x  = sc.nextInt();
		try{
		if (x==0){
			throw new  ArithmeticException ("divide by 0 in not allowed");
		}
		System.out.println(10/x);
		}
		catch(ArithmeticException obj){
			System.out.println("Exception in thread " +Thread.currentThread().getName()+" ");
			obj.printStackTrace();
		}


	}
}

