import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args)
    {
    	// Instantiates a new BST object as bst
    	BST bst = new BST();
    	// file used to read all values
    	File file = new File("Numbers");
    	
    	try {
    		//Scanner class to read the file
			Scanner scan = new Scanner(file);
			
			// Loop that goes through the lines of the file
			while(scan.hasNextLine())
	    	{
				// Saves line data into a String data variable
	    		String data = scan.nextLine();
	    		
	    		// calls the insert function and parses the data as a integer
	    		bst.insert(Integer.parseInt(data));
	    	}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: reading File");
			e.printStackTrace();
		}
 
    	// calls the inorder function
        bst.inorder();
        bst.callSearch(1);
        bst.callSearch(23);
        bst.callSearch(203);
    }
}
