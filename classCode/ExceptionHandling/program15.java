import java.io.*;
class Gmail{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char ch[] = str.toCharArray();
		boolean check = false;
		for (int i =0;i<ch.length; i++){
			if (ch[i]=='@'){
				check=true;
			}
		}try{

		if (check == false){
			throw new GmailVarification("Please include @ symbol");
		}
		
		else{
			System.out.println("Congratulation you include @ symbol");
		}
		}
		catch(GmailVarification gf){
			System.out.println("@ symbol is not included");
		}



	}
}
class GmailVarification extends RuntimeException {
	GmailVarification(String msg){
		super(msg);
	}
}
