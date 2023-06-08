//write a program , in which according to months number print numbers of days in month
//write a program , in which according to months number print numbers of days in month
class Months {
	public static void main(String[] args ){
		int monthNumber = 4;
		if (monthNumber ==1){
			System.out.println("jan has 31 days ");
		}
		else if (monthNumber ==2){
			System.out.println("Feb has 28 or 29 days ");
		}
		else if (monthNumber ==3 ){
			System.out.println(" March has 31 days ");
		}
		else if (monthNumber ==4){
			System.out.println(" April has 30 days ");
		}
		else if (monthNumber ==5){
			System.out.println(" May has 31 days ");
		}
		else if (monthNumber ==6){
			System.out.println(" June has 30 days ");
		}
		else if (monthNumber ==7){
			System.out.println(" July has 31 days ");
		}
		else if (monthNumber==8){
			System.out.println(" Aug has 31 days ");
		}
		else if (monthNumber==9){
			System.out.println(" Sep has 30");
		}
		else if (monthNumber==10){
			System.out.println(" Oct has 31 days ");
		}
		else if (monthNumber==11){
			System.out.println(" Nov has 30 days");
		}
		else if (monthNumber==12){
			System.out.println(" Dec has 31 days ");
		}
		else {
			System.out.println(" Invalid input");
		}
	}
}

