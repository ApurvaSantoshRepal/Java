//gint an interger A which represent unit of electricity concumed at your house
//calculate and print the bill amount 
//units <= 100 : price per unit is 1
//unit >100 : price per unit is 2
//intput :50
//output 50
//input 200
//out[put 300
//explanation in 200 unit 200-100(first 100 units )
//100*1:first 100 units 
//100*2 : remaining unit
class ElectricityBill{
	public static void main(String[] args){
		int units = 300;
		if (units <= 100){
			System.out.println(units*1);
		}
		else{
			units = units -100;
			System.out.println(units*2+100);
		}
	}
}


