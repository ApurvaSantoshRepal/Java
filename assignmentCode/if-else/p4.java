//write a program that check a number from 0 to 5 and print its spelling if the number is less than 5 the print the number is greter than 5



class Number {
	public static void main(String[] args ){
		int num = 4;
		if (num == 1){
			System.out.println("One");
		}
		else if (num ==2){
			System.out.println("Two");
		}
		else if (num==3){
			System.out.println("three");
		}
		else if (num ==4){
			System.out.println("Four");
		}
		else if (num ==5){
			System.out.println("Five");
		}
		else if (num >5 ){
			System.out.println(num + " is greater than 5");
		}
		else{
			System.out.println("invalid input");
		}
	}
}

