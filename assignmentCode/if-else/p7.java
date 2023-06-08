//write a program tha takes the cost price and selling price and calculate its profit or loss 
//write a program tha takes the cost price and selling price and calculate its profit or loss 



class ProfitLoss{
	public static void main(String[] args ){
		int costPrice= 20563;
		int sellingPrice = 32145;
		if (sellingPrice > costPrice){
			System.out.println("profit is "+(sellingPrice-costPrice));
		}
		else if (sellingPrice < costPrice){
			System.out.println("loss is "+(costPrice-sellingPrice));
		}
		else{
			System.out.println("no profit no loss");
		}
	}
}



