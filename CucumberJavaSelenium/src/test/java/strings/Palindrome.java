package strings;

public class Palindrome {

	public static void main(String[] args) {
		
		String x = "mom";  //String Variable 
		char y[] = x.toCharArray(); //Extrect the data from x to y
		int size = y.length; //Calculate the size of the array
		char a[] = new char[size]; //New array object 
		int i=0;
		while (i!=size) {
		//	a[i] = y[i];   //Copy the string
			
			a[size-1-i] = y[i];   //Reverse the string
			
			++i; //Operation
		}
		
		i=0;
		while(i!=size) {
			if (a[i]!=y[i]) {
				System.out.println("Not A Palindrome");
			}
			
			else {
				++i;
				continue;
			}
					
		}
		
		System.out.println("It is a Palindrome");


	}

}
