/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		//// Replace the followaing statement with your code
		int mid = s.length() / 2;
		for(int i=0; i< mid;){
			if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
			else return isPalindrome(s.substring(i++ , i--));
		}
		return true;
    }
}