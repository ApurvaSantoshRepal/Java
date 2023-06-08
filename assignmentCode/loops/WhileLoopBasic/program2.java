//ite a program to print the factorial of given number 
//input :6
//optput : fctorial of 6 is 720




class Factorial{
	public static void main (String[] args){
	int num  = 6;
	int fact=1;
	int i =1;
	while(i<=num){
		if (num ==0 || num ==1){
			System.out.println(fact);
		}
		fact= fact * i;
		i++;
	}
	System.out.println(fact);
}
}

