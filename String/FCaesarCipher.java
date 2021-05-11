import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String string, int key) {
   char[] letters=new char[string.length()];
		int shift=key%26;
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0; i<string.length(); i++){
			letters[i] = shifter(string.charAt(i),alphabets,shift);			
		}
		return new String(letters);
	}
	
	public static char shifter(char letter, String alphabets, int shift){
		int Idx=alphabets.indexOf(letter)+shift;
		return alphabets.charAt(Idx % 26);
	}
}
