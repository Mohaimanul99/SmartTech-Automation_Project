package strings;

public class CopyString {

	public static void main(String[] args) {
	
		String x = "Phone Number";  //String Variable 
		char y[] = x.toCharArray(); //Extrect the data from x to y
		int size = y.length; //Calculate the size of the array
		char a[] = new char[size]; //New array object 
		int i=0;
		while (i!=size) {
			a[i] = y[i];   //Copy the string
			++i; //Operation
		}
		System.out.println(y);
		System.out.println(a);
		
		

	}

}
