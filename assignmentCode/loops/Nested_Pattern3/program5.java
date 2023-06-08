class Pattern5{
	public static void main(String[] args){
		int num =10;
		for (int i=1;i<=4;i++){
			for (int j=1;j<=4-i+1;j++){
				System.out.print(num +" ");
			}
			System.out.println();
			num++;
		}
	}
}

