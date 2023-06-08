//given the temp of a person in farenheit print whether the person has high normal or low temp
//  >98.6 ==> high 
//  98.0<= and <= 98.6 ==> normal 
//  98.0
//
//  you can solve this proble  without && 


class Temp

{
	public static void main(String[] args){
		float temp = 98.35f;
		if (temp>98.6f){
			System.out.println("high");

		}
		else if (98.0f<=temp && temp<=98.6f){
			System.out.println("normal");
		}
		else{
			System.out.println("low");
		}
	}

}
