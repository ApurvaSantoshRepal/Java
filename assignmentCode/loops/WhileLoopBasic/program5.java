//Write a program to print the square of even digit of the given number 
//Write a program to print the square of even digit of the given number 
class EvenDigitSquare{
	public static void main(String[] args){
		int num = 123456;
		while (num != 0){
			int rem = num %10;
			if (rem %2==0){
				int sqr = rem * rem;
				System.out.println(sqr);
			}
			num =num /10;
		}
	}
}

