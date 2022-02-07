package strings;

public class ReverseString {

	public static void main(String[] args) {
	
			String x = "1,2,3,4";  //String Variable First 
			char y[] = x.toCharArray(); //Extract the data from x to y
			int size = y.length; //Calculate the size of the array
			char a[] = new char[size]; //New array object 
			int i=0;
			while (i!=size) {            //while loop
			//	a[i] = y[i];   //Copy the string
				
				a[size-1-i] = y[i];   //Reverse the string
				
				++i; //Operation
			}
			//System.out.println(y);
			System.out.println(a);

		

	}

}
