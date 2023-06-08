//write a program if number is even the print the number in reverse order  if number is odd print that number in reverse order by difference of 2
//write a program if number is even the print the number in reverse order  if number is odd print that number in reverse order by difference of 2



class OddEven{
	public static void main(String[] args){
		int num = 7;
		if (num %2 ==0){
			int i = num;
			while (num >=1){
				System.out.println(num);
				num = num -1;
			}
		}
		else{
			int i = num ;
			while (num>=1){
				System.out.println(num);
				num = num -2;
			}
		}
	}
}



