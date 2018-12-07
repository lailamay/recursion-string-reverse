import java.util.Scanner;
public class Recursion {
	
	//This program accepts input of a string from console
	// and reverses it using recursion
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        String inputStr;
        System.out.println("Enter the string to reverse");
        inputStr = keyboard.nextLine();
        System.out.println(reverse(inputStr));
        
    }
		
	
	
	public static String reverse(String str) {
		//terminating condition or base case
		if(str == null || str.length() <= 1) {
			return str;
		}
		//recursive case
		return reverse(str.substring(1)) + str.charAt(0);
		
	}

}
