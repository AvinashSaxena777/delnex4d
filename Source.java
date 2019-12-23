import java.util.Scanner;
class Source{
	public static void main(String[] args){
		//String input = "hello welcome to java world";
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int i = 0;
		int len = input.length();
		String rev = "";
		int vowels = 0;
		int cons = 0;
		
		
		for(i=len-1; i>=0; i--){
			
			char ch = input.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
				vowels++;
			}
			else if((ch>=65 && ch <= 90) ||(ch >=97 && ch <= 122)){
				cons++;
			}
			rev += ch;
		}
		
		System.out.print(rev);
		System.out.print("the given string contains "+vowels+" vowels and "+cons+" consonants" );
		
	}
}