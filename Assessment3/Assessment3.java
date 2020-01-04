
public class Assessment3 {
	
	public static String reverseWord(String word) {
		char[] ch = word.toCharArray();
		int length = word.length();
		String revWord = "";
		for(int i=length-1; i>=0;i--) {
			revWord+=ch[i];
		}
		return revWord;
	}
	public static String reverseString(String sentence) {
		String[] words = sentence.split(" ");
		String reverseSentence ="";
		for(String x: words) {
			String revWord = Assessment3.reverseWord(x);
			reverseSentence += revWord+" ";
		}
		return reverseSentence;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "This is the world of java";
		String input2 = "Welcome to the world of java";
		System.out.println(reverseString(input1));
		System.out.println(reverseString(input2));
	}

}
