import java.io.*;
class CompareToDemo{
	static int  myCompareTo(String str1, String str2){
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
	        if (arr1.length==arr2.length){
			for (int i=0;i<arr1.length;i++){
				if (arr1[i]!=arr2[i]){
					return arr1[i]-arr2[i];
				}
			}
			return 0;
		}
		else{
			return arr1.length-arr2.length;
		}
	}
	




     
	public static void main(String[] args )throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2= br.readLine();
		int Diff = myCompareTo(str1,str2);
		System.out.println(Diff);
	}
}
