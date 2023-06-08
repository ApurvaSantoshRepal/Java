//write a program to print the countdown of days to submit the assignment 
//input 7
//output 
//7 days remaining 
//6 days remaining
//
//.....
//1day remaings 
//0 days assignment is overdue 
//write a program to print the countdown of days to submit the assignment 
//input 7
//output 
//7 days remaining 
//6 days remaining
//
//.....
//1day remaings 
//0 days assignment is overdue 




class Assignment{
	public static void main(String[] args){
		int day = 7;
		while(day>=0){
			if (day >=1){
				System.out.println(day+ " day remaing");
			}
			else{
				System.out.println(day + " day assignment is overdue");
			}
			day--;

		}
	}
}

			
