//wite a program to print the sum of all even numbers and multipication of odd numbers



class OddEven{
	public static void main(String[] args){
		int num = 123456;
		int sum =0;
		int mul = 1;
		while (num != 0){
			int rem = num %10;
			if (rem % 2==0){
				sum = sum + rem;
			}
			else{
				mul = mul * rem ;
			}
			num = num /10;
		}
		System.out.println("Sum of even numbers : "+ sum );
		System.out.println("Product of Odd numbers : "+ mul);

	}
}


