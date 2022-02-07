package strings;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
	
		
		String love = "I love my Mom";   //Create String Variable
		String mother[] = love.split(" ");  // Divided the String by Split Method using Array
		System.out.println(Arrays.toString(mother)); // Use Arrays Class to Covert the string in to One Char or int
		

	}

}
