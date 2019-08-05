package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String r = "";
			for (int i = s.length() - 1; i >= 0; i--)
			{
				r+=s.charAt(i);
			}
			System.out.println(r);
		} , "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String r = "";
			for (int i = 0; i < s.length(); i++)
			{
				r += (i%2 == 0) ? s.toUpperCase().charAt(i) : s.toLowerCase().charAt(i);
			}
			System.out.println(r);
		}, "upperlowermix");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String r = "" + s.charAt(0);
			for(int i = 1; i < s.length(); i++) {
				r+="." + s.charAt(i);
			}
			System.out.println(r);
		}, "periods");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			System.out.println(s.replaceAll("[aeiou]", ""));
		}, "no vowels anymore");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
