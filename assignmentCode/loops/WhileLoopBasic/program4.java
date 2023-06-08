//Write a program to count the odd didits from the given number 
//Write a program to count the odd didits from the given number 



class OddDigits {
	public static void main(String[] args){
		int count=0;
		int num = 211356;
		while (num != 0){
			int rem = num %10;
			if (rem %2 !=0){
				count++;
			}
			num = num /10;
		
		}
		System.out.println(count);
	}
}



