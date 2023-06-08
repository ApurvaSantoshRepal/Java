//Write a program to check whether the number is palindrom or not
//Write a program to check whether the number is palindrom or not




class Palindrom{
	public static void main(String[] args ){
		int num = 123321;
		int temp = num ;
		int rev =0;
		while (num != 0){
			int rem = num %10;
			rev = rev*10+rem;
			num =num /10;
		}
		if (temp == rev){
			System.out.println(temp+ " is Palindrom number");
		}
		else{
			System.out.println(temp+ " is Palindrom number");
		}
	}
}

