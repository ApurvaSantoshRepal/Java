//Write a program to count the digits of given number 
//Write a program to count the digits of given number 
class DigitsCount{
	public static void main(String[] args){
		int num = 123456;
		int count =0;
		while (num != 0){
			int rem =num %10;
			count++;
			num = num /10;
				}

		System.out.println(count);
			}
		}

